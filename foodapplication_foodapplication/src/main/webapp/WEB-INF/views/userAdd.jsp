<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<h3 class="text-muted">Rejestracja:</h3>
		<div class="form-group">
			<form:form action="${pageContext.request.contextPath}/user/save"
				modelAttribute="user">
				<small>Nazwa użytkownika:</small>
				<form:input path="username" class="form-control"
					placeholder="Wpisz nazwę użytkownika:" />
				<br />
		<p class="bg-warning">${message}</p>
	<small>Hasło:</small>
				<form:input path="password" class="form-control"
					placeholder="Wpisz hasło:" />
				<br />
				<small>Email:</small>
				<form:input path="email" class="form-control"
					placeholder="Wpisz email:" />
				<br />
				<form:hidden path="id" />
				<button type="submit" class="btn btn-dark btn-block">Zapisz</button>
			</form:form>
		</div>
	</div>
</body>
</html>