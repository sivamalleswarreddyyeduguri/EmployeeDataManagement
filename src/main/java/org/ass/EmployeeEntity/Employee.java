package org.ass.EmployeeEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Emp_Info")
public class Employee implements Serializable {
	@Id
	@GeneratedValue(generator = "auto")
	@GenericGenerator(name="auto",strategy ="increment")
	private int id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_location")
	private String loc;
	@Column(name="emp_disignation")
	private String job;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", loc=" + loc + ", job=" + job + "]";
	}
}
