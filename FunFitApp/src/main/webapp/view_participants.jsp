<%@page import="java.util.Iterator"%>
<%@page import="com.funfit.model.Participant"%>
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
<h2>View Participants</h2>
<h3>All Participants information using scriptlet tag</h3>
<table border="2" class="table">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Age</th>
		<th>Batch Id</th>	
	</tr>
	<%
	//Object obj = request.getAttribute("listofparticipants");
	Object obj = session.getAttribute("listofparticipants");
	List<Participant> listOfParticipants = (List<Participant>)obj;			// type casting for that type of object. 
	Iterator<Participant> li = listOfParticipants.iterator();
			while(li.hasNext()){
				Participant p = li.next();
				%>
				<tr>
					<td> <%=p.getPid() %> </td>
					<td> <%=p.getPname() %> </td>
					<td> <%=p.getAge() %> </td>
					<td> <%=p.getBid() %> </td>
				</tr>
				<%
			}
	%>
</table>
<hr/>
<h3>All Participants information using JSTL</h3>
<table border="2" class="table">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Age</th>
		<th>Batch Id</th>
	</tr>
	<c:forEach items="${sessionScope.listofparticipants}" var="participant">
		<tr>
			<td><c:out value="${participant.pid}"></c:out> </td>
			<td><c:out value="${participant.pname}"></c:out> </td>
			<td><c:out value="${participant.age}"></c:out> </td>
			<td><c:out value="${participant.bid}"></c:out> </td>
		</tr>
	</c:forEach>
</table>
<a href="index.html">Back</a>
</body>
</html>