<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
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
		width:120px;
		height:80px; 
	}

</style>
 
</head>
<body>

<table class="table table-striped table-hover">
  <tr>
  	<th>이미지</th>
  	<th>상품명</th>
  	<th>가격</th>
  	<th>판매처</th>
  </tr>
  
  <fmt:setLocale value="ko_KR"/>
  
  <!-- for(ProductVo vo : list) -->
  <c:forEach var="vo" items="${list}">
  	<tr>
  		<td>
  			<img src="${ vo.image }">
  		</td>
  		
  		<td>
			<a href="${vo.link }" target="_blank">${ vo.title}</a>  		
  		</td>
  		
  		<td>
  			최저가 :<fmt:formatNumber type="currency" value="${vo.lprice }"/> <br>
  			최고가 : <fmt:formatNumber type="currency" value="${ vo.hprice}"/>
  		</td>
  		
  		<td>
  			${vo.mallName }
  		</td>
  	</tr>
  </c:forEach>
</table>
 <hr><hr>
</body>
</html>