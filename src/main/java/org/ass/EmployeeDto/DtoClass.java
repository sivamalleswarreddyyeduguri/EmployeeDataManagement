package org.ass.EmployeeDto;

import java.io.Serializable;

public class DtoClass implements Serializable{
	private String Name;
	
	private String Loc;

	private String Job;
	
	private String id;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DtoClass [Name=" + Name + ", Loc=" + Loc + ", Job=" + Job + ", id=" + id + "]";
	}

    
}
