package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
