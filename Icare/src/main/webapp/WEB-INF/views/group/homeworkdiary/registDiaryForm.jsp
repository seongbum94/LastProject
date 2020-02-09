<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>알림장/알림장등록</title>
<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  
</head>
<body>
	<h3>알림장 등록</h3>
	  <div class="content-wrapper">
	<div>
		<button type ="button" id = "registBtn">등록</button>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<button type ="button" id = "cancelBtn">취소</button>
	</div>
		<form role="form" method="post" action="regist" name="registForm">
		
			<div>
				<label for="title">제 목</label>
				<input type="text" id ="title" name ='title' class="form-control" placeholder="제목을 입력하세요.">
			</div>
			<br/>
			<div>
				<label for="title">전 달 사 항 내 용</label><br/><br/>
				<textarea id ="content" name ='content' rows ="30" class="form-control"
						placeholder="1000자 내외로 작성하세요."></textarea>
			</div>
		</form>
	</div>
	
	
	<script>
	$('#registBtn').on('click', function(e){
		var form = document.registForm;
		
		if(form.title.value==""){
			alert("제목을 입력 해 주세요!");
			return;
		}
		
		if(form.content.value.lendth>1000){
			alert("글자수는 1000자를 초과할 수 없습니다.");
			return;
		}
		
		form.submit();
		
	});
	
	$('#cancelBtn').on('click',function(e){
		history.go(-1);
		
	});
	
	</script>
	
	
</body>
</html>