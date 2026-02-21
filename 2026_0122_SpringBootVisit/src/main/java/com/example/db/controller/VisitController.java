package com.example.db.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.db.dao.VisitDao;
import com.example.db.vo.VisitVo;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class VisitController {

	// DI(Dependency Injection) : 의존성 주입

	@Autowired
	VisitDao visitDao;
	
	// 매 요청시 마다 injection(주입)
	@Autowired
	HttpServletRequest request;

	@Autowired
	HttpSession session;
	
	@Autowired
	ServletContext application;
	
	// 1.Constructor Injection
	@Autowired
	public VisitController(VisitDao visitDao) {
		super();
		this.visitDao = visitDao;
		
	
	}

	// 2.Setter Injection
//	@Autowired
//	public void setVisitDao(VisitDao visitDao) {
//		this.visitDao = visitDao;
//	}

//	@RequestMapping("/visit/list.do")
//	public String list(Model model) {
//
//		List<VisitVo> list = visitDao.selectList();
//
//		model.addAttribute("list", list);
//
//		return "visit/visit_list";
//	}

	// 입력폼띄우기
	@RequestMapping("/visit/insert_form.do")
	public String insert_form() {

		return "visit/visit_insert_form";
	}

	// /visit/insert.do?name=홍길동&content=잘 들어가나?\r\n정말?&pwd=1234
	// 등록
	@RequestMapping("/visit/insert.do")
	public String insert(VisitVo vo) {
		// parameter 받아서 VisitVo로 포장해줘/ request도 줘
		// content:\n -> <br> 변경
		String content = vo.getContent().replaceAll("\n", "<br>");
		vo.setContent(content);

		String ip = request.getRemoteAddr();
		vo.setIp(ip);

		// DB insert
		int res = visitDao.insert(vo);

		return "redirect:list.do";
		// DispacherServlet에게 response.sendRedirect("list.do");하도록 정보제공
	}

	// /visit/check_pwd.do?idx=1&c_pwd=1234
	@RequestMapping("/visit/check_pwd.do")
	@ResponseBody
	public Map<String, Boolean> check_pwd(int idx,String c_pwd){
		
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
	
	// DS가 호출한 method에서 반환되는 유형
	// 1.ViewName : "hello"
	// 2.Redirect : "redirect:list.do"
	// 3.ResponseBody : String인 경우 ->"해당내용" 그냥 전송해라
	// 					객체(배열,리스트,Map,....) => JSON변환해서 응답
	
	//	삭제
	
	// /visit/delete.do?idx=123
	@RequestMapping("visit/delete.do")
	public String delete(int idx) {
		
		int res = visitDao.delete(idx);
		
		return "redirect:list.do";
	}
	
//	   @RequestMapping("/visit/delete.do")
//	   public String delete(int idx) {
//	      
//	      int      res   = visitDao.delete(idx);
//	      
//	      return "redirect:list.do";
//	   }
	
	//수정폼 띄우기
	// /visit/modify_form.do?idx=142
	
	@RequestMapping("/visit/modify_form.do")
	public String modify_form(int idx, Model model) {
		
		VisitVo vo = visitDao.selectOne(idx);
		
		//<br> -> \n
		String content = vo.getContent().replaceAll("<br>", "\n");
		
		//request binding(model통해서)
		model.addAttribute("vo",vo);
		
		return "visit/visit_modify_form";
	}
	
	//수정
	// / /visit/modify.do?idx=81&name=홍길동&content=동해물과&pwd=1234
	@RequestMapping("/visit/modify.do")
	public String modify(VisitVo vo) {
		// parameter받아서 VisitVo포장해서 달라는 의미
		
		//\n -> <br>
		String content = vo.getContent().replaceAll("\n", "<br>");
		vo.setContent(content);
		
		// ip 받기
		String ip = request.getRemoteAddr();
		vo.setIp(ip);
		
		//DB update
		int res = visitDao.update(vo);
		
		return "redirect:list.do";
	}
	
	// /visit/list.do
	// /visit/list.do?search=all&search_text=
	// /visit/list.dom?search=name&search_text=길
	// /visit/list.do?search=content&search_text=
	// /visit/list.do?search=name_content&search_text=
	
	
	@RequestMapping("/visit/list.do")
	public String list(@RequestParam(name="search", defaultValue = "all") String search,
						String search_text, Model model) {
		
		//if(search==null) search="all";
		
		//검색조건을 담을 Map
		Map<String, Object> map = new HashMap<String, Object>();
		
		if(search.equals("name")) {
			//이름을 검색
			map.put("name", search_text);
			
		}else if(search.equals("content")) {
			//내용으로 검색
			map.put("content", search_text);

		}else if(search.equals("name_content")) {
			//이름 + 내용으로 검색
			map.put("name", search_text);
			map.put("content", search_text);
		}
		
		List<VisitVo> list = visitDao.selectConditionList(map);
		
		model.addAttribute("list",list);
		
		return "visit/visit_list";
		
		
	}
}
