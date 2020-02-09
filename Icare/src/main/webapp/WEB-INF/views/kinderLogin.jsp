<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action ="<%=request.getContextPath() %>/login" method ="POST">
	아이디 : <input type ="text" name ="pid"><br/>
	비밀번호 :<input type ="password" name ="pwd"><br/>
	<input type="submit" value="로그인">
	</form>
</body>
</html>