<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
  public int factorial(int n){
	int fact=1;
	for(int i=1;i<=n;i++){
		fact=fact*i;
	}
	return fact;
}
%>
   <%
   String btn=request.getParameter("btn");
   int n1=Integer.parseInt(request.getParameter("n1"));
   switch(btn){
   case "add":
	   int n2=Integer.parseInt(request.getParameter("n2"));
	   int ans=n1+n2;
	   %>
	   <h1>Addition : <%=ans %><h1>
	   <%
	   break;
   case "fact":
	   int fact=factorial(n1);
	   %>
	   <h1>Factorial : <%=fact%></h1>
	   <%
	   break;
   }%>
  
   
   
</body>
</html>