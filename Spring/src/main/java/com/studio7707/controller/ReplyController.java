package com.studio7707.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.junit.runner.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.studio7707.DTO.ReplyVO;
import com.studio7707.service.ReplyService;

@Controller
@RequestMapping("/board/*")
public class ReplyController {

	private static final Logger logger = LoggerFactory.getLogger(ReplyController.class);
	
	@Inject
	ReplyService replyService;
	
	@RequestMapping(value = "replyList", method = RequestMethod.GET)
	public ModelAndView replyList(HttpServletRequest request) throws Exception{
		int bno = Integer.parseInt(request.getParameter("bno"));
		List<ReplyVO> replyList = null;
		replyList =(List<ReplyVO>) replyService.listAll(bno);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/board/replyList");
		mav.addObject("list", replyList);
		return mav;
	}
}
