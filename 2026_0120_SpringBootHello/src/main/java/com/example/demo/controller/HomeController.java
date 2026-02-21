package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.PersonVo;

@Controller
public class HomeController {
	
  public HomeController() {
	// TODO Auto-generated constructor stub
	  System.out.println("--HomeController()--");
  }
  
  // /
  @RequestMapping("/")
  @ResponseBody
  public String home() {
	  
	  PersonVo p = new PersonVo();
	  
	  p.setName("유서윤");
	  p.setAge(34);
	  p.setTel("010-2296-9038");
	  
	  System.out.println(p);
	  
	  PersonVo p1 = new PersonVo("이길동",30,"010-111-1234");
	  System.out.println(p1);
	  return "Welcome to My Home";
  }
  
  // /hello.do
  @RequestMapping("/hello.do")
  @ResponseBody
  public String hello() {
	  
	  return "Hi~ Hello!!";
  }
  
  
}
