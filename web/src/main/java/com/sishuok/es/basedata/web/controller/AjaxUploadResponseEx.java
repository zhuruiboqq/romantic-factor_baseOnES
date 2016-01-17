package com.sishuok.es.basedata.web.controller;

import com.sishuok.es.basedata.entity.AttachmentImageInfo;
import com.sishuok.es.common.web.entity.AjaxUploadResponse;
import com.sishuok.es.common.web.entity.FileMeta;

public class AjaxUploadResponseEx extends AjaxUploadResponse {

	public void add(AttachmentImageInfo m) {
		FileMeta fileMeta = new FileMeta(m.getId(), m.getName(), m.getSizeInByte(), m.getDisplayURL(), m.getDisplaySmallURL(),
				"/basedata/attachmentImage/" + m.getId() + "/delete");
		getFiles().add(fileMeta);
	}
}