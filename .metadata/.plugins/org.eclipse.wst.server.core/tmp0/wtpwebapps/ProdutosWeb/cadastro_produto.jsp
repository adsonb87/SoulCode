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
<title>Cadastro Produto</title>
</head>
<body>
<%
	String nome_session = (String)session.getAttribute("nome_usuario");
	
	if(nome_session == null){
		out.println("Para acessar voce deve estar logado !!"); %>
		<br><br> <a href="login.jsp"><button type="button">Voltar ao Login</button></a>
	<%}else {
%>

	<div>
		Menu Principal - Bem Vindo - <% out.println(nome_session); %> 
			<ul>
				<li><a href="principal.jsp">Inicio</a></li>
				<li><a href="cadastro_produto.jsp">Cadastrar Produto</a></li>
				<li><a href="apaga_produto.jsp">Apagar Produto</a></li>
				<li><a href="sair.jsp">Sair</a></li>
			</ul>
	</div>
	<div>
		<h1><center>Cadastro de Produtos</center></h1>
		<form action="http://localhost:8080/ProdutosWeb/Controller" method="post">
			Nome do produto <br>
			<input type="text" name="nome_produto"> <br>
			Quantidade em estoque <br>
			<input type="text" name="quantidade_estoque"> <br>
			Valor do produto <br>
			<input type="text" name="valor_produto"> <br> <br>	
			<input type="hidden" value="cadastro" name="formulario">
			<a href="principal.jsp"><button type="button">Retornar a pagina principal</button></a>
			<input type="submit" value="Cadastrar">
		
		</form>
	</div>
<% } %>
</body>
</html>