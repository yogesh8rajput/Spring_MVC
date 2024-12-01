package com.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id  
	int rollno;
      String name;
      double percent;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
}
