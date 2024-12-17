package com.mycompany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Patient_MVC")
public class Patient {

	@Id
	int p_id;
	String p_name;
	double p_temp;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public double getP_temp() {
		return p_temp;
	}
	public void setP_temp(double p_temp) {
		this.p_temp = p_temp;
	}
	
	
	
}
