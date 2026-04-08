<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="text-align: center;">JSP PAGE</h2>
<%!
public int multiply(int a,int b)
{
	return(a*b);
}
%>
<%
int x=25;
int y=60;
%>
RESULT:<%=x+y %>
<br/>
<% out.println(x+y); %>

<%=multiply(10,20) %>
</body>
</html>