<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//						   name value
	Cookie cookie = new Cookie("B","B.jsp");

	// 시간지정을 하지 않으면 : Session Cookie
	//유효시간 지정: sec
	//cookie.setMaxAge(60*60*24);//Persistant Cookie
	
	
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
여기는 B.jsp입니다<br>

<a href="C.jsp">B로 이동...</a>

</body>
</html>