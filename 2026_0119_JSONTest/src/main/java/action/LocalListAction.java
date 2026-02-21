package action;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.MyKakaoUtils;
import vo.LocalVo;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class LocalListAction
 */
@WebServlet("/local/list.do")
public class LocalListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String query	= "병원";
		double x 		= 128.589859652042	;
		double y	 	= 35.870627034367;
		int		radius	= 1000;
		int 	page	= 1;
		int		size	= 5;
		
		// local/list.do?query=약국&radius=1000&x=128.56&y=38.23&page=1&size=10
		
		//0.수신인코딩 설정
		request.setCharacterEncoding("utf-8");
		
		//1.parameter 받기
		query = request.getParameter("query");
		
	try {
		radius = Integer.parseInt(request.getParameter("radius"));
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	try {
		page = Integer.parseInt(request.getParameter("page"));
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	try {
		size = Integer.parseInt(request.getParameter("size"));
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	try {
		
		x = Double.parseDouble(request.getParameter("x"));
		y = Double.parseDouble(request.getParameter("y"));
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
		//Kakao Local API이용해서 검색
		List<LocalVo> list = MyKakaoUtils.search_local(query,x,y,radius,page,size);
		
		//System.out.println(list.size());
		
		//request binding
		request.setAttribute("list", list);
		
		
		// Dispatcher(forward)
		String forward_page = "local_list.jsp";
		RequestDispatcher disp = request.getRequestDispatcher(forward_page);
		disp.forward(request, response);

	}
}

