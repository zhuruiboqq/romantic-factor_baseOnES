/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.basedata.web.controller;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sishuok.es.basedata.entity.AttachmentImageInfo;
import com.sishuok.es.basedata.service.AttachmentImageService;
import com.sishuok.es.common.entity.enums.BooleanEnum;
import com.sishuok.es.common.utils.LogUtils;
import com.sishuok.es.common.utils.MessageUtils;
import com.sishuok.es.common.utils.image.CompressPic;
import com.sishuok.es.common.web.entity.AjaxUploadResponse;
import com.sishuok.es.common.web.upload.FileUploadUtils;
import com.sishuok.es.common.web.upload.FileUtil;
import com.sishuok.es.common.web.upload.exception.FileNameLengthLimitExceededException;
import com.sishuok.es.common.web.upload.exception.InvalidExtensionException;
import com.sishuok.es.core.common.DataStatusEnum;
import com.sishuok.es.core.web.controller.BaseDataController;
import com.sishuok.es.showcase.sample.entity.Sex;

/**
 * <p>
 * User: Zhang Kaitao
 * <p>
 * Date: 13-1-28 下午4:29
 * <p>
 * Version: 1.0
 */
@Controller
@RequestMapping(value = "/basedata/attachmentImage")
public class AttachmentImageController<M extends AttachmentImageInfo> extends BaseDataController<M> {
	//最大上传大小 字节为单位
	private long maxSize = FileUploadUtils.DEFAULT_MAX_SIZE;
	//允许的文件内容类型
	private String[] allowedExtension = FileUploadUtils.DEFAULT_ALLOWED_EXTENSION;
	//文件上传下载的父目录
	private String baseDir = FileUploadUtils.getDefaultBaseDir() + File.separator + "img";

	private AttachmentImageService<M> getBizService() {
		return (AttachmentImageService<M>) baseService;
	}

	public AttachmentImageController() {
		setResourceIdentity("basedata:attachmentImage");
	}

	@Override
	protected void setCommonData(Model model) {
		super.setCommonData(model);
	}

	/**
	 * @param request
	 * @param files
	 * @return
	 */
	@RequestMapping(value = "ajaxUpload", method = RequestMethod.POST)
	@ResponseBody
	public AjaxUploadResponse ajaxUpload(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "files[]", required = false) MultipartFile[] files) {
		System.out.println(request.getParameter("artist") + " " + request.getParameter("artist.id"));
		//The file upload plugin makes use of an Iframe Transport module for browsers like Microsoft Internet Explorer and Opera, which do not yet support XMLHTTPRequest file uploads.
		response.setContentType("text/plain");

		AjaxUploadResponseEx ajaxUploadResponse = new AjaxUploadResponseEx();

		if (ArrayUtils.isEmpty(files)) {
			return ajaxUploadResponse;
		}

		for (MultipartFile file : files) {
			String filename = file.getOriginalFilename();
			long size = file.getSize();
			try {
				String url = FileUploadUtils.upload(request, baseDir, file, allowedExtension, maxSize, true);
				File desc = FileUploadUtils.getAbsoluteFile(FileUploadUtils.extractUploadDir(request), url);
				//				String deleteURL = "/ajaxUpload/delete?filename=" + URLEncoder.encode(url, Constants.ENCODING);
				//				if (ImagesUtils.isImage(filename)) {
				//					ajaxUploadResponse.add(filename, size, url, url, deleteURL);
				//				} else {
				//					ajaxUploadResponse.add(filename, size, url, deleteURL);
				//				}
				// 自动转换小图
				M m = this.newModel();
				m.setDataStatus(DataStatusEnum.disable);
				m.setDisplayURL(url.replace("\\", "/"));
				m.setExtName(FilenameUtils.getExtension(file.getOriginalFilename()));
				m.setName(filename);
				m.setNumber(desc.getName());
				m.setSizeInByte(size);
				m.setSize(FileUtil.getFileLength(size));
				m.setStorePath(desc.getAbsolutePath());

				reduceImg(m);

				getBizService().save(m);
				ajaxUploadResponse.add(m);
				continue;
			} catch (IOException e) {
				LogUtils.logError("file upload error", e);
				ajaxUploadResponse.add(filename, size, MessageUtils.message("upload.server.error"));
				continue;
			} catch (InvalidExtensionException e) {
				ajaxUploadResponse.add(filename, size, MessageUtils.message("upload.not.allow.extension"));
				continue;
			} catch (FileUploadBase.FileSizeLimitExceededException e) {
				ajaxUploadResponse.add(filename, size, MessageUtils.message("upload.exceed.maxSize"));
				continue;
			} catch (FileNameLengthLimitExceededException e) {
				ajaxUploadResponse.add(filename, size, MessageUtils.message("upload.filename.exceed.length"));
				continue;
			}
		}
		return ajaxUploadResponse;
	}

	public void reduceImg(AttachmentImageInfo m) {
		try {
			File srcfile = new File(m.getStorePath());
			if (!srcfile.exists()) {
				return;
			}

			String smallFilePath = getReduceFileName(m.getStorePath(), "_s");
			String smallDisplayURL = getReduceFileName(m.getDisplayURL(), "_s");
			m.setStoreSmallPath(smallFilePath);
			m.setDisplaySmallURL(smallDisplayURL);

			Image src = javax.imageio.ImageIO.read(srcfile);
			int srcWidth = src.getWidth(null);
			int srcHeight = src.getHeight(null);
			m.setWidth(srcWidth);
			m.setHeight(srcHeight);
			CompressPic compressPic = new CompressPic();
			if (srcWidth >= srcHeight) {
				compressPic.setWidthAndHeight(AttachmentImageConstant.ImageSize.Artist_Works_Max_Width.x,
						AttachmentImageConstant.ImageSize.Artist_Works_Max_Width.y);
			} else {
				compressPic.setWidthAndHeight(AttachmentImageConstant.ImageSize.Artist_Works_Max_Height.x,
						AttachmentImageConstant.ImageSize.Artist_Works_Max_Height.y);
			}
			compressPic.setInputFileName(m.getStorePath());
			compressPic.setOutputFileName(smallFilePath);
			compressPic.compressPic();

			//			BufferedImage tag = new BufferedImage((int) w, (int) h, BufferedImage.TYPE_INT_RGB);
			//
			//			tag.getGraphics().drawImage(src.getScaledInstance(w, h, Image.SCALE_SMOOTH), 0, 0, null);
			//			FileOutputStream out = new FileOutputStream(imgdist);
			//			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
			//			encoder.encode(tag);
			//			out.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private String getReduceFileName(String srcFilePath, String markStr) {
		String smallFilePath = srcFilePath;
		int index = smallFilePath.lastIndexOf(".");
		if (index != -1 && smallFilePath.length() != index + 1) {
			smallFilePath = smallFilePath.substring(0, index) + markStr + smallFilePath.substring(index);
		} else {
			smallFilePath += markStr;
		}
		return smallFilePath;
	}
}