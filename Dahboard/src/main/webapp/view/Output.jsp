<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link href="https://fonts.googleapis.com/css?family=Assistant:400,700" rel="stylesheet"><link rel="stylesheet" href="./style.css">
<title>Smart Calc</title>
</head>
<body>

<section class='login' id='login'>
  <div class='head'>
  <h1 class='company'>C G I M</h1>
  </div>
  <div class='form'>

<h1>Result is <%=request.getAttribute("result") %></h1>
  </div>
</section>
<footer>
  
</footer>
<!-- partial -->
  <script  src="./script.js"></script>

</body>
<style>
  <%@
    include file = "/css/style.css"%>
</style>
</html>
