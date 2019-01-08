package com.techbrunch.boostrap.webapplication.models;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private Long id;
	private String name;
	private String collegeName;
	private String dateOfBirth;
	private String branch;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * No-Args Constructor
	 */
	public Student() {

	}

}
