package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import action.BookController;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String uri = request.getRequestURI();
		System.out.println(uri);
		
		BookController book_controller 
						= BookController.getInstance();
		
		String forward_page = "";
		
		if(uri.endsWith("list.do")) { //목록요청//list.do가 끝에있냐..
			forward_page = book_controller.list(request);
			
		}else if(uri.endsWith("view.do")) {
			
			forward_page = book_controller.view(request);
		}
		
		
		// Dispatcher(forward)
		RequestDispatcher disp = request.getRequestDispatcher(forward_page);
		disp.forward(request, response);

	}
}
