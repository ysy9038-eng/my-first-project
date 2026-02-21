<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// Cookie정보를 읽어온다
	Cookie [] cookie_array = request.getCookies();
	
	//문자열 누적
	StringBuilder sb = new StringBuilder("<h4>[최근방문페이지]</h4>");
	if(cookie_array !=null){
		
		for(Cookie c:cookie_array){
			
			String name=c.getName();
			String value=c.getValue();
			
			if(!name.equals("JSESSIONID")){
				System.out.printf("%s=>%s\n",name,value);
				// <a href="A.jsp">A</a><br>
				// <a href="B.jsp">B</a><br>
				// <a href="C.jsp">C</a><br>
				String url = String.format("<a href='%s'>%s</a><br>",value,name);
				sb.append(url);
			}
			
		}//end:for
	
	}
	
	String html = sb.toString();
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
 #popup{
 	
 	width: 200px;
 	height: 200px;
 	padding: 10px;
 	background: #cccccc;
 	color: red;
 	
 	position:fixed;
 	top: 10px;
 	right: 50px;
 }
</style>

</head>
<body>
<div id="popup">
	<%=html %>
</div>
</body>
</html>