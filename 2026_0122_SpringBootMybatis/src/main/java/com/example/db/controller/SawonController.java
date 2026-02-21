package com.example.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.db.dao.SawonDao;
import com.example.db.vo.SawonVo;
@Controller
public class SawonController {

	//자동연결
	@Autowired
	SawonDao sawonDao;
	
	@RequestMapping("/sawon/list.do")
	public String list(Model model) {
		
		List<SawonVo> list = sawonDao.selectList();
		
		//System.out.println(list.size());
		
		//model
		model.addAttribute("list",list);
		
		
		return"sawon/sawon_list";
	}
}

