package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.PersonVo;


@Controller
public class paramController {

	// /insert1.do?name=일길동&age=20&tel=010-111-1234
	@RequestMapping("/insert1.do")
	@ResponseBody
	public String insert1(
						@RequestParam("name") String irum, 
						int age, // Integer.parseInt(request.getParameter("age"))
						String tel) {
		
		PersonVo p = new PersonVo(irum, age, tel);
		
		System.out.println("------insert1.do의 결과------");
		System.out.println(p);
		
		return "insert1.do의 처리결과";
	}
	
	

	// /insert2.do?name=일길동&age=20&tel=010-111-1234
	@RequestMapping("/insert2.do")
	@ResponseBody
	public String insert2(PersonVo vo) {
		// method 인자 : Spring 에 대한 요구사항
		
		System.out.println("------insert2.do의 결과------");
		System.out.println(vo);
		
		return "insert2.do의 처리결과";
	}
	
	// /insert3.do?name=일길동&age=20&tel=010-111-1234
	@RequestMapping("/insert3.do")
	@ResponseBody
	public String insert3 (@RequestParam Map map) {
		// method 인자 : Spring 에 대한 요구사항
		
		System.out.println("------insert3.do의 결과------");
		System.out.println(map);
		
		return "insert3.do의 처리결과";

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
