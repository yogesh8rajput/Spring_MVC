package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mycompany.Docter;
import com.mycompany.Patient;

@Transactional
public class PatientDao {

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Autowired
	HibernateTemplate ht;
	
	
	public Integer pinsert(Patient patient) {
		return (Integer)ht.save(patient);
	}
	public void  pupdate(Patient patient)
	{
		ht.update(patient);
	
	}
	
	public void  pdelete(Patient patient)
	{
		ht.delete(patient);
	
	}
	public Patient findById(Integer id) {
	    return ht.get(Patient.class, id);  
	}

	public List<Patient> pselect()
	{
		List <Patient> i=ht.loadAll(Patient.class);
	return i;
	}
	
}
