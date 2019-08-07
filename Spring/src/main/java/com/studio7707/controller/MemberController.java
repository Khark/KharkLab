package com.studio7707.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.studio7707.DTO.MemberVO;
import com.studio7707.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	MemberService memberService;

	@RequestMapping(value = "write", method = RequestMethod.GET)
	public String memberWirte() {
		logger.info("joinForm");
		return "member/write";// 회원가입폼으로 가기위함
	}

	@RequestMapping(value = "join", method = RequestMethod.POST) // 입력폼에서 입력을 받은 정보로 서비스 실행
	// 회원 정보 입력 폼에서의 이동
	public String memberJoin(@ModelAttribute MemberVO vo) throws Exception {
		// 회원 가입기능 실행
		logger.info("MemberController.memberJoin:" + vo);
		memberService.joinMember(vo);

		// 회원가입을 완료하면 Home으로
		return "home";
	}

	@RequestMapping(value = "/loginTry", method = RequestMethod.POST)
	public String memberLogin(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		logger.info("loginController");
		HttpSession session = req.getSession();

		MemberVO login = memberService.loginMember(vo);
		
		if(login == null) {
			session.setAttribute("member", null);
			
			// setAttribute ? :
			rttr.addFlashAttribute("msg", false);
			// addFlashAttribute ? : 
		}else {
			session.setAttribute("member", login);
		}
		
		return "home";
	}

}
