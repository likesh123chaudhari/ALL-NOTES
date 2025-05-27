<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.time.format.DateTimeFormatter,java.util.List,com.demo.model.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

//retrive plist, sent by validateUser
  List<Product> plist=(List<Product>)request.getAttribute("plist");
%>
    <table border="2">
    <tr>
       <th>Product Id</th>
       <th>Product Name</th>
       <th>Product Qty</th>
       <th>Product price</th>
       <th>Product expdate</th>
       <th>Product cid</th>
       <th>Product Actions</th>
       
    </tr>
    <%for(Product p:plist){
    	String dt="";
    	if(p.getExpdate()!=null)
    	    dt=p.getExpdate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    %>
    	 <tr>
    	 <td><%=p.getPid() %></td>
    	 <td><%=p.getPname() %></td>
    	 <td><%=p.getQty() %></td>
    	 <td><%=p.getPrice()%></td>
    	 <td><%=dt%></td>
    	 <td><%=p.getCid()%></td>
    	 <td>
    	 <a href="delete?id=<%=p.getPid()%>">delete</a>/
    	 <a href="edit?id=<%=p.getPid()%>">edit</a>
    	 </td>
    	 </tr>
    <%} %>
   
    
    </table>
    <a href="addproductform.jsp">Add new Product</a>&nbsp;&nbsp;&nbsp;
    <a href="logout">Logout</a>
</body>
</html>