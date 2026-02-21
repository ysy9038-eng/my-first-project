<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap 3.x -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style type="text/css">
	img{
		width:100px;
		height:80px;
	}
</style>

</head>
<body>
<table class ="tabel table-striped table-hover">
<tr>
 <th>이미지</th>
 <th>상품명</th>
 <th>할인율</th>
 <th>작가</th>
</tr>
<fmt:setLocale value="ko_KR"/>
<c:forEach var="vo" items="${list }">
<tr>
	<td>
		<img src="${vo.image }">
	</td>
	<td>
		<a href ="${vo.link }" target="_blank">${vo.title }</a>
	</td>
	<td>
		할인율:<fmt:formatNumber type="currency" value="${vo.discount}"/>
	</td>
	<td>
	${vo.author }
	</td>
</tr>
</c:forEach>



</table>
</body>
</html>