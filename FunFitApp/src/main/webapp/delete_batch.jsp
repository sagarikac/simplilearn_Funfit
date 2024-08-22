<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Delete Batch</h2>

<form action="BatchDeleteController" method="post">
	<label>BId</label>
	<input type="number" name="bid"/><br/>
	
	<input type="submit" value="Delete Product"/>
	<input type="reset" value="reset"/>
</form>

<a href="index.html">Back</a>
</body>
</html>