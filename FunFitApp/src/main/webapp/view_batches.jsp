<%@page import="java.util.Iterator"%>
<%@page import="com.funfit.model.Batch"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<h2>View Batch</h2>
<h3>All Batches information using scriptlet tag</h3>
<table border="2" class="table">
	<tr>
		<th>Batch Id</th>
		<th>Type of Batch</th>
		<th>Time of Batch</th>
	</tr>
	<%
	//Object obj = request.getAttribute("listofbatches");
	Object obj = session.getAttribute("listofbatches");
	List<Batch> listOfBatches = (List<Batch>)obj;			// type casting for that type of object. 
	Iterator<Batch> li = listOfBatches.iterator();
			while(li.hasNext()){
				Batch b = li.next();
				%>
				<tr>
					<td> <%=b.getBid() %> </td>
					<td> <%=b.getTypeofbatch() %> </td>
					<td> <%=b.getTime() %> </td>
				</tr>
				<%
			}
	%>
</table>
<hr/>
<h3>All Batches information using JSTL</h3>
<table border="2" class="table">
	<tr>
		<th>Batch ID</th>
		<th>Type of Batch</th>
		<th>Time of Batch</th>
	</tr>
	<c:forEach items="${sessionScope.listofbatches}" var="batch">
		<tr>
			<td><c:out value="${batch.bid}"></c:out> </td>
			<td><c:out value="${batch.typeofbatch}"></c:out> </td>
			<td><c:out value="${batch.time}"></c:out> </td>
		</tr>
	</c:forEach>
</table>
<a href="index.html">Back</a>
</body>
</html>