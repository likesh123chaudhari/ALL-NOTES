<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.demo.model.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%
     Product p=(Product)request.getAttribute("product");
  %>
  <form action="updateproduct" method="post">
      Product Id: <input type="text" name="pid" id="pid" value="<%=p.getPid()%>" readonly><br/>
      Product name: <input type="text" name="pname" id="pname"  value="<%=p.getPname()%>"><br/>
      Product Quantity: <input type="text" name="qty" id="qty"  value="<%=p.getQty()%>"><br/>
      Product Price: <input type="text" name="price" id="price"  value="<%=p.getPrice()%>"><br/>
      Product Expdate: <input type="date" name="expdate" id="expdate"  value="<%=p.getExpdate()%>"><br/>
      Product cid: <input type="text" name="cid" id="cid"  value="<%=p.getCid()%>"><br/>
      <button type="submit" name="btn" id="btn">Update Product</button><br/>
   </form>
</body>
</html>