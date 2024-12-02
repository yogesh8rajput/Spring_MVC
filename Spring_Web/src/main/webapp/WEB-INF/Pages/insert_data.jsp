            
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="io.micrometer.observation.Observation.Context"%>
<%@page import="com.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="com.dao.Student" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  
  <% 
 
  StudentDao sd=(StudentDao)config.getBean("studentDao");
 // StudentDao sd=new StudentDao();
Student stu = (Student) request.getAttribute("student");
 stu.getRollno();
  stu.getName();
  stu.getPercent();
  
 
  // int i=sd.insert(stu);
%>
 
</body>
</html>


 
  