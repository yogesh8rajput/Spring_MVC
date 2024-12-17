<%@page import="com.mycompany.Patient"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All_Patient</title>
<style>

body{
height:100%;
background:white;
display: flex;
justify-content: center;
align-items: center;
}
table{
width:80%;
height:10rem;
}

table, th, td {
   border: 1px solid black;
}
th, td {
  background-color: #96D4D4;
}
</style>

</head>
<body>

<table >
<thead>

<th>ID</th>
<th>NAME</th>
<th>Tempreture</th>
<th>DELETE</th>
<th>UPDATE</th>
</thead>




      <%
     
      List<Patient> li=(List<Patient>)request.getAttribute("plist");
      
      
		for (Patient patient : li){
      %>
      
      <tbody>

<tr>
<td><%= patient.getP_id() %> </td>
<td><%= patient.getP_name() %></td>
<td><%= patient.getP_temp() %></td>
<td><a href="pdelete?id=<%= patient.getP_id() %>">DELETE</a></td>
<td><a href="pupdate?id=<%= patient.getP_id() %>">UPDATE</a></td>

</tr>
</tbody>
        
      <%} %>
      
</table>
</body>
</html>