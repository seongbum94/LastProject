<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta charset="UTF-8">
<title>교사목록</title>
</head>
<body>
   <div class="content-wrapper">
      <div class="row">
         <div class="col-12 ">
            <div class="card">
            	<table class="table table-hover">
            		<thead>
	            	<tr>
	            		<th class="jsgrid-header-cell jsgrid-header-sortable jsgrid-header-sort jsgrid-header-sort-desc">이름</th>
	            		<th class="jsgrid-header-cell jsgrid-header-sortable jsgrid-header-sort jsgrid-header-sort-desc">아이디</th>
	            		<th class="jsgrid-header-cell jsgrid-header-sortable jsgrid-header-sort jsgrid-header-sort-desc">이메일</th>
	            		<th class="jsgrid-header-cell jsgrid-header-sortable jsgrid-header-sort jsgrid-header-sort-desc">주소</th>
	            		<th class="jsgrid-header-cell jsgrid-header-sortable jsgrid-header-sort jsgrid-header-sort-desc">상세주소</th>
	            		<th class="jsgrid-header-cell jsgrid-header-sortable jsgrid-header-sort jsgrid-header-sort-desc">전화번호</th>
	           		</tr>
	           		</thead>
	           		<tbody>
					<c:forEach var="teacher" items="${employList}">
					<tr class="jsgrid-header-row">
						<td class="jsgrid-cell jsgrid-align-right">
						<a href = "<%=request.getContextPath()%>/group/employ/detail.do?tid=${teacher.tid}">${teacher.name }</a>
						</td>
						<td class="jsgrid-cell jsgrid-align-right">${teacher.tid }</td>
						<td class="jsgrid-cell jsgrid-align-right">${teacher.email}</td>
						<td class="jsgrid-cell jsgrid-align-right">${teacher.addr1}</td>
						<td class="jsgrid-cell jsgrid-align-right">${teacher.addr2}</td>
						<td class="jsgrid-cell jsgrid-align-right">${teacher.phone}</td>
					</tr>
					</c:forEach>
					</tbody>
				</table>
				<%-- 로그인시 c:if 주석해제 --%>
				<%-- <c:if test="${loginUser.role eq 'ROLE_DIRECTOR'}"> --%>
					<button type = button onclick = "javascript:location.href='<%=request.getContextPath()%>/group/employ/registForm.do';">교사등록</button>
				<%-- </c:if> --%>
            </div>
         </div>
      </div>
   </div>
</body>
