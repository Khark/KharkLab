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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.studio7707.DTO.ReplyVO;
import com.studio7707.service.ReplyService;

@Controller
@RequestMapping("/reply/*")
public class ReplyController {

	private static final Logger logger = LoggerFactory.getLogger(ReplyController.class);
	
	@Inject
	ReplyService replyService;

	@RequestMapping(value ="insertReply", method = RequestMethod.POST)
	public @ResponseBody void replyInsert(ReplyVO vo) throws Exception {
		System.out.println("replyInsert"+ vo);
		replyService.writeReply(vo);
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView replyList(@RequestParam int bno) throws Exception{
		System.out.println("reply List");
		int replyCount;
		
		ModelAndView mav = new ModelAndView();
		List<ReplyVO> replyList = null;
		replyList = replyService.replyList(bno);
		replyCount = replyService.countReply(bno);
		System.out.println("replyListController_ replyList : "+replyList);
		System.out.println("replyListController_ replyCount : "+replyCount);
		mav.setViewName("reply/insert");
		mav.addObject("replyCount", replyCount);
		mav.addObject("list", replyList);
		System.out.println("MAVMAVAMVAMVAMVAMVAVMAM:"+mav);
		return mav;
	}

	
}
