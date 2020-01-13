<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pl">
<head>
<link href="https://unpkg.com/bootstrap@4.1.1/dist/css/bootstrap.min.css" rel="stylesheet" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h2>SKŁADNIK:</h2>
	<table class="table table-striped table-bordered">
		<tr class="thead-dark">
			<th>Nazwa:</th>
			<th>Kalorie:</th>
			<th>białko:</th>
			<th>tłuszcz:</th>
			<th>węglowodany:</th>
		</tr>
		<c:forEach items="${ingredient}" var="e">
			<tr>
				<td>${e.name}</td>
				<td>${e.calories}</td>
				<td>${e.protein}</td>
				<td>${e.fat}</td>
				<td>${e.carb}</td>
			</tr>
		</c:forEach>
	</table>
	<button onclick="window.location.href = '/user/add'">Idz
		rejestracji</button>
		</div>
</body>
</html>