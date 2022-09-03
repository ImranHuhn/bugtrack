package com.bugtrack.proj1.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Member {

	private long memberId;
	private String memberFname;
	private String memberLname;
	private String memberEmail;
	private Date memberCreated;
	
	public Member() {
		
	}
	
	public String getmemberFname() {
		return memberFname;
	}
	public void setmemberFname(String memberFname) {
		this.memberFname = memberFname;
	}
	public String getmemberLname() {
		return memberLname;
	}
	public void setmemberLname(String memberLname) {
		this.memberLname = memberLname;
	}
	public String getmemberEmail() {
		return memberEmail;
	}
	public void setmemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public Date getmemberCreated() {
		return memberCreated;
	}
	public void setmemberCreated(Date memberCreated) {
		this.memberCreated = memberCreated;
	}
}
