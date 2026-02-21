package com.example.db.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.db.dao.VisitDao;
import com.example.db.vo.VisitVo;

import jakarta.servlet.http.HttpServletRequest;

//@RestController = @Controller + @ResponseBody

@RestController
public class VisitRestController {

	@Autowired
	VisitDao visitDao;
	
	@Autowired
	HttpServletRequest request;
	
	//전체조회
	@GetMapping("/rest/visits")
	public Map<String, Object> list(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<VisitVo> list = visitDao.selectList();
		
		map.put("list", list);
		map.put("createDate",new Date());
		
		return map;
	}
	
	//1건 조회	: /rest/visit/148
	@GetMapping("/rest/visit/{idx}")
	public VisitVo visitOne(@PathVariable int idx) {
		
		VisitVo vo = visitDao.selectOne(idx);
		
		return null;
	}
	
	
	//추가
	/*
	
	{"name": "박길동","content":"Rest에서 추가합니다","pwd":"1234"}
	
	*/
	@PostMapping("/rest/visit")
	public Map<String, Boolean> insert(@RequestBody VisitVo vo){
		
		String ip = request.getRemoteAddr();
		vo.setIp(ip);
		
		int res = visitDao.insert(vo);
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		
		map.put("result", (res==1) );
		
		return map;
	}
	
	//수정
	/*
	
	{"idx":121, "name":"박길동", content":"Rest에서 추가합니다","pwd":"1234"}
	
	*/
	@PutMapping("/rest/visit")
	public Map<String, Boolean> update(@RequestBody VisitVo vo){
		
		String ip = request.getRemoteAddr();
		vo.setIp(ip);
	
		int res = visitDao.update(vo);
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		
		map.put("result", (res==1) );
		
		return map;
	}
	
	//삭제	: /rest/visit/121
	@DeleteMapping("/rest/visit/{idx}")
	public Map<String, Boolean> delete(@PathVariable int idx){
		
		int res = visitDao.delete(idx);
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		
		map.put("result", (res==1));
		
		return map;
		
	}
	
	//체크패스워드
	
	//GET /rest/visit/check-pwd/{idx}/{c_pwd}
	//GET /rest/visit/check-pwd/148/1234
	@GetMapping("/rest/visit/check-pwd/{idx}/{c_pwd}")
	public Map<String, Boolean> checkPwd(@PathVariable int idx, 
										 @PathVariable String c_pwd){
		
		//idx에 해당되는 게시물정보 얻어오기
		VisitVo vo = visitDao.selectOne(idx);
		
		boolean bExist = (vo!=null);//존재유무
		
		boolean bResult = false;
		
		//비밀번호 맞는지 유무체크
		if(vo!=null) {
			bResult=vo.getPwd().equals(c_pwd);
		}
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		
		map.put("result", bResult);
		map.put("exist", bExist);
		
		return map;	//{"result":true, "exist":true}
		
		
	}
	
	
	}
