<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pl">
<head>
<link
	href="https://unpkg.com/bootstrap@4.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h3 class="text-muted">
			<button onclick="window.location.href = '/user/add'"
				class="btn btn-dark">Dodaj nowego użytkownika</button>
			Lista użytkowników:
		</h3>
		<table class="table table-striped table-bordered">
			<tr class="thead-dark">
				<th>Nazwa :</th>
				<th>emial:</th>
				<th>hasło:</th>
				<th>EDYTUJ | USUŃ</th>
			</tr>
			<c:forEach items="${list}" var="e">
				<tr>
					<td>${e.username}</td>
					<td>${e.password}</td>
					<td>${e.email}</td>
					<td><a class="btn btn-success" href="/user/edit/${e.id}">Edytuj</a>
						| <a class="btn  btn-danger" href="/user/delete/${e.id}">Usuń</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>