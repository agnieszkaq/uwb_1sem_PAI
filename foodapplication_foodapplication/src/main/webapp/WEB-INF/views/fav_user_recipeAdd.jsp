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

	<h1>ULUBIONY przepis:</h1>
	<form action="fav_user_recipe/save" modelAttribute="fav_user_recipe">
	ID user: <input name="id_user"/><br/>
	ID recipe: <input name="id_recipe"/><br/>
		 <br />
		<button type="submit">Zapisz</button>
	</form>
</body>
</html>