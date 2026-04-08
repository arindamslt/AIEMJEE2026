<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT PAGE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
	<h2 class="text-primary">STUDENT FORM</h2>
	<form action="Semester.jsp" method="post">
	<input type="text" name="rollno" class="form-control" placeholder="ENTER THE ROLLNO"/>
	<input type="text" name="sname" class="form-control" placeholder="ENTER THE NAME"/>
	<input type="text" name="ayr" class="form-control" placeholder="ENTER THE ADMISSION YEAR"/>
	<input type="submit" class="btn btn-outline-primary" value="CONTINUE"/>
   </form>
</div>
</body>
</html>