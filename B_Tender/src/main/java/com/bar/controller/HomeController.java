package com.bar.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	String driver = "org.mariadb.jdbc.Driver";
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(
					"jdbc:mariadb://mariadb.c3tc2v9lue19.ap-northeast-2.rds.amazonaws.com:3306/mariaDB", "admin",
					"12345678");
			if (con != null) {
				System.out.println("접속성공");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB접속실패");
			e.printStackTrace();
		}

		return "home";
	}
	@RequestMapping(value="/1")
	public String page1() {
		System.out.println("1");
		return "1";
	}
	@RequestMapping(value="/2")
	public String page2() {
		System.out.println("2");
		return "2";
	}
	@RequestMapping(value="/3")
	public String page3() {
		System.out.println("3");

		return "3";
	}
	@RequestMapping(value="/4")
	public String page4() {
		System.out.println("4");

		return "4";
	}
	@RequestMapping(value="/5")
	public String page5() {
		System.out.println("5");

		return "5";
	}
	@RequestMapping(value="/6")
	public String page6() {
		System.out.println("6");

		return "6";
	}
	

}
