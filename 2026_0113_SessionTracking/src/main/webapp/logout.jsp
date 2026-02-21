<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// session 유지 시간 설정
	session.setMaxInactiveInterval(60);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="button" value="logout" onclick="location.href='logout.do'">
</body>
</html>