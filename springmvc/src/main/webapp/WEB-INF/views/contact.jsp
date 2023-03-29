<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  </head>
  <body>
  <div class="text-center">
  
  <h1 class="text-success">Happy Coding</h1>
  
  
  </div>
  <br>
  <div class="container-fluid text-center" >
  
  <form action="processform" method="Post">
  <div class="mb-3">
    <label for="exampleInputUser" class="form-label text-danger"><b>User Name</b></label>
    <input type="text" class="form-control" id="exampleInputUser" name="userName" >
  </div>
  
   <div class="mb-3">
    <label for="exampleInputEmail" class="form-label text-danger"><b>Email</b></label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="userEmail" >
  </div>
  
  <div class="mb-3">
    <label for="exampleInputPassword" class="form-label text-danger"><b>Password</b></label>
    <input type="password" class="form-control" id="exampleInputPassword" name="userPassword" >
  </div>
  <div class="text-center">
  <button type="submit" class="btn btn-success">Submit</button>
  </div>
  </div>
  
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
  </body>
</html>