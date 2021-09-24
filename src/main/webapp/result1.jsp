<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hours to Minutes Calculator Results</title>
</head>
<body>
<h1>Hours to Minutes Calculator Results</h1>
<p>${userHours1.getHours()} Hours is equal to : <br />
${userHours1.getMinutes()} Minutes <br />
</p>
<a href="index2.jsp">Select to go to form 2</a>
<a href="homepage.jsp">Select go back to the homepage</a>
</body>
</html>