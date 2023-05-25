<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Minha primeira JSP</title>
</head>
<body>
	Conteudo da minha pagina <br>
	<% String nome = "Adson";
		out.println("Digitando comandos em java"); %> <br>
	
	<% out.println("Nome: " + nome); %>
</body>
</html>