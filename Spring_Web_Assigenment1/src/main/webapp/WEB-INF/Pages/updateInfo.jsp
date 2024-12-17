<%@page import="com.mycompany.Docter"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Student Information Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f3f4f6;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .form-container {
            background: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 400px;
            text-align: center;
        }
        h2 {
            color: #2c3e50;
        }
        .form-group {
            margin-bottom: 20px;
            text-align: left;
        }
        label {
            font-size: 16px;
            color: #34495e;
            margin-bottom: 5px;
            display: block;
        }
        input[type="text"] {
            width: 100%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
            transition: border-color 0.3s ease;
        }
        input[type="text"]:focus {
            border-color: #3498db;
            outline: none;
        }
        .submit-btn {
            background-color: #3498db;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }
        .submit-btn:hover {
            background-color: #2980b9;
        }
        .form-container p {
            font-size: 14px;
            color: #7f8c8d;
        }
    </style>
</head>
<body>
<body>
<%
Docter std = (Docter)request.getAttribute("data");
%>
    
        <form action="updateinfo">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="d_name" placeholder="Enter you name" required value="<%=std.getD_name()%>">
            </div>
            <div class="form-group">
                <label for="rollno">Roll No:</label>
                <input type="text" id="rollno" name="d_id" placeholder="Enter your roll number" required value="<%=std.getD_id()%>">
            </div>
            <div class="form-group">
                <label for="percentage">Percentage:</label>
                <input type="text" id="percentage" name="d_as" placeholder="Enter your percentage" required value="<%=std.getD_as()%>">
            </div>
            <button type="submit" class="submit-btn">Submit</button>
        </form>
        <p>Fill out the form to submit your details</p>
    </div>

</body>
</html>