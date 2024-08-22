<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Update Participant</h2>

<form action="ParticipantUpdateController" method="post">
    <label>PID</label>
	<input type="number" name="pid"/><br/>
	<label>Pname</label>
	<input type="text" name="pname"/><br/>
	<label>Age</label>
	<input type="number" name="age"/><br/>
	<label>Batch Id</label>
	<input type="number" name="bid"/><br/>
	<input type="submit" value="Update Product"/>
	<input type="reset" value="reset"/>
</form>

<a href="index.html">Back</a>
</body>
</html>