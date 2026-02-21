package action.member;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.MemberDao;

/**
 * Servlet implementation class MemberDeleteAction
 */
@WebServlet("/member/delete.do")
public class MemberDeleteAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// /member/delete.do?mem_idx=5	<= GET
		// /member/delete.do			<= POST	(request body에 숨겨져서 들어옴)
		
		int mem_idx = Integer.parseInt(request.getParameter("mem_idx"));
		
		//DB delete
		int res = MemberDao.getInstance().delete(mem_idx);
		
		//메인(목록보기)
		response.sendRedirect("list.do");
	}
}
