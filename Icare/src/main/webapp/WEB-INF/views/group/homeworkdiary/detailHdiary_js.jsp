<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<script>
	$('#modifyBtn').on('click', function(event){
			var formObj = $('[role=form]');
			alert(formObj);
			formObj.attr("action", "modifyForm.do");
			formObj.attr("method", "get");
			formObj.submit();
			
	});
	
	
	$('#removeBtn').on('click', function(){
		var answer = confirm("삭제하시겠습니까?");
		if(answer){
			formObj.attr("action", "remove.do");
			formObj.attr("method", "post");
			formObj.submit();
		}
			
	});
	
	
	$('#listBtn').on('click', function(){
			window.opener.location.reload(true);
			window.close();
			
	});
		
		


</script>