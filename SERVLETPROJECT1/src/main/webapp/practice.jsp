<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! ArrayList al; %>
<% al.add("Apple") ;%>
<% al.add("Banana") ;%>
<% al.add("Strawberry") ;%>
<% al.add("Mango") ;%>
<% al.add("Orange") ;%>
<% al.add("WaterMelon") ;%>
<%for(int i=1;i<=6;i++){
	if(al.get(i).equals("Apple"))
		
	
%>
<%} %>

</body>
</html>