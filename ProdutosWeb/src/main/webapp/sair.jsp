<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sair do sistema</title>
</head>
<body>
	<% session.invalidate(); %>

	<h1>Bem vindo ao sistema</h1>
	
	<a href="login.jsp"><button type="button">Voltar ao Login</button></a>
</body>
</html>