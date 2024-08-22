<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Update Batch</h2>

<form action="BatchUpdateController" method="post">
    <label>Batch Id</label>
	<input type="number" name="bid"/><br/>
	<label>Type of Batch</label>
	<input type="text" name="typeofbatch"/><br/>
	<label>Time of Batch</label>
	<input type="text" name="time"/><br/>
	<input type="submit" value="Update Product"/>
	<input type="reset" value="reset"/>
</form>

<a href="index.html">Back</a>
</body>
</html>