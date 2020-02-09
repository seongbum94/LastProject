<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page trimDirectiveWhitespaces="true" %>   

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="content-wrapper">
<section class="content container-fluid">
		<div class="row justify-content-center">
			<div class="col-md-9" style="max-width:960px;">
				<div class="card card-outline card-info">
					<div class="card-header">
						<h3 class="card-title p-1">글등록</h3>
							<div class ="card-tools">	
								<button type="button" id="registBtn">등 록</button>
								&nbsp;&nbsp;&nbsp;&nbsp;
								<button type="button" id="cancelBtn">취 소</button>
							</div>	<br>		
								<br>
						<form method="post" action="regist" name="registForm">
						
								<label for="title">제 목</label> 
								<input type="text" id="title"
									name='title' class="form-control" placeholder="제목을 쓰세요"><br>
								
								<label for="content">내 용</label>
								<textarea name="content" id="content" class="form-control" rows="20"
									placeholder="1000자 내외로 작성하세요."></textarea>
							<input type="submit" value="등록">
						</form>

						</div>
					</div>
				</div>
			</div>
	</section>
</div>
 
<script>
	
	$('#registBtn').on('click',function(e){
		var form=document.registForm;
		form.submit();
		
	});
	
	$('#cancelBtn').on('click',function(e){
		location.href="<%=request.getContextPath() %>/group/board/list/notice.do";
	});


</script>

</body>
