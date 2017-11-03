<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<script type="text/javascript" src="/resource/jquery-1.11.0.min.js"></script>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript">
$(function(){

});
</script>
</head>
<body>
	<table>
		<thead>
		<tr>
			<th>姓名</th>
			<th>性别</th>
			<th>年龄</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="user" items="${users }" varStatus="index">
		<tr>
			<td>${user.name }</td>
			<td>${user.sex }</td>
			<td>${user.age }</td>
		</tr>
		</c:forEach>
		</tbody>
	</table>
	
	
	<form action="reg.do">
	<div>
	<p>名字</p><input name="name" type="text" value="">
	</div>
	<div>
	<p>性别</p><input name="sex" type="text" value="">
	</div>
	<div>
	<p>年龄</p><input name="age" type="text" value="">
	</div>
	<input type="submit" value="提交">
	</form>
</body>
</html>