<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Add Participant</h2>

<form action="ParticipantStoreController" method="post">
    <label>PID</label>
	<input type="number" name="pid"/><br/>
	<label>PName</label>
	<input type="text" name="pname"/><br/>
	<label>Age</label>
	<input type="number" name="age"/><br/>
	<label>BatchId</label>
	<input type="number" name="bid"/><br/>
	<input type="submit" value="Store Participant"/>
	<input type="reset" value="reset"/>
</form>

<a href="index.html">Back</a>
</body>
</html>