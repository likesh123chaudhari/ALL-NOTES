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
<%--It will display all categories in drop down format --%>
   <h1> Select category</h1>
   <form action="findproduct">
		   <select name="cid" id="cid">
		   <c:forEach var="c" items="${clist}">
		       <option value="${c.cid}">${c.cname}</option>
		   </c:forEach>
		  </select>
		    <button type="submit" name="btn" id="find" value="find">Find Product</button>
		    <button type="submit" name="btn" id="order" value="order">Place order</button>
		  
   </form>
</body>
</html>