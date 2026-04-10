<%@page import="model.OrderDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="model.FoodDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <jsp:include page="NavClient.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILLING</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:50%;margin:50px auto;">
	<h2 class="text-dark">BILLING INFORMATION</h2>
	<table class="table table=hover">
	<thead class="table table-dark">
	<tr>
	<th>ORDER ID</th>
	<th>ORDER DATE</th>
	<th>FOOD ID</th>
	<th>FOOD NAME</th>
	<th>QUANTITY</th>
	<th>PRICE</th>
	<th>TOTAL PRICE</th>
	<th>USERNAME </th>
	</thead>
	<%
	    OrderDao odao=new OrderDao();
	    ResultSet rs=odao.getData();
	    while(rs.next())
	    {
	
	%>
	<tbody>
	<tr>
	<td><%=rs.getInt(1)%></td>
	<td><%=rs.getDate(2)%></td>
	<td><%=rs.getString(3)%></td>
	<td><%=rs.getString(4)%></td>
	<td><%=rs.getInt(5)%></td>
	<td><%=rs.getDouble(6)%></td>
	<td><%=rs.getDouble(7)%></td>
	<td><%=rs.getString(8)%></td>
	</tbody>
	<%
	    }
	%>
	</table>
	
</div>
</body>
</html>