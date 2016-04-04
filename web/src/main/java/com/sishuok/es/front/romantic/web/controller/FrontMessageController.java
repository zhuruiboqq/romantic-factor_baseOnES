package com.sishuok.es.front.romantic.web.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONUtils;
import com.sishuok.es.basedata.entity.CommentInfo;
import com.sishuok.es.basedata.service.CommentService;

@Controller
@RequestMapping(value = "/front")
public class FrontMessageController {
	private static Logger logger = LoggerFactory.getLogger(FrontMessageController.class);

	@Autowired
	private CommentService<CommentInfo> commentService;

	//	@RequestMapping(value = "/wedding/liuyan.do")
	//	 public String getMessage(HttpServletRequest request,HttpServletResponse resp,Model model) {
	//	        //Map<String, Object> resultMap = new HashMap<String, Object>();
	//			//ModelAndView modelAndView=new ModelAndView();
	//			
	//	        
	//	        //Message message = new Message("admin",new Date(),"sdfsd","odkjf");
	//	        
	//	        
	//	      //  messageService.addMessage(message);
	//	        List<Message> list = messageService.getAllMessage("test1", "admin");
	//	        //modelAndView.addObject("messagelist", list);
	//	       // modelAndView.setViewName("reg");
	//	        model.addAttribute("messagelist", list);
	//	        return "wedding/liuyan";
	//
	//	    }

	@RequestMapping(value = "/addMessage.do", method = RequestMethod.POST)
	public @ResponseBody String addMessage(BindingResult result, @ModelAttribute CommentInfo message) {
		JsonResult status = checkMessage(message);
		commentService.save(message);
		String result2 = JSONUtils.toJSONString(status);
		//		resp.setCharacterEncoding("utf-8");
		//		resp.getWriter().write(result);
		//		resp.getWriter().close();
		return result2;
	}

	@RequestMapping(value = "/addMessage.do", method = RequestMethod.GET)
	public @ResponseBody String addMessage(HttpServletRequest request, HttpServletResponse resp, @RequestParam("name") String name,
			@RequestParam("qqNum") String qqNum, @RequestParam("telPhone") String telPhone, @RequestParam("email") String email,
			@RequestParam("address") String address, @RequestParam("suggestion") String suggestion, Model model) throws ServletException, IOException {
		CommentInfo message = new CommentInfo();
		message.setAddress(address);
		message.setCreateTime(new Date());
		message.setEmail(email);
		message.setName(name);
		message.setQq(qqNum);
		message.setSuggestion(suggestion);
		message.setTelephone(telPhone);
		JsonResult status = checkMessage(message);
		commentService.save(message);
		String result = JSONUtils.toJSONString(status);
		//		resp.setCharacterEncoding("utf-8");
		//		resp.getWriter().write(result);
		//		resp.getWriter().close();
		return result;
	}

	private JsonResult checkMessage(CommentInfo message) {
		JsonResult status = new JsonResult();
		if (message == null) {
			status.setCode(0);
			status.setMessage("message 不能为空!");
			return status;
		}
		//		if (!PatternUtil.isEmail(message.getEmail())) {
		//			status.setCode(0);
		//			status.setMessage("Email格式不对");
		//			return status;
		//		} else 
		if (!StringUtils.isNumeric(message.getQq())) {
			status.setCode(0);
			status.setMessage("qq号码格式不对");
			return status;
		} else if (!StringUtils.isNumeric(message.getTelephone())) {
			status.setCode(0);
			status.setMessage("电话号码格式不对");
			return status;
		}

		status.setCode(1);
		status.setStatus(true);
		status.setMessage("success!");
		return status;

	}

}
