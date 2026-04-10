<%@page import="java.sql.ResultSet"%>
<%@page import="model.FoodDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <jsp:include page="NavClient.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DELETE FOOD</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
	<h2 class="text-dark">AVAILABLE FOOD LIST</h2>
	<table class="table table=hover">
	<thead class="table table-dark">
	<tr>
	<th>FOOD ID</th>
	<th>FOOD NAME</th>
	<th>PRICE</th>
	</thead>
	<%
	    FoodDao fdao=new FoodDao();
	    ResultSet rs=fdao.getData();
	    while(rs.next())
	    {
	
	%>
	<tbody>
	<tr>
	<td><%=rs.getString(1)%></td>
	<td><%=rs.getString(2)%></td>
	<td><%=rs.getDouble(3)%></td>
	</tbody>
	<%
	    }
	%>
	</table>
	
</div>
</body>
</html>