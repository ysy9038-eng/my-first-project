<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>
	<h4>업로드된 화일정보 3</h4>
<hr>
제목 : "${ title }"<br>

<c:forEach var="filename" items="${filename_list }">
<img src="images/${filename }" width=200> &nbsp;&nbsp;
</c:forEach>

<br>
<a href="input3.html">다시하기</a>

</body>
</html>