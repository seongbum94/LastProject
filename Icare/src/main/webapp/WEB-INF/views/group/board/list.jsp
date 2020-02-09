<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page trimDirectiveWhitespaces="true" %>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<!-- jQuery -->
  <script src="<%=request.getContextPath()%>/resources/bootstrap/plugins/jquery/jquery.min.js"></script>

<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<div class="content-wrapper">
	<h1>공지사항</h1>	
	<div class="row">
			<div class="col-12 ">
				<div class="card">
				  <div class="card-header with-border">
					<button id="registBtn" onclick=<%=request.getContextPath() %>/group/board/notice/rigistForm.do>글등록</button>
					 <div id="keyword" class="card-tools" style="width:350px;">
					  <div class="input-group row">
						
						<select class="form-control col-md-4" name="searchType" id="searchType">
							<option value="tcw"  ${pageMaker.cri.searchType eq 'tcw' ? 'selected':'' }>전 체</option>
							<option value="t" ${pageMaker.cri.searchType eq 't' ? 'selected':'' }>제 목</option>
							
							<option value="c" ${pageMaker.cri.searchType eq 'c' ? 'selected':'' }>내 용</option>
							<option value="tc" ${pageMaker.cri.searchType eq 'tc' ? 'selected':'' }>제목+내용</option>
													
						</select>					
						<input  class="form-control" type="text" name="keyword" placeholder="검색어를 입력하세요." value="${param.keyword }"/>
						<span class="input-group-append">
							<button class="btn btn-primary" type="button" onclick="searchList_go(1);" 
							data-card-widget="search">
								<i class="fa fa-fw fa-search"></i>
							</button>
						</span>
					</div>
				</div>
				</div>		
					<table class="table table-hover text-nowrap">
						<tr style ="font-size:0.95em;">
					         <th style="width:10%;">번호</th> 
					         <th style="width:50%;">제목</th> 
					        
					         <th style="width:10%;">작성일</th>
					         <th style="width:10%;">조회수</th>
					      </tr>
				      <c:forEach var="board" items="${boardList}">

					      <tr>
					      	 <td>${board.bno }</td>
					         <td id="boardTitle">
					         <a href=<%=request.getContextPath() %>/group/board/notice/detail.do?bno=${board.bno }>
					         ${board.title }</td>
					         </a>
					        
					         <td>${board.regdate }</td>
					         <td>${board.viewcnt }</td>
					      </tr>
			
				      </c:forEach>
				   </table>
	          </div>
	     </div>
	   </div>
   </div>
   
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
    $('#searchBtn').on('click',function(e){
    	var jobForm=$('#jobForm');
		jobForm.find("[name='page']").val(1);
		jobForm.find("[name='searchType']").val($('select[name="searchType"]').val());
		jobForm.find("[name='keyword']").val($('input[name="keyword"]').val());
		
		jobForm.attr("action","list.do").attr("method","get");
		jobForm.submit();
    })
    
    $('#registBtn').on('click',function(e){
    	location.href="<%=request.getContextPath() %>/group/board/notice/registForm.do";
    })
   </script>
</body>
</html>