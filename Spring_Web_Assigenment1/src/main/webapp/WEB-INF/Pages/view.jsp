<%@page import="com.dao.DocterDao"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.Docter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>

body{
height:100%;

display: flex;
justify-content: center;
align-items: center;
}
table{
width:50%;
height:10rem;
}

</style>

</head>
<body>

<table>
<thead>

<th>ID</th>
<th>NAME</th>
<th>SALARY</th>
<th>DELETE</th>
<th>UPDATE</th>
</thead>




      <%
     
      List<Docter> li=(List<Docter>)request.getAttribute("dli");
      
      
		for (Docter docter : li){
      %>
      
      <tbody>

<tr>
<td><%= docter.getD_id() %> </td>
<td><%= docter.getD_name() %></td>
<td><%= docter.getD_as()  %></td>
<td><a href="delete?id=<%= docter.getD_id() %>">DELETE</a></td>
<td><a href="update?id=<%= docter.getD_id() %>">UPDATE</a></td>

</tr>
</tbody>
        
      <%} %>
      
</table>
</body>
</html>