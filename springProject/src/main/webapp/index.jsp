<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring WebMVC</title>
</head>
<style>
h1{
color:red;
}
</style>
<body>
<h1>This is home page</h1>
<form action="click" method="get">
<input type="submit" value="Click">
</form>
<h1>${name}</h1>

</body>
</html>