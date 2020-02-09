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
 <section class="content container-fluid">
		<div class="row justify-content-center">
			<div class="col-md-9" style="max-width:960px;">
				<div class="card card-outline card-info">
					<div class="card-header">
						<h3 class="card-title p-1">상세보기</h3>
						 <div class="modal-footer">
					        <button type="button" id="ModBtn">수정</button>
					        <button type="button" id="DelBtn">삭제</button>
					        <button type="button" id="list" data-dismiss="modal">목록</button>
     					 </div>
						</div>
					<div class="card-body">
						<div class="form-group col-sm-12">
							<form>
							
								<label for="title">제목</label>
								<input type="text" id="title" class="form-control" value="${board.title }" name="title">
								
								<label for="regdate">작성일</label>
								
								<div class="form-group col-sm-5">
									<input type="text" id="regdate" class="form-control" value="${board.regdate }" name="title">
								</div>
								
								<label for="viewcnt">조회수</label>
								
								<div class="form-group col-sm-3">
									<input type="text" id="viewcnt" class="form-control" value="${board.viewcnt }" name="title">
								</div>
								<br>
								
								<label for="content">내용</label>
								
								<textarea rows="3" class="form-control" name="content">${board.content }</textarea>
								
							</form>
						</div>
					</div>
				</div>
			</div>
		
		</div>
		
	</section>
	
<script>
	$('#ModBtn').on('click',function(e){
		location.href="<%=request.getContextPath() %>/group/board/notice/modifyForm.do?bno=${board.bno}";
	});
	$('#DelBtn').on('click',function(e){
		location.href="<%=request.getContextPath() %>/group/board/notice/remove";
	});
	$('#list').on('click',function(e){
		location.href="<%=request.getContextPath() %>/group/board/list/notice.do";
	});


</script>
</body>
</html>