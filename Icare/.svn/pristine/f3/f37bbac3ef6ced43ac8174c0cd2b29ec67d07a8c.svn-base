<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>

<head>
<meta charset="UTF-8">
<title>알림장 목록</title>
</head>
<body>
   <div class="content-wrapper">
      <div class="row">
         <div class="col-12">
            <div class="card col-12">
            	<form role="form" class="form-horizontal">
            		<div class=" row col-sm-6 row col-sm-6">
						<label class="col-sm-2 col-form-label" for="tid">교 번</label>
						<div class="col-sm-10">
							<input class="form-control" type ="text" id = "tid" name = "tid" value = "${teacher.tid}" readonly/><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="title">이 름</label>
						<div class="col-sm-10">
						<input class="form-control" type ="text" id = "title" name = "name" value = "${teacher.name }" readonly/><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="pwd">비밀번호</label>
						<div class="col-sm-10">
							<input class="form-control" type = "password" id = "pwd" name = "pwd" value = "${teacher.pwd }" readonly/><br/>
						</div>
					</div>
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="email">이메일</label>
						<div class="col-sm-10">
							<input class="form-control" type = "email" id = "email" name = "email" value = "${teacher.email }" readonly/><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label">전화번호</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "phone" value = "${teacher.phone }" readonly/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="regno1">주민번호</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "regno1" value = "${teacher.regno1}-${teacher.regno2}" readonly/>
						</div>
					</div>
					
					<div class=" row col-sm-6" >
						<label class="col-sm-2 col-form-label" for="addr1">주 소</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" id = "addr1" name = "addr1" value = "${teacher.addr1 }" readonly/><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="addr2">상세주소</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "addr2" value = "${teacher.addr2 }" readonly/><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="zip">우편번호</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "zip" value = "${teacher.zip }" readonly/><br/>
						</div>
					</div>
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="cno">반 번호</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "cno" value = "${teacher.cno }" readonly><br/>
						</div>
					</div>
					<button id = "modifyBtn" type = "button">수정</button>
					<button type = "button" onclick = "javascript:location.href='<%=request.getContextPath()%>/group/employ/list.do';">목록으로</button>
				</form>
            </div><!-- div card -->
         </div><!-- div col-12-->
      </div><!-- div row -->
   </div><!-- div content-wrapper -->
   <form id="jobForm">
		  <input type='hidden' name="page" value="${pageMaker.cri.page}" />
		  <input type='hidden' name="perPageNum" 
		  		 value="${pageMaker.cri.perPageNum}"/>
		  <input type='hidden' name="searchType" 
		         value="${pageMaker.cri.searchType }" />
		  <input type='hidden' name="keyword" 
		         value="${pageMaker.cri.keyword }" />
	</form>
   <script>
   		$('#modifyBtn').on('click',function(){
   			var tid = $("[name='tid']").val();
   			alert(tid);
			location.href="<%=request.getContextPath()%>/group/employ/modifyForm.do?tid=" + tid;	
   		});
   </script>
</body>




