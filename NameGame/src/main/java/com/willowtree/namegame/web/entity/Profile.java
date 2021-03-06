package com.willowtree.namegame.web.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {

	
	private String id;
	private String firstName;
	private Headshot headshot;
	private String jobTitle; //are we using this?
	private String lastName;
	private String slug; //are we using this?
	private String type;
	
	public Profile() {
		
	}

	//getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Headshot getHeadshot() {
		return headshot;
	}

	public void setHeadshot(Headshot headshot) {
		this.headshot = headshot;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", firstName=" + firstName + ", headshot=" + headshot + ", jobTitle=" + jobTitle
				+ ", lastName=" + lastName + ", slug=" + slug + ", type=" + type + "]";
	}

	
	
	
	
	
}
