<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pl">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Lista użytkowników:</h1>
	<table border="1">
		<tr>
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
				<td><a href="/user/edit/${e.id}">Edytuj</a> | <a
					href="/user/delete/${e.id}">usuń</a></td>
			</tr>
		</c:forEach>
	</table>
	<button onclick="window.location.href = '/user/add'">Idz
		rejestracji</button>
</body>
</html>