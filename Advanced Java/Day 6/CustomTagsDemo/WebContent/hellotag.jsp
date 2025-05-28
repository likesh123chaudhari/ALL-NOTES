<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="mytag" uri="/mycustomtag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  int n1=10;
int n2=20;
%>

<h1>Welcome to custom tag</h1>
<mytag:calculate num1="<%=n1%>" num2="<%=n2%>"></mytag:calculate>
<mytag:hello fname="Rajan" lname="Khadilkar"></mytag:hello>
</body>
</html>