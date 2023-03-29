<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>TODO App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  </head>
  <body>
    <h1 class="text-center text-success">Welcome to ToDo App</h1>
    
    <div class="container-fluid mt-5 row">
  <div class="col-md-4">
  
  <h1>
  
  <div class="list-group">
  <h1 class="list-group-item list-group-item-action active" aria-current="true">
    Menu
  </h1>
  <a href="<c:url value="/add"/>" class="list-group-item list-group-item-action"><h1>Add TODO</h1></a>
  <a href="<c:url value="/home"/>" class="list-group-item list-group-item-action"><h1>View TODO</h1></a>
</div>
  
  
  </h1>
  
  </div>
  <div class="col-md-4">
  <c:if test="${page=='home'}">
  
  
  <h1 class="text-center">All TODO</h1>
   	
  </c:if>
  
  </div>
  
 <div class="col-md-4">
  <c:if test="${page=='add'}">
  
  
  <h1 class="text-center">ADD TODO</h1>
   	
  </c:if>
  
  
  
  
  
  </div>

    </div>
    
    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
  </body>
</html>