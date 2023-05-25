<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Bem vindo ao sistema</h1>
	<h2>Realize o seu login</h2>
	
	<form action="http://localhost:8080/ProdutosWeb/Controller" method="post">
		Login <br>
		<input type="text" name="login"> <br>
		Senha <br>
		<input type="password" name="senha"> <br><br>
		<input type="hidden" value="login" name="formulario">
		<input type="submit" value="Entrar no sistema">
		
	</form>
</body>
</html>