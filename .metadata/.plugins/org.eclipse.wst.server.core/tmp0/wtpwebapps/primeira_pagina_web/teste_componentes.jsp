<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8080/primeira_pagina_web/banco_de_dados" method="get">
	<p>Qual dado voce quer alterar: </p>
	<input type="text" name="nome_altera">
	<input type="submit" value="Enviar informacoes">
<!--
	<p>Digite seu nome: </p>
	<input type="text" name="nome"><br>
	<p>Digite seu sobrenome: </p>
	<input type="text" name="last_name"><br>
	<input type="submit" value="Enviar informacoes">
-->
</form>
</body>
</html>