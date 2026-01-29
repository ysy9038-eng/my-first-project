package com.example.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.db.dao.BoardDao;
import com.example.db.vo.BoardVo;
import com.example.db.vo.MemberVo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/board/")
public class BoardController {

	@Autowired
	BoardDao boardDao;

	@Autowired
	HttpServletRequest request;

	@Autowired
	HttpSession session;

	// 1. 목록 보기(List)
	@RequestMapping("list.do")
	public String list(Model model) {
		List<BoardVo> list = boardDao.selectList();
		model.addAttribute("list", list);
		return "board/board_list"; // list.jsp로 포워딩
	}

	@RequestMapping("insert_form.do")
	public String insert_form() {
	    return "board/board_write_form"; // 작성하신 JSP 파일명
	}
	
	// f.method = "POST"
	// /board/insert.do?b_subject=제목&b_content=내용
	@PostMapping("insert.do")
	public String insert(BoardVo vo, RedirectAttributes ra) {

		// login 상태유무 체크
		MemberVo user = (MemberVo) session.getAttribute("user");

		// 로그아웃상태면
		if (user == null) {

			ra.addAttribute("reason", "session_timeout");
			// response.sendRedirect("../member/login_form.do?reason=session_timeout")
			return "redirect:../member/login_form.do";
		}

		// 내용 : \n -> <br>변경
		String b_content = vo.getB_content().replaceAll("\n", "<br>");
		vo.setB_content(b_content);

		// IP
		String b_ip = request.getRemoteAddr();
		vo.setB_ip(b_ip);

		// 회원정보 넣기
		vo.setMem_idx(user.getMem_idx());
		vo.setMem_name(user.getMem_name());

		// DB insert
		int res = boardDao.insert(vo);
		return "redirect:list.do";

	}// end:insert()

	// 3.수정 폼으로 이동 (기존 데이터 조회 과정 필요)
	@RequestMapping("modify.do")
	public String modify(int b_idx, Model model ) {
		BoardVo vo = (BoardVo) boardDao.selectOneFromIdx(b_idx);
		// 수정을 위해 <br>을 다시 \n으로 변환 (textarea에 보여주기 위함)
		if (vo.getB_content() != null) {
			vo.setB_content(vo.getB_content().replaceAll("<br>", "\n"));
		}
		model.addAttribute("vo", vo);

		return "board/board_modify_form";
	}
	
	@PostMapping("update.do")
	public String update(BoardVo vo, RedirectAttributes ra) {
	    int res = boardDao.update(vo); // DB 수정 실행
	    
	    if(res > 0) {
	        // 리다이렉트 시 잠깐 보여줄 메시지 전달
	        ra.addFlashAttribute("result", "update_success");
	    }
	    
	    // 수정 후에는 목록으로 "리다이렉트" 하므로 RedirectAttributes가 필요함
	    return "redirect:list.do"; 
	}

	/*
	 * @RequestMapping("/board/update_form.do") public String update_form(int idx,
	 * Model model) {
	 * 
	 * BoardVo vo = BoardDao.selectOneFromId(idx);
	 * 
	 * //<br> -> \n String content = vo.getContent().replaceAll("<br>", "\n");
	 * 
	 * //request binding(model통해서) model.addAttribute("vo",vo);
	 * 
	 * return "board/board_update_form"; }
	 */

	/*
	 * @RequestMapping("/visit/modify_form.do") public String modify_form(int idx,
	 * Model model) {
	 * 
	 * VisitVo vo = visitDao.selectOne(idx);
	 * 
	 * //<br> -> \n String content = vo.getContent().replaceAll("<br>", "\n");
	 * 
	 * //request binding(model통해서) model.addAttribute("vo",vo);
	 * 
	 * return "visit/visit_modify_form"; }
	 */

//		삭제

	// /visit/delete.do?idx=123
	@RequestMapping("delete.do")
	public String delete(int idx) {

		int res = boardDao.delete(idx);

		return "redirect:list.do";
	}
}
