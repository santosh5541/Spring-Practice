<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

String name =(String) request.getAttribute("name");
String hello = (String) request.getAttribute("hello");
String ashmita = (String)request.getAttribute("ashmita");
%>
<h1>name is ${name }</h1>
<h1><%=hello %></h1>
<h1>Who is beside me ??</h1>
<br>

<h1> <%=ashmita %></h1>
</body>
</html>

