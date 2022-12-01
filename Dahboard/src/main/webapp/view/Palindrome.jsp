<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">

  <title>Classic Login Form Example</title>
  <link href="https://fonts.googleapis.com/css?family=Assistant:400,700" rel="stylesheet"><link rel="stylesheet" href="./style.css">

</head>
<body>
<!-- partial:index.partial.html -->
<section class='login' id='login'>
   <a href="<%=request.getContextPath()%>/view/Index.jsp" id="back">Back
  </a>
  <div class='head'>
  <h1 class='company'>C G I M</h1>
  </div>
  <p class='msg'>Welcome back</p>
  <div class='form'>
<form action = "<%=request.getContextPath()%>/Palindrom" method="post" %>
<h2 class = "text-center">Palindrome check input</h2>
<br/>
<div class = "form-group">
<input type = "text" class="form-control" name = "number" placeholder = "Enter the number">
</div>
<br/>
<div class = "align center">
	<input type = "submit" class="button" name ="btn" value="Calculate"/>
	</div>
	</form>
  </div>
</section>
<footer>
  
</footer>
<!-- partial -->
  <script  src="./script.js"></script>

</body>
<style>
  <%@
    include file = "/css/style.css"
    %>
</style>
</html>
