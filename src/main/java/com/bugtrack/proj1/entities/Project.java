package com.bugtrack.proj1.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Project {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long projId; //in html, this will be given by db
	private String projTitle; //in html, this will be a text field
	private String projDescription; //in html, this will be a text box
	
	
	public Project() {
		
	}
	
	
	public Project(String projTitle, String projDescription) {
		super();
		this.projTitle = projTitle;
		this.projDescription = projDescription;
	}
	
	
	public long getProjId() {
		return projId;
	}
	public void setProjId(long projId) {
		this.projId = projId;
	}
	public String getProjTitle() {
		return projTitle;
	}
	public void setProjTitle(String projTitle) {
		this.projTitle = projTitle;
	}
	public String getProjDescription() {
		return projDescription;
	}
	public void setProjDescription(String projDescription) {
		this.projDescription = projDescription;
	}
	
	
}
