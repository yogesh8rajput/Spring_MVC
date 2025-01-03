<%@page import="com.mycompany.Patient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Information Form</title>
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
Patient patient = (Patient)request.getAttribute("p_data");
%>
    
        <form action="pupdateinfo">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="p_name" placeholder="Enter you name" required value="<%=patient.getP_name()%>">
            </div>
            <div class="form-group">
                <label for="rollno">Patient No:</label>
                <input type="text" id="rollno" name="p_id" placeholder="Enter your roll number" required value="<%=patient.getP_id()%>">
            </div>
            <div class="form-group">
                <label for="percentage">Tempreture:</label>
                <input type="text" id="percentage" name="p_temp" placeholder="Enter your Tempreture" required value="<%=patient.getP_temp()%>">
            </div>
            <button type="submit" class="submit-btn">Submit</button>
        </form>
        <p>Fill out the form to submit your details</p>
    </div>

</body>
</html>