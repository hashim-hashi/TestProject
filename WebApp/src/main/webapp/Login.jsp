<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div align=center>
<h1>User Login</h1>

<form action=LoginServlet method=post>
<table>
<tr><td>Enter Name:</td><td><input type=text name=txtName></td></tr>
<tr><td>Enter Password:</td><td><input type=password name=txtpwd></td></tr>
<tr><td><input type=submit value=Login></td><td><input type=reset></td></tr>
</table>
</form>
</div>
</body>
</html>