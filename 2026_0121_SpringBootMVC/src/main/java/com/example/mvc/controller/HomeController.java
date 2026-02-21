package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
		System.out.println("--HomeController()--");
	}
	

@RequestMapping("/")
public String home(HttpServletRequest request) {
	
	String ip = request.getRemoteAddr();
	System.out.println(ip);
	
	return "home"; 	//ViewName만 설정
					//Spring이 View Resolver에서 앞/뒤 붙여서 forward 지시
	
	}

	@RequestMapping("/member/list.do")
	public String list() {
	
		return "member/member_list";
	
	}
	

}

