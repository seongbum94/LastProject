<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="content-wrapper">

	<h1>교보재 내역조회</h1>
	<table>
      <c:forEach var="tools" items="${toolsList}">
      <tr>
         <th>이름</th>
      </tr>
      <tr>
         <td>${tools.tsno }</td>
      </tr>
      <tr>
      
      <th>수량</th>   
      </tr>
      <tr>
         <td>${tools.qntty }</td>
      </tr>
      <tr>
         <th>비품명</th>   
      </tr>
      <tr>
         <td>${tools.name }</td>
      </tr>
      
            <tr>
         <th>구분</th>   
      </tr>
      <tr>
         <td>${tools.gubun }</td>
      </tr>
      
            <tr>
         <th>반번호</th>   
      </tr>
      <tr>
         <td>${tools.cno }</td>
      </tr>
      
      </c:forEach>
   </table>
</div>
</body>
</html>