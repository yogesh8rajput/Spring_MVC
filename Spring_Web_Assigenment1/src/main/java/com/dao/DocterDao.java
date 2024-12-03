package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mycompany.Docter;

@Transactional
public class DocterDao {
    @Autowired
	HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	public Integer insert(Docter docter)
	{
		return (Integer)ht.save(docter);
	}
	
	public void  update(Docter docter)
	{
		ht.update(docter);
	
	}
	
	public void  delete(Docter docter)
	{
		ht.delete(docter);
	
	}
	public Docter findById(Integer id) {
	    return ht.get(Docter.class, id);  // This fetches the doctor by ID
	}

	public List<Docter> select()
	{
		List <Docter> i=ht.loadAll(Docter.class);
	return i;
	}
	
}
