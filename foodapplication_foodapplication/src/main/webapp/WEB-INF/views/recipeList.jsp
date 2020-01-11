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

	<h1>Lista przepisów:</h1>
	<table>
		<tr>
			<th>Nazwa:</th>
			<th>Opis:</th>
			<th>ID użytkownik:</th>
			<th>ID typu:</th>
		</tr>
			<c:forEach items="${list}" var="e">
				<tr>
					<td>${e.description}</td>
					<td>${e.text}</td>
					<td>${e.id_user}</td>
					<td>${e.id_recipe_type }</td>
				</tr>
			</c:forEach>
	</table>

</body>
</html>