package action;

import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;

public class BookController {

	
	//single-ton pattern : 객체를 1개만 생성해서 사용하겠다
	static BookController single = null;

	public static BookController getInstance() {

		if (single == null)
			single = new BookController();

		return single;
	}

	private BookController() {
		// TODO Auto-generated constructor stub
	}
	
	//list처리하는 메소드
	public String list(HttpServletRequest request){
		
		List<String> list = new ArrayList<String>();
		
		list.add("HTML");
		list.add("CSS");
		list.add("Javascript");
		list.add("Java");
		list.add("Oracle");
		list.add("JSP");
		
		//request binding
		request.setAttribute("list", list);
		
		return "book_list.jsp";
	}
	
	
	// View 처리하는 메소드
	public String view(HttpServletRequest request) {
		//view.do?book=HTML
		//view.do?book=CSS
		
		String book = request.getParameter("book");
		String info = "몰라";
		
		if(book.equalsIgnoreCase("html")) {
			
			info = """
					Hyper Text Markup Language의 약자로<br>
					Tag을 이용해서 데이터를 표현하는 언어
					""";
		}else if(book.equalsIgnoreCase("css")) {

			info="""
				Cascading StyleSheet의 약자로 <br>
				데이터의 모양 및 색상을 지정하는 언어
					""";
		}else if(book.equalsIgnoreCase("Javascript")) {

			info="""
					Browser 제어용 언어로<br>
					각종 이벤트 및 컨트롤등을 제어하는 언어
					""";
		}else if(book.equalsIgnoreCase("Java")) {

		info="""
				제임스 고슬링이 만든 언어로<br>
				오크란언어로 전자제품 제어용언어로 만들었지만<br>
				인터넷환경이 활성화 되면서 주목을 받은 언어
				""";
		}else if(book.equalsIgnoreCase("Oracle")) {
			info = """
					대표적인 DBMS(Database Management System)로<br>
					현존하는 DBMS에 가장 대표적인 데이터베이스 프로그램
					""";
		}else if(book.equalsIgnoreCase("JSP")) {
			
			info="""
					Java Server Page의 약어로 <br>
					서버 기능(Servlet)을 갖는 Html Page 이다
					""";
		}
		
		//request binding
		request.setAttribute("book", book);
		request.setAttribute("info", info);
		
		
		
		return"book_view.jsp";
	}
	
	
	
	
	
	
	
	
}






