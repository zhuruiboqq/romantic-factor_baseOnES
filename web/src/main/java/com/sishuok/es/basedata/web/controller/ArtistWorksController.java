/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.basedata.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sishuok.es.basedata.entity.ArtistWorksInfo;
import com.sishuok.es.basedata.service.ArtistWorksService;
import com.sishuok.es.common.Constants;
import com.sishuok.es.core.web.controller.CoreEntryController;

/**
 * <p>
 * User: Zhang Kaitao
 * <p>
 * Date: 13-1-28 下午4:29
 * <p>
 * Version: 1.0
 */
@Controller
@RequestMapping(value = "/basedata/artistWorks")
@SuppressWarnings("unchecked")
public class ArtistWorksController<M extends ArtistWorksInfo> extends CoreEntryController<M> {

	private ArtistWorksService<M> getBizService() {
		return (ArtistWorksService<M>) baseService;
	}

	public ArtistWorksController() {
		setResourceIdentity("basedata:artistWorks");
	}

	@RequestMapping(value = "ajaxUpload", method = RequestMethod.GET)
	public String showCreateForm(Model model) {
		super.showCreateForm(model);
		return "basedata/artistWorks/uploadForm";
	}

	//	@RequestMapping(value = "create/discard", method = RequestMethod.POST)
	//	@Override
	//	public String create(Model model, @Valid @ModelAttribute("m") M m, BindingResult result, RedirectAttributes redirectAttributes) {
	//		//作废原来新增的路径
	//		result.
	//		return super.create(model, m, result, redirectAttributes);
	////		throw new RuntimeException("discarded method");
	//	}
	@RequestMapping(value = "create/discard", method = RequestMethod.POST)
	@Override
	public String create(Model model, @Valid @ModelAttribute("m") ArtistWorksInfo m, BindingResult result, RedirectAttributes redirectAttributes) {
		throw new RuntimeException("discarded method");
	}

	@RequestMapping(value = "{id}/update/discard", method = RequestMethod.POST)
	@Override
	public String update(Model model, @Valid @ModelAttribute("m") M m, BindingResult result,
			@RequestParam(value = Constants.BACK_URL, required = false) String backURL, RedirectAttributes redirectAttributes) {

		throw new RuntimeException("discarded method");
	}

	@RequestMapping(value = "ajaxUpload", method = RequestMethod.POST)
	public String createWithResourcePermission(Model model, @Valid @ModelAttribute("m") M m, BindingResult result,
			@RequestParam("workID") Long[] workIDs, RedirectAttributes redirectAttributes) {
		System.out.println(workIDs.length + " " + workIDs);
		//		fillResourcePermission(m, resourceIds, permissionIds);
		try {
			for (Long workID : workIDs) {
				M tempM = (M) m.createCopy();
				tempM.getWork().setId(workID);
				getBizService().save(tempM);
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		redirectAttributes.addFlashAttribute(Constants.MESSAGE, "新增成功");
		return redirectToUrl(null);
	}
}