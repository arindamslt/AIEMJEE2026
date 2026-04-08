<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>EMPLOYEE INFORMATION</h2>
<%
   String cid=request.getParameter("cid");
   String cname=request.getParameter("cname");
   String cdept=request.getParameter("cdept");
   double sal=Double.parseDouble(request.getParameter("sal"));

%>
<h3>CUSTOMER ID:<%=cid %></h3>
<h3>NAME:<%=cname %></h3>
<h3>DEPARTMENT:<%=cdept%></h3>
<h3>SALARY:<%=sal %></h3>
</body>
</html>