package com.mycompany;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.DocterDao;
@Controller
public class MyController {
   @Autowired
DocterDao dd;
   
@RequestMapping("/one")
//@ResponseBody
String set()

{
	return "enquiry";
	
}
@RequestMapping("/insert")
public String insert(@ModelAttribute Docter ddd) {
	 dd.insert(ddd);
	 return "result";
}   

//@RequestMapping("/all")
//public String select (@ModelAttribute Docter ddd){
//	dd.select(ddd);
//	 return "all";
//}   

     @RequestMapping("/all")
    public String selectAll(Model mo) {
        // Database logic to fetch all docters, e.g., using JPA or JDBC
        List<Docter> li= dd.select();
        // Add docter objects to the list (database query here)
        mo.addAttribute("dli",li);
        return "view";
        
     }  
     @RequestMapping("/delete")
//     @ResponseBody
     public String delete(@RequestParam("id") Integer id) {
        Docter doctor = dd.findById(id);  // Find the doctor by ID
        if (doctor != null) {
           dd.delete(doctor);  // Delete the doctor if found
        }
        return "result";  // Redirect to the "view" page to show the updated list
     }

    
}



