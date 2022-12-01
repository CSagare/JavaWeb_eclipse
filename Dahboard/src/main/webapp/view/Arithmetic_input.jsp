

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

  <title>Classic</title>
  <link href="https://fonts.googleapis.com/css?family=Assistant:400,700" rel="stylesheet"><link rel="stylesheet" href="./style.css">
</head>
<style>
  <%@
    include file = "/css/style.css"
    %>
    
</style>

<body>
<section class='login' id='login'>
   <a href="<%=request.getContextPath()%>/view/Index.jsp" id="back">Back
  </a>
  <div class='head'>
  <h1 class='company'>C G I M</h1>
  </div>
  <div class='form'>
   
<div class="container">
<div class = "row">
<div class = "form_bg">
<form action = "<%=request.getContextPath()%>/ArithmeticController" method="post">
<h2 class = "text-center"> Arithmetic  Input Page</h2>
<br/>
<div class = "form-group">
<input type = "text" class="form-control" name = "txtFirst" placeholder = "Enter First no">
</div>
<div class = "form group">
<input type = "text" class="form-control" name ="txtSecond" placeholder = "Enter second no"></div>
<br/>
<div class = "align center">
	<input type = "submit" class="button" name ="btn" value="Add"/>
	<input type = "submit" class="button" name = "btn" value = "Subtract"/>
	<input type="submit" class = "button" name = "btn" value = "Multiply"/>
	</div>
	</form>
	</div></div></div>
    
    </div>
    </section>
    
</body>
</html>