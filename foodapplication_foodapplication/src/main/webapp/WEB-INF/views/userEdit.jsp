<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		<h3 class="text-muted">Edycja użytkownika: ${user.username}</h3>
		</br>
		<div class="form-group">
			<form:form action="${pageContext.request.contextPath}/user/update"
				modelAttribute="user">
				<small>Wpisz hasło:</small>
				<form:input path="password" class="form-control"
					placeholder="Wpisz hasło:" />
				<br />
				<small>Wpisz email:</small>
				<form:input path="email" class="form-control"
					placeholder="Wpisz email:" />
				<br />
				<form:hidden path="id" />
				<button type="submit" class="btn btn-dark btn-block">Edytuj</button>
			</form:form>
		</div>
	</div>
</body>
</html>