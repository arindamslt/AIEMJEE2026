<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <jsp:include page="Nav.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
	<h2 class="text-primary">ADD FOOD</h2>
	<form action="AddFoodServe" method="post">
	<input type="text" name="fid" class="form-control" placeholder="ENTER THE FOOD ID"/>
	<input type="text" name="fname" class="form-control" placeholder="ENTER THE FOOD NAME"/>
	<input type="text" name="price" class="form-control" placeholder="ENTER THE FOOD PRICE"/>
	<input type="submit" class="btn btn-outline-primary" value="ADD"/>
   </form>
</div>
</body>
</html>