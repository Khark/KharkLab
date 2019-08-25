package com.studio7707.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // 컨트롤러임을 명시

@RequestMapping(value = "/") // 주소 패턴

public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("Hello");
		return "home";
	}
}
