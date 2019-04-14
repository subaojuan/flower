<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("form").submit(
				function() {
					if ($(":text:eq(0)").val() == ""
							|| $(":text:eq(1)").val() == ""
							|| $(":text:eq(2)").val() == "") {
						alert("请添加完整信息");
						return false;
					}
				});
	});
</script>
</head>
<body>
	<form action="insert" method="post">
		<table border="1" align="center">
			<tr>
				<td colspan="2"
					style="text-align: center; font-size =30px; font-weight: bold;">
					花卉信息</td>
			</tr>
			<tr>
				<td><b>花卉名称</b></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><b>花卉价格</b></td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td><b>花卉数量</b></td>
				<td><input type="text" name="num"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交"><input
					type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>