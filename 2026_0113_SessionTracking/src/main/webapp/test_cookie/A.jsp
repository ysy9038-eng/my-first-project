<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//						   name value
	Cookie cookie = new Cookie("A","A.jsp");
	
	response.addCookie(cookie);
%>    
    
<%@include file="popup.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
여기는 A.jsp입니다<br>

<a href="B.jsp">B로 이동...</a>

</body>
</html>