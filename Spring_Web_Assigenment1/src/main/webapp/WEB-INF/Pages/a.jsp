<%@page import="com.mycompany.Docter"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
     
      List<Docter> li=(List<Docter>)request.getAttribute("dli");
      
      
		for (Docter docter : li){
      %>
        id:<%= docter.getD_id() %>
      Name:<%= docter.getD_name() %>
      Salary:<%= docter.getD_as()  %>
      
        
        
        
      <%} %>
      
</body>
</html>