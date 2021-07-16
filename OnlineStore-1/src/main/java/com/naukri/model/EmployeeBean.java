package com.naukri.model;

import java.util.List;

public class EmployeeBean {

	private String name;
	private String skills;
	private String summary;
	
	
	public EmployeeBean(String name, String skills, String summary) {
		super();
		this.name = name;
		this.skills = skills;
		this.summary = summary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
}
