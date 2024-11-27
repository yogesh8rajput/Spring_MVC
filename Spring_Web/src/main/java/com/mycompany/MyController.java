package com.mycompany;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
     @RequestMapping("/one")
//     @ResponseBody
	String get()
	
	{
		return "first";
		
	}
     
     @RequestMapping("/one2")
//   @ResponseBody
	String set()
	
	{
		return "second";
		
	}
	
     @RequestMapping("/insert_data")
//   @ResponseBody
	String insert(HttpServletRequest req,Model m)
	
	{
    	 String roll=req.getParameter("roll");
    	 String name=req.getParameter("name");
    	 String per=req.getParameter("per");
//    	 System.out.println(roll+name+per);
    	 m.addAttribute("roll",roll);
    	 m.addAttribute("name",name);
    	 m.addAttribute("per",per);
    	 
		return "insert_data";
		
	}
}