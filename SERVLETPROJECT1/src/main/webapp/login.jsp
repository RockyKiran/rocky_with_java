<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="resister.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login">
<%! String s; %>
<%s=(String)request.getAttribute("msg");  %>


<% if(s!=null){ %>
<h2 style="color:red"><%= s %></h2><br>
<%} %>
enter email:<input type="text" name="email">
enter password:<input type="password" name="pwd">
<button>Sign-IN</button>
</form>
</body>
</html>