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
import com.dao.PatientDao;
@Controller
public class MyController {
   @Autowired
DocterDao dd;
   
   @Autowired
   PatientDao pd;
   
   
   // Docter Method
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
           dd.delete(doctor);  
        }
        return "redirect:/all";  
        }

     @RequestMapping("/update")
  	public String update(@RequestParam("id") Integer id,Model mo) {
  		Docter st =dd.findById(id);
  		mo.addAttribute("data", st);
  		
  		return "updateInfo";
  	}
  	@RequestMapping("/updateinfo")
  	public String updated(@ModelAttribute Docter student) {
  		dd.update(student);
  		return "redirect:/all";
  		
  	}
  	
  	
  	//Patient Method
  	
  	@RequestMapping("/pp")
  //@ResponseBody
  public String pp()

  {
  	return "Patient_data";
  }
  	
  	@RequestMapping("/p_insert")
  	
  	public String pinsert(@ModelAttribute Patient patient) {
  		 pd.pinsert(patient);
  		 return "redirect:/pall";
  	} 
  	
  	@RequestMapping("/pall")
    public String pselectAll(Model mo) {
        // Database logic to fetch all docters, e.g., using JPA or JDBC
        List<Patient> li= pd.pselect();
        // Add docter objects to the list (database query here)
        mo.addAttribute("plist",li);
        return "All_Patient";
}
  	
  	
  	 @RequestMapping("/pdelete")
//   @ResponseBody
   public String pdelete(@RequestParam("id") Integer id) {
      Patient patient = pd.findById(id);  // Find the doctor by ID
      if (patient != null) {
         pd.pdelete(patient);  
      }
      return "redirect:/pall";
      }

   @RequestMapping("/pupdate")
	public String pupdate(@RequestParam("id") Integer id,Model mo) {
		Patient st =pd.findById(id);
		mo.addAttribute("p_data", st);
		
		return "Patient_Info";
	}
	@RequestMapping("/pupdateinfo")
	public String pupdated(@ModelAttribute Patient patient) {
		pd.pupdate(patient);
		return "redirect:/pall";
		
	}
}

