package com.studio7707.controller;

import java.lang.annotation.Annotation;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.studio7707.DTO.MemberVO;
import com.studio7707.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Inject
	MemberService memberService;

	@RequestMapping(value = "write", method = RequestMethod.GET)
	public String memberWirte() {
		return "member/write";// 회원가입폼으로 가기위함
	}

	@RequestMapping(value = "join", method = RequestMethod.POST) // 입력폼에서 입력을 받은 정보로 서비스 실행
	// 회원 정보 입력 폼에서의 이동
	public String memberJoin(@ModelAttribute MemberVO vo) throws Exception {
		// 회원 가입기능 실행
		System.out.println("MemberController.memberJoin:" +vo );
		memberService.joinMember(vo);

		// 회원가입을 완료하면 Home으로
		return "home";
	}
	

}
