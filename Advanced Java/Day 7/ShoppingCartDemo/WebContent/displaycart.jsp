<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.demo.model.Product"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
  <tr>
     <th>
        Product id
     </th>
     <th>
        Product name
     </th>
     <th>
        Product price
     </th>
  
  </tr>
<%double sum=0;
List<Product> cart=(List<Product>)session.getAttribute("cart");  //${cart}
System.out.println(cart.size());
for(Product p:cart){
%>

   <tr>
      <td><%=p.getPid() %></td>
      <td><%=p.getPname() %></td>
      <td><%=p.getPrice() %></td>
 </tr>
 
<%sum+=p.getPrice();} %>
<tr>
<td colspan=2>Amount</td>
<td><%=sum %></td>
</tr>
</table>
<form action="findcategory">
<button type="submit" name="btn" id="add" value="addmore">Add more items</button>
</form>
<form action="orderpage.jsp">
  <button type="submit" name="btn" id="add" value="confirm">Confirm order</button>
</form>
</body>
</html>