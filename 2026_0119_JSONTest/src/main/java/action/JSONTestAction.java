package action;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class JSONTestAction
 */
@WebServlet("/json.do")
public class JSONTestAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String data = """
					{
					"name":"홍길동",
					"name1":{
								"familyName":"홍",
								"givenName":"길동"
							},
					"age":30,
					"hobby":["독서","낚시","운동"]
					}
				""";
		
		
	//System.out.println(data);
		JSONObject json = new JSONObject(data);
		
		String name = json.getString("name");
		int 	age	= json.getInt("age");
		
		// 성 이름 Parsing 
		JSONObject name1 = json.getJSONObject("name1");
		String familyName = name1.getString("familyName");
		String givenName = name1.getString("givenName");
		
		JSONArray hobby_array =json.getJSONArray("hobby");
		
		List<String> hobby_list = new ArrayList<String>();
		
		for(int i=0; i<hobby_array.length();i++) { // i = 0 1 2
			
			String hobby = hobby_array.getString(i);
			hobby_list.add(hobby);
		}
		
		System.out.printf("이름(full) : %s\n",name);
		System.out.printf("성 : %s\n",familyName);
		System.out.printf("이름 : %s\n",givenName);
		System.out.printf("나이 : %s\n",age);
		System.out.printf("취미 : %s\n",hobby_list);
		
		
		
	}
}
