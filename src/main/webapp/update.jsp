<%@page import="dto.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


   <% Product p = (Product)request.getAttribute("pro"); %>
   
    <h1>UPDATE THE DATA</h1><br><br>
    <form action="update" >
     id        :<input type="number" name="id" value="<%= p.getId() %>" readonly="readonly"><br><br>
     name      :<input type="text" name="name" value="<%= p.getName() %>"><br><br>
     brand     :<input type="text" name="brand" value="<%= p.getBrand() %>"><br><br>
     price     :<input type="number" name="price" value="<%= p.getPrice() %>"><br><br>
     quantity  :<input type="number" name="quantity" value="<%= p.getQuantity() %>"><br><br>
     
     <input type="submit" value="save">
</body>
</html>