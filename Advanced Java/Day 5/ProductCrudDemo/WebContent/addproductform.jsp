<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="addproduct" method="post">
      Product Id: <input type="text" name="pid" id="pid"><br/>
      Product name: <input type="text" name="pname" id="pname"><br/>
      Product Quantity: <input type="text" name="qty" id="qty"><br/>
      Product Price: <input type="text" name="price" id="price"><br/>
      Product Expdate: <input type="date" name="expdate" id="expdate"><br/>
      Product cid: <input type="text" name="cid" id="cid"><br/>
      <button type="submit" name="btn" id="btn">Add new Product</button><br/>
   </form>
</body>
</html>