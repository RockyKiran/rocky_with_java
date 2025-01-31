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

<%User user=(User)request.getAttribute("user"); %>
<form action="edit">
First id: <input type="number" name="id"  value="<%=user.getId() %>" readonly="readonly"><br>
First name: <input type="text" name="fname"  value="<%=user.getFname() %>" readonly="readonly"><br>
Last name: <input type="text" name="lname" value="<%=user.getLname() %>"><br>
age: <input type="number" name="age" value="<%=user.getAge() %>"><br>
email: <input type="email" name="email" value="<%=user.getEmail() %>"><br>
phone no: <input type="tel" name="phno" value="<%=user.getPhno() %>"><br>
gender: <input type="text" name="gender" value="<%=user.getGender() %>"><br>
password: <input type="password" name="pwd" value="<%=user.getPwd() %>"><br>

<button>EDIT</button>
</form>

</body>
</html>