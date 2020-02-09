<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
</head>
<body>
	
	<div style ="max-width:850px;min-width:450px;margin:0 auto;min-height:812px;">
	
	<jsp:include page="content_header.jsp">
		<jsp:param value="알림장" name="subject"/>
		<jsp:param value="list.do" name="url"/>
		<jsp:param value="상세보기" name="item"/>
	</jsp:include>
	
	<!-- main -->
	<section class="content containder-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="card card-outline card-info">
					<div class ="card-header">
						<h3 class="card-title">상세보기</h3>
					</div>
					
					<div class ="card-body">
						<div class="form-group col-sm-12">
							<label for="title">제 목</label>
							<input type ="text" class = "form-control" id ="title" value ="${diary.title}" readonly />
						</div>
					
					<div class ="row">
						<div class = "form-group col-sm-4">
							<label for ="regDate">작성일</label>
							<input type ="text" class ="form-control" id ="regDate"
								value ="<fmt:formatDate value="${diary.regdate }" pattern="yyyy-MM-dd" />" readonly/>
						</div>
						<div class ="form-group col-sm-4">
							<label for ="viewcnt">조회수</label>
							<input type ="text" class ="form-control" id ="viewcnt" 
								value="${diary.viewcnt}" readonly/>
						</div>
					</div>
					
					<div class="form-group col-sm-12">
						<label for="content">내용</label>
						<div id ="content">${diary.content }</div>
					</div>
					
					</div>
					 <div class ="card-footer">
						<%-- <c:if test ="${loginUser.tid eq diary.writer }"> --%>
							<button type="button" id ="modifyBtn" class="btn btn warning">수 정</button>
							<button type="button" id ="removeBtn" class="btn btn danger">삭 제</button>
				<%-- 		</c:if> --%>
							<button type="button" id ="listBtn" class ="btn btn-primary">목록으로</button>
					</div> 
				</div>
			</div>
		</div>
	</section>
	</div>	
	
	<form role ="form">
		<input type='hidden' name ='hwno' value = "${diary.hwno }">
		<input type='hidden' name ='page' value = "${param.page }">
		<input type='hidden' name ='perpageNum' value = "${param.perPageNum }">
		<input type='hidden' name ="searchType" value = "${param.searchType }" />
		<input type='hidden' name ="keyword" value = "${param.keyword }" />
	</form>	
	

	<!-- Modal -->
<div id="modifyModal" class="modal modal-default fade" role="dialog">
  <div class="modal-dialog">
    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title" style="display:none;"></h4>
        <button type="button" class="close" data-dismiss="modal">&times;</button>        
      </div>
      <div class="modal-body" data-rno>
        <p><input type="text" id="replytext" class="form-control"></p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-info" id="replyModBtn">수 정</button>
        <button type="button" class="btn btn-danger" id="replyDelBtn">삭 제</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">창닫기</button>
      </div>
    </div>
  </div>
</div>
	
	
	<%@include file="detailHdiary_js.jsp" %>
</body>
</html>