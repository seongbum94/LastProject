<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>

<head>
<meta charset="UTF-8">
<title>알림장</title>
<style>
	#registBtn{
		background-color : #E886B4;	
		color : white;
	
	}
</style>

</head>
<body>
	<div class="content-wrapper">
	
		<h3>알림장 목록</h3>
		<div class ="row">
			<div class="col-12 ">
			<button type="button" class="btn" id="registBtn" onclick="location.href='<%= request.getContextPath()%>/homeworkdiary/registForm.do'">글등록</button>
				<div id="keyword" class="card-tools" style="width:400px;">
					<div class="input-group row">						
						<select class="form-control col-md-4" name="searchType" id="searchType">
							<option value="tcw"  ${pageMaker.cri.searchType eq 'td' ? 'selected':'' }>전 체</option>
							<option value="t" ${pageMaker.cri.searchType eq 't' ? 'selected':'' }>제 목</option>
							<option value="c" ${pageMaker.cri.searchType eq 'd' ? 'selected':'' }>날짜검색</option>
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
			</div> <!-- class="col-12 " -->
		</div>
    		
		<div class="row">			
				<div class="card-body">
					<table class="table table-hover text-nowrap table-border text-center">
							<tr style ="font-size:0.95em;">
								<th>번호</th>
								<th>제목</th>
								<th>내용</th>
								<th>등록일</th>
								<th>조회수</th>
							</tr>
						<c:if test ="${empty diaryList }">
							<tr>
								<td colspan ="5">
									<strong>해당 내용이 없습니다.</strong>
								</td>
							</tr>
						</c:if>	
									
						<c:forEach var="hdiary" items ="${diaryList}">
							<tr style ='font-size : 0.85em;'>
								<td>${hdiary.hwno}</td>
								<td id ="diaryTitle" style="text-align:left;max-width:100px; overflow:hidden; white-space:nowrap; text-overflow:ellipsis;">
									 <a href="<%=request.getContextPath()%>/homeworkdiary/detail.do?hwno=${hdiary.hwno }">
										<span class="col-sm-12">${hdiary.title}</span>
									</a>
								</td>
								<td>${hdiary.content}</td>
								<td><fmt:formatDate value="${hdiary.regdate}" pattern ="yyyy-MM-dd" /></td>
								<td><span class = "badge bg-primary">${hdiary.viewcnt}</span></td>
							</tr>
						</c:forEach>
					</table>
				</div><!-- div card-body -->
				<div class ="card-footer">
					<%@ include file = "/WEB-INF/views/pagination/pagination.jsp" %>
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
			</div> <!-- class="row" -->
</div> <!--div class="content-wrapper  -->
		
		
<script>
	
	$('#searchBtn').on('click',function(e){
		
		var jobForm=$('#jobForm');
		jobForm.find("[name='page']").val(1);
		jobForm.find("[name='searchType']").val($('select[name="searchType"]').val());
		jobForm.find("[name='keyword']").val($('input[name="keyword"]').val());
		
		
		jobForm.attr("action","list.do").attr("method","get");
		jobForm.submit();
	});
	
	
</script>
		
		
		
</body>
