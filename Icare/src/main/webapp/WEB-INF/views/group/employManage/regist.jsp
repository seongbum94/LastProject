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
						<label class="col-sm-2 col-form-label" for="title">교 번</label>
						<div class="col-sm-10">
							<input class="form-control" type ="text" id = "tid" name = "tid"/><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="title">이 름</label>
						<div class="col-sm-10">
						<input class="form-control" type ="text" id = "title" name = "name" placeholder = "이름을 입력하세요"/><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="pwd">비밀번호</label>
						<div class="col-sm-10">
							<input class="form-control" type = "password" id = "pwd" name = "pwd"/><br/>
						</div>
					</div>
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="email">이메일</label>
						<div class="col-sm-10">
							<input class="form-control" type = "email" id = "email" name = "email"/><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for = "phone1">전화번호</label>
						<select id = "phone1" name = "phone1">
							<option>010</option>
							<option>011</option>
							<option>031</option>
						</select> 
						 - <input class="form-control col-sm-2" type = "text" name = "phone2"/> - <input class="form-control col-sm-2" type = "text" name = "phone3"/><br/>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="regno1">주민번호</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-2" type = "text" name = "regno1"/>-<input class="form-control col-sm-2" type = "text" name = "regno2"/><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6" >
						<label class="col-sm-2 col-form-label" for="addr1">주 소</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" id = "addr1" name = "addr1"/><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="addr2">상세주소</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "addr2"/><br/>
						</div>
					</div>
					
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="zip">우편번호</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "zip"/><br/>
						</div>
					</div>
					<div class=" row col-sm-6">
						<label class="col-sm-2 col-form-label" for="cno">반 번호</label>
						<div class="col-sm-8">
							<input class="form-control col-sm-10" type = "text" name = "cno"><br/>
						</div>
					</div>
					<button id = "btnSubmit" type = "button">등록</button>
					<button type = "button" onclick = "history.go(-1);">취소</button>
				</form>
				<form id = "submitForm">
					<input type = "hidden" name = "tid"/>
					<input type = "hidden" name = "name"/>
					<input type = "hidden" name = "pwd"/>
					<input type = "hidden" name = "email"/>
					<input type = "hidden" name = "phone1"/>
					<input type = "hidden" name = "phone2"/>
					<input type = "hidden" name = "phone3"/>
					<input type = "hidden" name = "regno1"/>
					<input type = "hidden" name = "regno2"/>
					<input type = "hidden" name = "addr1"/>
					<input type = "hidden" name = "addr2"/>
					<input type = "hidden" name = "zip"/>
					<input type = "hidden" name = "cno"/>
				</form>
            </div><!-- div card -->
         </div><!-- div col-12-->
      </div><!-- div row -->
   </div><!-- div content-wrapper -->
   
   <script>
   		$('#btnSubmit').on('click',function(e){
   			var submitForm = $('#submitForm');
   			console.log($("select[name='phone1']").val());
			submitForm.find("[name='tid']").val($("input[name='tid']").val());
			submitForm.find("[name='name']").val($("input[name='name']").val());
			submitForm.find("[name='pwd']").val($("input[name='pwd']").val());
			submitForm.find("[name='email']").val($("input[name='email']").val());
			submitForm.find("[name='regno1']").val($("input[name='regno1']").val());
			submitForm.find("[name='regno2']").val($("input[name='regno2']").val());
			submitForm.find("[name='addr1']").val($("input[name='addr1']").val());
			submitForm.find("[name='addr2']").val($("input[name='addr2']").val());
			submitForm.find("[name='zip']").val($("input[name='zip']").val());
			submitForm.find("[name='cno']").val($("input[name='cno']").val());
			submitForm.find("[name='phone1']").val($("select[name='phone1']").val());
			submitForm.find("[name='phone2']").val($("input[name='phone2']").val());
			submitForm.find("[name='phone3']").val($("input[name='phone3']").val());
			submitForm.attr("action","regist").attr("method","post");
			submitForm.submit();
		});
   </script>
</body>




