<%@ page language="java" %>
<html>
<body>
<h2><%= System.getProperty("inheritance-example-local", "System Property from set in pom not found") %></h2>
<h2><%= System.getProperty("inheritance-example", "System Property from parent-pom not found") %></h2>
</body>
</html>
