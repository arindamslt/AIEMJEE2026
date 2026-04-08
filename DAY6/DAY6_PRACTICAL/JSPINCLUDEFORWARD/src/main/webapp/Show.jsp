<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <jsp:include page="img1.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW PAGE</title>
</head>
<body>
<h2>LOGIN INFORMATION DETAILS</h2>
<%
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");
%>
<h2>USERNAME:<%=uname %></h2>
<h2>PASSWORD:<%=pass %></h2>
</body>
</html>