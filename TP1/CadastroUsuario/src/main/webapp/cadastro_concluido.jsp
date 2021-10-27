<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="TP1 da disciplina Desenvolvimento Web com Java EE ministrada pelo professo Elberth Moraes">
    <meta name="author" content="Evan Rispoli">
    <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/sign-in/">
    <title>Cadastro de Dados</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type=Text/CSS>
    <link href="css/style.css" rel="stylesheet" type=Text/CSS>
  </head>
  <body>
	  <form class="form-signin" action="home.jsp" method="get">
	      <div class="text-center mb-4">
	        <img class="mb-4" src="img/Infnet-Logo.png" alt="" width="80" height="80">
	        <h1 class="h3 mb-3 font-weight-normal">+ u.getNome() + " - " + u.getEmail() + </h1>
	        <button class="btn btn-lg btn-primary" type="submit">Voltar</button>    
	      </div>
	  </form>     
	  <h1 class="h3 mb-3 font-weight-normal">Listagem de usuários("+usuarios.size()+")</h1>
 
  </body>
  </html>