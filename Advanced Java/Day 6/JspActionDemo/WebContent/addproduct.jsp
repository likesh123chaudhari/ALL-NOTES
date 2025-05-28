<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="p" class="com.demo.model.Product"></jsp:useBean>
<jsp:setProperty property="*" name="p"/>

<h1>Product is</h1>
Product pid: <jsp:getProperty property="pid" name="p"></jsp:getProperty>
Product pname: <jsp:getProperty property="pname" name="p"></jsp:getProperty>
Product qty: <jsp:getProperty property="qty" name="p"></jsp:getProperty>
</body>
</html>