<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CUSTOMER PAGE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
	<h2 class="text-success">CUSTOMER FORM</h2>
	<form action="Show.jsp" method="post">
	<input type="password" name="cid" class="form-control" placeholder="ENTER THE CUSTOMER ID"/>
	<input type="text" name="cname" class="form-control" placeholder="ENTER THE CUSTOMER NAME"/>
	<input type="text" name="cdept" class="form-control" placeholder="ENTER THE CUSTOMER DEPARTMENT">
	<input type="text" name="sal" class="form-control" placeholder="ENTER THE SALARY"/>
	<input type="submit" class="btn btn-outline-success" value="REGISTER"/>
   </form>
</div>
</body>
</html>