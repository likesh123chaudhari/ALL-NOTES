<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addtocart">
<c:forEach var="p" items="${plist}">
   <input type="checkbox" name="products" id="${p.pid}" value="${p.pid}"><label for="${p.pid}">${p.pname}</label><br/>
</c:forEach>
<button type="submit" name="btn" id="cart" value="cart">Add to cart</button>
<button type="submit" name="btn" id="order" value="order">Place order</button>
</form>
</body>
</html>