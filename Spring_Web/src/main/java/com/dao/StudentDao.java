package com.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mycompany.Student;
@Transactional
public class StudentDao {
	@Autowired
       HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	public Integer insert(Student s)
	{
		return (Integer)ht.save(s);
	}
		
		
}
