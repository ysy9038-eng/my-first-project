package action;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.PersonVo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * Servlet implementation class PersonListAction
 */
@WebServlet("/person/list.do")
public class PersonListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<PersonVo> list = new ArrayList<PersonVo>();
		
		try {
			//XML Parser	:SAXBuilder
			
			SAXBuilder builder = new SAXBuilder();
			
			// Web Context
			ServletContext application = request.getServletContext();
					
			//web경로 -> 절대경로 구한다
			String webPath = "/";
			String absPath = application.getRealPath(webPath);
			System.out.println(absPath);
			
			File f = new File(absPath,"person.xml");
			
			
			
			Document doc = builder.build(f);
			//Root Element 구하기
			Element root = doc.getRootElement();
			
			//root(persons)밑의 자식 Element정보 얻어오기
			List<Element> person_list = root.getChildren("person"); 
			
			for(Element person : person_list) {
				
				String name 		= person.getChildText("name");
				Element nameElement = person.getChild("name");
				String nickname		= nameElement.getAttributeValue("nickname");
				String familyname	= nameElement.getAttributeValue("familyname");
				int age				= Integer.parseInt(person.getChildText("age"));
				
				String tel			= person.getChildText("tel");
				String hometel		= person.getChild("tel").getAttributeValue("hometel");
				
				
				//PersonVo 포장
				PersonVo vo = new PersonVo(name, nickname, familyname, age, tel, hometel);
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//request binding
		request.setAttribute("list", list);
		
		
		

		// Dispatcher(forward)
		String forward_page = "person_list.jsp";
		RequestDispatcher disp = request.getRequestDispatcher(forward_page);
		disp.forward(request, response);

	}
}

