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
<title>Apagar Produto</title>
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
	
		<h1>Selecione o Produto para Excluir</h1>
		<form action="http://localhost:8080/ProdutosWeb/Controller" method="post">
			<select class="form-select" name="nome_excluir" id="nome_excluir" aria-label="Default select exemple">
				<%
				Connection con;
				Class.forName("com.mysql.cj.jdbc.Driver");
						
				String url = "jdbc:mysql://localhost:3306/produtosweb";
				String user = "root";
				String password = "";
				
				con = DriverManager.getConnection(url, user, password);
						
				String sql = "SELECT id_produto, nome_produto, valor_produto, qtd_estoque FROM produtos";
				PreparedStatement ps;
				
				ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()){
					String nome_produto = rs.getString("nome_produto");
				%>
				
				<option value="<% out.print(nome_produto); %>"><% out.print(nome_produto); %></option>
			
				<% } %>
			</select>
			<br>
			<input type="hidden" value="excluir" name="formulario">
			<br>
			<input type="submit" value="Excluir">
		</form>
	
	</div>

<% } %>	
</body>
</html>