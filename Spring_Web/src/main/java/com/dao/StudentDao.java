package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
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

public int insert(Student st)
{
	ht.save(st);
	return 1;
}

public void delete (Student st)
{
	ht.delete(st);
	
}

public void  update(Student st)
{
	ht.update(st);

}
public List<Student> select(Student st)
{
	List <Student> i=ht.loadAll(Student.class);
return i;
}


}
