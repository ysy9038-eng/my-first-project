<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<!-- title -->
	<tr>
		<th>사번</th>
		<th>사원명</th>
		<th>직위</th>
		<th>성별</th>
		<th>부서번호</th>
		<th>입사일자</th>
		<th>상사번호</th>
		<th>년봉</th>
	</tr>
	<!-- data -->
	<!-- for(SawonVo : list) -->
	<c:forEach var="vo" items="${ requestScope.list }">
	<tr>
		<td>${vo.sabun }</td>
		<td>${vo.saname }</td>
		<td>${vo.sajob }</td>
		<td>${vo.sagender }</td>
		<td>${vo.deptno }</td>
		<td>${vo.sahire }</td>
		<td>${vo.samgr }</td>
		<td>${vo.sapay }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>