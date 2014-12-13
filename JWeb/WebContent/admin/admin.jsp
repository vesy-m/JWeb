<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='http://fonts.googleapis.com/css?family=Marck+Script'
	rel='stylesheet' type='text/css'>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/admin.css" />

<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/admin.js"></script>
<title>Insert title here</title>
</head>
<body onload="init()">

	<%@ include file="../pages/barTop.jsp"%>


	<%@ include file="catalogue.jsp"%>
	<%@ include file="news.jsp"%>
	<%@ include file="products.jsp"%>
	<%@ include file="users.jsp"%>

</body>
</html>