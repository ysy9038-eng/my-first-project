package action;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.MySearchUtil;
import vo.BookVo;
import vo.ProductVo;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ProductListAction
 */
@WebServlet("/product/list.do")
public class ProductListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// /product/list.do
		// /product/list.do?p_name=노트북&start=1&display=10
		
		String p_name 	= "노트북";
		int 	start 	= 1;
		int 	display	= 10;
		
		//0.수신인코딩
		request.setCharacterEncoding("utf-8");
		
		try {
			
			start = Integer.parseInt(request.getParameter("start"));
			display = Integer.parseInt(request.getParameter("display"));
			
			p_name = request.getParameter("p_name");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		List<ProductVo> list = MySearchUtil.search_shop(p_name, start, display);
		
		request.setAttribute("list", list);
		
		
		
		
		// Dispatcher(forward)
		String forward_page = "product_list.jsp";
		RequestDispatcher disp = request.getRequestDispatcher(forward_page);
		disp.forward(request, response);

	}
}
