package com.sishuok.es.monitor.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.sishuok.es.common.web.controller.BaseController;

/**
 * @author asus
 *
 */
@Controller
@RequestMapping("/admin/monitor/endpointDoc")
public class EndpointDocController extends BaseController{
	private final RequestMappingHandlerMapping handlerMapping;

	@Autowired
	public EndpointDocController(RequestMappingHandlerMapping handlerMapping) {
		this.handlerMapping = handlerMapping;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String show(Model model) {
		RequestMappingInfo key;
		HandlerMethod value;
		
//		hm.getMethod();
		model.addAttribute("handlerMethods", this.handlerMapping.getHandlerMethods());
		return viewName("index");
	}
}