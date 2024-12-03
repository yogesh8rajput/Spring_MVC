package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.StudentDao;

@Controller
public class MyController {
	@RequestMapping("/one")
//	@ResponseBody
	  public String one() {
		
		
		return "first";	
	}
//	
	@Autowired
	StudentDao studentdao;
	@RequestMapping("/insert")
//	@ResponseBody
	  public String insert(@ModelAttribute Student student) {
		
		studentdao.insert(student);
		return "insert_data";	
	}
	
	
	
}
