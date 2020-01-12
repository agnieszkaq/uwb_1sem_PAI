<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pl">
<head>
<title>Insert title here</title>
</head>
<body>

	<h1>dodaj</h1>
		<form:form action = "${pageContext.request.contextPath}/user/save" modelAttribute="user">
		USERNAME Name: <form:input path="username"/><br/>
		PASSWORD Name: <form:input path="password"/><br/>
		EMAIL Name: <form:input path="email"/><br/>
		<form:hidden path = "id"/>
		<button type = "submit">Save</button>
	</form:form>
</body>
</html>