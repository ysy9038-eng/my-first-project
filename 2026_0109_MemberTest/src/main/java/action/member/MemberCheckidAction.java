package action.member;

import java.io.IOException;

import dao.MemberDao;
import db.vo.MemberVo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberCheckidAction
 */
@WebServlet("/member/check_id.do")
public class MemberCheckidAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// /member/check_id.do?mem_id=hong
		
		//0.수신인코딩
		request.setCharacterEncoding("utf-8");
		
		//1.parameter 받기
		String mem_id = request.getParameter("mem_id");
		
		//2.mem_id에 해당되는 회원정보를 얻는다
		MemberVo vo = MemberDao.getInstance().selectOne(mem_id);
		
		//3.사용유무에 대한 결과
		boolean bResult = false;
		
		if(vo==null)bResult = true;//사용가능한 아이디
		
		//4.json 결과전송 : {"result":true}
		response.setContentType("application/json:charset=utf-8;");
		
		String json = String.format("{\"result\":%b }", bResult);
		
		response.getWriter().print(json);

	}
}

