<%@page import="java.util.List"%>
<%@page import="resister.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>succesfully.......</h2>
	<% List<User> user=(List<User>)request.getAttribute("user"); %>
	<%= user %>

	<table border="2px solid black">
		<tr>
			<th>id</th>
			<th>FIRSTNAME</th>
			<th>LASTNAME</th>
			<th>EMAIL</th>
			<th>PHONE</th>
			<th>GENDER</th>
			<th>AGE</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>
	<% for(User u:user){ %>
		<tr>
		<td> <%=u.getId()%></td>
			<td>
				<%=u.getFname() %>
			</td>
			<td> <%=u.getLname() %></td>
			<td><%=u.getEmail() %></td>
			<td><%=u.getPhno() %></td>
			<td><%=u.getGender() %></td>
			<td><%=u.getAge() %></td>
			<td><a href="delete?id=<%=u.getId()%>"><button>Delete</button></a></td>
			<td><a href="update?id=<%=u.getId()%>"><button>Update</button></a></td>
			
		</tr>
		<%} %>
	</table>
</body>
</html>