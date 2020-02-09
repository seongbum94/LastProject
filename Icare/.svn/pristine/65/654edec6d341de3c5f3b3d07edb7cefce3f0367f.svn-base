<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta charset="UTF-8">
<title>제목</title>]

<style>
.content {
	padding-top: 10px;
}
</style>
</head>
<body>
	<div class="content-wrapper">
		<!-- Main content -->
		<section class="content">
			<div class="container-fluid">
				<!-- Main content -->

				<div class="content">
					<div class="container-fluid">
						<div class="row">
							<div class="col-lg-12">
								<div class="card">
									<h1>공유 게시판 내역~~~</h1>
									<table class="table table-hover text-nowrap table-border text-center">
										<c:forEach var="approval" items="${approvalList}">
											<tr>
												<th>번호</th>
												<th>제목</th>
												<th>내용</th>
											</tr>
											<tr>
												<td>${approval.eno }</td>
												<td>${approval.title }</td>
												<td>${approval.content }</td>
											</tr>
										</c:forEach>
									</table>
								</div>
							</div>
						</div>
						<!-- 첫번째 row -->
					</div>
					<!-- /.container-fluid -->
				</div>
				<!-- /.content -->
			</div>
			<!-- /.container-fluid -->
		</section>
		<!-- /.content -->

	</div>
</body>