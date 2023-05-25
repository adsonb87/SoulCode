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
<title>Menu Principal</title>
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
		Menu Principal - Bem Vindo -  <% out.println(nome_session); %>  <!-- ${sessionScope.nome_usuario} -->
			<ul>
				<li><a href="principal.jsp">Inicio</a></li>
				<li><a href="cadastro_produto.jsp">Cadastrar Produto</a></li>
				<li><a href="apaga_produto.jsp">Apagar Produto</a></li>
				<li><a href="sair.jsp">Sair</a></li>
			</ul>
	</div>
	<div>
		<h1><center>Produtos Cadastrados</center></h1>
		<br>
		<div>
			<table>
				<thead>
					<tr>
						<th>Nome</th>
						<th>Qtd Estoque</th>
						<th>Valor</th>
					</tr>
				</thead>
				<tbody>
				<%
				Connection con;
				Class.forName("com.mysql.cj.jdbc.Driver");
						
				String url = "jdbc:mysql://localhost:3306/produtosweb";
				String user = "root";
				String password = "";
				
				con = DriverManager.getConnection(url, user, password);
						
				String sql = "SELECT nome_produto, valor_produto, qtd_estoque FROM produtos";
				PreparedStatement ps;
				
				ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()){
					String nome_produto = rs.getString("nome_produto");
					String valor_produto = rs.getString("valor_produto");
					String qtd_estoque = rs.getString("qtd_estoque");
					
				%>
				
				
					<tr>
						<td><% out.println(nome_produto); %></td>
						<td><% out.println(qtd_estoque); %></td>
						<td><% out.println(valor_produto); %></td>
					</tr>
				<% } %>
				</tbody>
			</table>
		</div>
	</div>
<% } %>
</body>
</html>