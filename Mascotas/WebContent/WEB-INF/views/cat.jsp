<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gatos</title>
</head>
<body>

<div class="row">
	<c:out value="${ cat.showAffection()}"></c:out>
</div>

</body>
</html>