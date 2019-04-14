<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
a{
	color:black;
	text-decoration: none;	
}
a:hover{
	color:red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
		<th>花卉编号</th>
		<th>花卉名称</th>
		<th>价格（元）</th>
		<th>花卉数量（支）</th>
		</tr>
		<c:forEach items="${list}" var="flower">
		<tr>
		<td>${flower.id}</td>
		<td>${flower.name}</td>
		<td>${flower.price}</td>
		<td>${flower.num}</td>
		</tr>
		</c:forEach>
	</table>
	<a href="add.jsp">添加花卉信息</a>
</body>
</html>