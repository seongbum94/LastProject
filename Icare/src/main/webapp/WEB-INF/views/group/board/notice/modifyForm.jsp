<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page trimDirectiveWhitespaces="true" %>   
<!DOCTYPE html>
<html>
<head>
<!-- jQuery -->
  <script src="<%=request.getContextPath()%>/resources/bootstrap/plugins/jquery/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<section class="content container-fluid">
		<div class="row justify-content-center">
			<div class="col-md-9" style="max-width:960px;">
				<div class="card card-outline card-info">
					<div class="card-header">
						<h3 class="card-title p-1">글수정</h3>
	<form method="post" action="modify" name="modifyForm">
		<label for="bno">번호</label>
		<input type="text" id="bno" class="form-control" value="${board.bno }" name="bno">
		<br>
		<label for="title">제목</label>
		<input type="text" id="title" class="form-control" value="${board.title }" name="title">
		<br>
		<label for="content">내용</label>
		<textarea rows="3" class="form-control" name="content">${board.content }</textarea>
		
		<input type="submit" value="수정"/>
	</form>
	</div>
	</div>
	</div>
	</div>
	</section>

</body>
</html>