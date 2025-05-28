<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 int num1=Integer.parseInt(request.getParameter("num1"));
int num2=Integer.parseInt(request.getParameter("num2"));
if(num1<0 || num2<0){
%>
<h3>Number cannot be -ve</h3>
<jsp:include page="calculateform.jsp"></jsp:include>

<%}else{
	int addition=num1+num2;%>
	<jsp:forward page="resultpage.jsp">
	       <jsp:param name="result" value="<%=addition %>"></jsp:param>
	   
	</jsp:forward>
<%} %>

</body>
</html>