<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>

<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->

<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="x-ua-compatible" content="ie=edge">

  <title><decorator:title default="I-CARE"></decorator:title></title>

  <!-- Font Awesome Icons -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bootstrap/plugins/fontawesome-free/css/all.min.css">
    <!-- jsGrid -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bootstrap/plugins/jsgrid/jsgrid.min.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bootstrap/plugins/jsgrid/jsgrid-theme.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bootstrap/dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
  <!-- jQuery -->
  <script src="<%=request.getContextPath()%>/resources/bootstrap/plugins/jquery/jquery.min.js"></script>
<decorator:head/>
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="<%=request.getContextPath() %>/member/list.do" class="nav-link">MyPage</a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="<%=request.getContextPath() %>/board/list.do" class="nav-link">공지사항</a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="<%=request.getContextPath() %>/pds/list.do" class="nav-link">근태관리</a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="<%=request.getContextPath() %>/pds/list.do" class="nav-link">일정관리</a>
      </li>
    </ul>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
    </ul>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="index3.html" class="brand-link">
      <img src="<%=request.getContextPath()%>/resources/bootstrap/dist/img/icare-logo.png" alt="AdminLTE Logo" class="brand-image elevation-3"
           style="opacity: .8">
      <span class="brand-text font-weight-light"></span><br>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="<%=request.getContextPath()%>/member/getPicture.do?picture=${loginUser.picture }" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
        	<div class="row">
          		<a class="col-md-7" href="javascript:OpenWindow('<%=request.getContextPath() %>/member/detail.do?id=${loginUser.id }','',800,600)" class="d-block">${loginUser.id }</a>
          		<button class="btn btn-xs btn-primary col-xs-3" type="button" onclick="location.href='<%=request.getContextPath()%>/commons/logout.do';">Logout</button>
        	</div>
          <a href="tel:${loginUser.phone }">tel : ${loginUser.phone }</a><br>
          <a href="mailto:${loginUser.email }">email : ${loginUser.email }</a>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
      	<ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" data-accordion="false">
      		<li class="nav-item">
	          <a href="#" class="nav-link">
	            <i class="far fa-envelope nav-icon"></i></i>
	            <p>전자메일</p>
	          </a>
	        </li>
      		<li class="nav-item">
	          <a href="#" class="nav-link">
	            <i class="fas fa-user-friends nav-icon"></i>
	            <p>전자결재</p>
	          </a>
	        </li>
      		<li class="nav-item">
	          <a href="#" class="nav-link">
	            <i class="fas fa-file-download nav-icon"></i>
	            <p>근태관리</p>
	          </a>
	        </li>
      		<li class="nav-item">
	          <a href="#" class="nav-link">
	            <i class="fas fa-file-download nav-icon"></i>
	            <p>게시판</p>
	          </a>
	        </li>
      		<li class="nav-item">
	          <a href="<%= request.getContextPath() %>/group/share/list.do" class="nav-link">
	            <i class="fas fa-file-download nav-icon"></i>
	            <p>컨테츠 공유</p>
	          </a>
	        </li>
      		<li class="nav-item">
	          <a href="#" class="nav-link">
	            <i class="fas fa-file-download nav-icon"></i>
	            <p>교보재 관리</p>
	          </a>
	        </li>
      		<li class="nav-item">
	          <a href="#" class="nav-link">
	            <i class="fas fa-file-download nav-icon"></i>
	            <p>식단</p>
	          </a>
	        </li>
      		<li class="nav-item">
	          <a href="#" class="nav-link">
	            <i class="fas fa-file-download nav-icon"></i>
	            <p>원생 관리</p>
	          </a>
	        </li>
      		<li class="nav-item">
	          <a href="#" class="nav-link">
	            <i class="fas fa-file-download nav-icon"></i>
	            <p>일정 관리</p>
	          </a>
	        </li>
      		<li class="nav-item">
	          <a href="#" class="nav-link">
	            <i class="fas fa-file-download nav-icon"></i>
	            <p>상담 관리</p>
	          </a>
	        </li>
      	</ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>
