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
    include file = "/css/style.css"%>
</style>

<body>
<section class='login' id='login'>
  <div class='head'>
  <h1 class='company'>C G I M</h1>
  </div>
  <p class='msg'>Welcome back</p>
  <div class='form'>
   <form action = "<%=request.getContextPath()%>/Index" method="post" >

    <input type = "submit" class="button"  name ="btn" value="Arithmetic"/>
    <input type = "submit" class="button" name ="btn" id=simple value="Simple Interest"/>
    <br>
    <input type = "submit" class="button" name ="btn" value="Area of circle"/>
    <input type = "submit" class="button" name ="btn" value="Palindrome"/>
    </form>
    </div>
    </section>
    
</body>
</html>