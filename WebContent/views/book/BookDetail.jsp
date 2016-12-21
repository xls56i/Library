<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@page import="cn.edu.xjtu.se.lib.entity.*"%>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% User user=(User)session.getAttribute("user"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书详情</title>
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
	<link href="static/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="syatic/css/agency.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron"></div>
			<div class="row" style="width:800;font-family:sans-serif;">
				<div class="col-md-4">
					<div class="thumbnail">
						<img style="width:260px;height:320px" src="static/img/Algorithm.jpg" />
						<div class="caption"></div>
					</div>
				</div>
							<h3 style="font-family:sans-serif;color:gray;text-align:center">
								算法导论
							</h3>
							<ul style="color:gray;float:right;display:block">
							<li>作者：Thomas H. Cormen, Charles E</li>
							<li>出版社：机械工业出版社</li>
							</ul>
							<p style="font-family:sans-serif;color:gray">
							&nbsp&nbsp Introduction to Algorithms is a book by Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein.
							It is used as the textbook for algorithms courses at many universities[citation needed] and is commonly cited as a reference for algorithms in published papers, 
							with over 8900 citations documented on CiteSeerX.[1] The book sold half a million copies during its first 20 years.
							Its fame has led to the common use of the abbreviation "CLRS" (Cormen, Leiserson, Rivest, Stein), or, in the first edition, "CLR" (Cormen, Leiserson, Rivest).
							</p>
							<p>
								 &nbsp&nbsp<a class="btn btn-primary" href="#" style="margin-top:30px">查看详情</a>
							</p>
			</div>
			<nav class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">XJTU</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="SearchHere" />
						</div> <button type="submit" class="btn btn-default">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
							<!-->用session显示输出名字<-->
							 <li><a href="#">欢迎你:XXX</a></li>
							 <li><a href="Index.html">我的信息</a></li>
							 <li><a href="Index.html">注销</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
</div>
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <span class="copyright">Copyright &copy; IT Project Management 2016</span>
                </div>
                <div class="col-md-4">
                    <ul class="list-inline social-buttons">
                        <li><a href="#"><i class="fa fa-twitter"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-facebook"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a>
                        </li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <ul class="list-inline quicklinks">
                        <li><a href="#">Don't click!</a>
                        </li>
                        <li><a href="#">Roll up please</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
  </body>
</html>