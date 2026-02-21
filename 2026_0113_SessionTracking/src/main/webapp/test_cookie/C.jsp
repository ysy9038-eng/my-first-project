<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//						   name value
	Cookie cookie = new Cookie("C","C.jsp");
	
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
여기는 C.jsp입니다<br>

<a href="A.jsp">B로 이동...</a>

</body>
</html>