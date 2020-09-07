<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!--  <link href="/style.css" rel="stylesheet" /> --> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="https://grandcircusco.github.io/demo-apis/index.html">Back</a>
<a href="https://grandcircusco.github.io/demo-apis/planets.json">JSON</a>
<h1>Inner Planets</h1>
<table>
<tr>
<th rowspan="2">Name</th>
<th rowspan="2">Colors</th>
<th colspan="3">Distance From Sun</th>
</tr>
<tr>
<th>Avg</th>
<th>Min</th>
<th>Max</th>
</tr>

<c:forEach var="planet" items="${planets}">
	<tr>
	<td>${planet.name}</td>
	
	<td>
	<ul>
	<c:forEach var="color" items="${planet.colors}">
		<li>${color}</li>
	</c:forEach></ul></td>
			
				<td>${planet.milesFromSun.min} million mi</td>
				<td>${planet.milesFromSun.average} million mi</td>
				<td>${planet.milesFromSun.max} million mi</td>
		
	</tr>
</c:forEach>













</table>


</body>
</html>