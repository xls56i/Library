<%@page import="cn.edu.xjtu.se.lib.entity.User"%>
<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="zh-cn">
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登录</title>

<!-- Bootstrap -->
<link href="static/css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    
	<!-- Navigation -->
	<nav id="mainNav"
		class="navbar navbar-default navbar-custom navbar-fixed-top">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> Menu <i
					class="fa fa-bars"></i>
			</button>
			<a class="navbar-brand page-scroll" href="index.jsp">Library
				System</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="hidden"><a href="#page-top"></a></li>
				<li><a class="page-scroll" href="views/user/register.jsp">Register</a></li>
				<li><a class="page-scroll" href="">About Us</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>
	<div class="container">

		<div class="col-md-12 column"
			style="height: 180px; background-image: url(static/img/header-bg8.jpg); background-repeat: repeat-x">
		</div>

		<div class="row clearfix">

			<div class="col-md-7 column">
				<img src="static/img/header-bg9.jpg" />
			</div>
			<div class="col-md-5 column">
				<div style="height: 50px"></div>
				<div class="ibox-content">
					<form class="m-t" role="form" action="LoginServlet" method="post">
						<div class="form-group">
							学号：<input type="text" class="form-control" placeholder="学号"
								name="idCard" required="">
						</div>
						<div class="form-group">
							密码：<input type="password" class="form-control"
								placeholder="不少于6位" name="password" required="">
						</div>
						<% String error=(String)request.getAttribute("error");
      						if(error != null){%>
    							<div class="form-group" style="color: red">用户名或密码错误</div>
   						<% } %>    
						<button type="submit" class="btn btn-primary block full-width m-b">登录</button>
						<a href="views/user/register.jsp"><small>忘记密码？</small></a>
						<p class="text-muted text-center">
							<small>没有账号？</small>
						</p>
						<a class="btn btn-sm btn-white btn-block" href="views/user/register.jsp">创建新账号</a>
					</form>

				</div>
			</div>

		</div>

		<footer>
		<div class="container">
			<div class="row">
				<div class="text" style="text-align: center;">
					<span class="copyright">Copyright &copy; IT Project
						Management 2016</span>
				</div>

			</div>
		</div>
		</footer>

	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="staticjs/bootstrap.min.js"></script>
</body>
</html>