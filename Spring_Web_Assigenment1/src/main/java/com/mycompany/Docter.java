package com.mycompany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Docter {
    @Id 
	int d_id;
     String d_name;
     double d_as;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public double getD_as() {
		return d_as;
	}
	public void setD_as(double d_as) {
		this.d_as = d_as;
	}
}
