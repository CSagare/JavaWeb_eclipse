<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "<%=request.getContextPath()%>/Index" method="post" >
  

    <input type = "submit" class="button1"  name ="btn" value="Arithmetic"/>
    <input type = "submit" class="button1" name ="btn" value="SimpleInterest"/>
   
    <br>
    <input type = "submit" class="button1" name ="btn" value="Area of circle"/>
   
    <input type = "submit" class="button1" name ="btn" value="Palindrome"/>
   

    </form>
</body>
<style>
  <%@
    include file = "/css/style.css"%>
</style>
</html>