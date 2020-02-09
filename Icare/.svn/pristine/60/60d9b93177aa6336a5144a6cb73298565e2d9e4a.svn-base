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
							<input class="form-control" type ="text" id = "tid" name = "tid" value = "${teacher.tid}" /><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="title">이 름</label>
						<div class="col-sm-10">
						<input class="form-control" type ="text" id = "title" name = "name" value = "${teacher.name }" /><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="pwd">비밀번호</label>
						<div class="col-sm-10">
							<input class="form-control" type = "password" id = "pwd" name = "pwd" value = "${teacher.pwd }" /><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label">재직상태</label>
						<select id = "servstts" name = "servstts">
							<option>재직중</option>
							<option>육아휴직</option>
							<option>보건휴직</option>
							<option>퇴직</option>
						</select> 
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="email">이메일</label>
						<div class="col-sm-10">
							<input class="form-control" type = "email" id = "email" name = "email" value = "${teacher.email }" /><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label">전화번호</label>
						<select id = "selPhone" name = "phone">
							<option>010</option>
							<option>011</option>
							<option>031</option>
						</select> 
						 - <input class="form-control col-sm-2" type = "text" name = "phone"/> - <input class="form-control col-sm-2" type = "text" name = "phone"/><br/>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="regno1">주민번호</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "regno1" value = "${teacher.regno1}-${teacher.regno2}" />
						</div>
					</div>
					
					<div class=" row col-sm-6" >
						<label class="col-sm-2 col-form-label" for="addr1">주 소</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" id = "addr1" name = "addr1" value = "${teacher.addr1 }" /><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="addr2">상세주소</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "addr2" value = "${teacher.addr2 }" /><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="zip">우편번호</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "zip" value = "${teacher.zip }" /><br/>
						</div>
					</div>
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="cno">반 번호</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "cno" value = "${teacher.cno }" ><br/>
						</div>
					</div>
					<button id = "modifyBtn" type = "button">수정</button>
					<button type = "button" onclick = "history.go(-1);">취소</button>
				</form>
            </div><!-- div card -->
         </div><!-- div col-12-->
      </div><!-- div row -->
   </div><!-- div content-wrapper -->
   <script>
   		$('#modifyBtn').on('click',function(){
   			var tid = $("[name='tid']").val();
			location.href="<%=request.getContextPath()%>/group/employ/detail.do?tid=" + tid;	
   		});
   </script>
</body>




