package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.StudentDao;
import com.dao.TeacherDao;

@Controller
public class MyController {

	
	@Autowired
	StudentDao studentDao;
	@Autowired
	TeacherDao teacherDao;
	
	@RequestMapping("/Student")
	public String get() {
		return "Student_Data";
	}
	
	@RequestMapping("/Teacher")
	public String get1() {
		return "Teacher_Data";
	}
	
}
