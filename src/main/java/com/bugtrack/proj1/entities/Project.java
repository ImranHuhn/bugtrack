package com.bugtrack.proj1.entities;

public class Project {

	private long projId;
	private String projTitle;
	private String projDescript;
	
	public Project() {
		
	}

	public String getProjTitle() {
		return projTitle;
	}

	public void setProjTitle(String projTitle) {
		this.projTitle = projTitle;
	}

	public String getProjDescript() {
		return projDescript;
	}

	public void setProjDescript(String projDescript) {
		this.projDescript = projDescript;
	}
	
	
	
}
