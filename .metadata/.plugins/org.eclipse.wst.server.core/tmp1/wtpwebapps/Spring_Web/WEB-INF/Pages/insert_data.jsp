            
<%@page import="com.mycompany.Student"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="io.micrometer.observation.Observation.Context"%>
<%@page import="com.dao.StudentDao"%>
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
    Student st = (Student) request.getAttribute("student");
     
      
     
      // int i=sd.insert(stu);
    %>

<h1>Student Details</h1>
Roll No    :<%=st.getName() %><br>
Name       :<%=st.getRollno() %><br>
Percentage :<%=st.getPercent() %><br>

 
</body>
</html>


 
  