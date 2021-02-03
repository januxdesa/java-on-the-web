<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dogs</title>
</head>
<body>

<div class="row">
	<c:out value="You created  a ${dog.getName()}" > </c:out> 
</div>

<div class="row">
	<c:out value="${ dog.showAffection()}"></c:out>
</div>

</body>
</html>