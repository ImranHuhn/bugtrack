package com.bugtrack.proj1.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long memberId; //in html, this will be given by db
	private String memberFname; //in html, this will be a text field 
	private String memberLname; //in html, this will be a text field
	private String memberEmail; //in html, this will be a text field
	private Date memberCreated;	//in html, this will be given by today's date
	
	
	public Member() {
		
	}
	
	
	public Member(String memberFname, String memberLname, String memberEmail, Date memberCreated) {
		super();
		this.memberFname = memberFname;
		this.memberLname = memberLname;
		this.memberEmail = memberEmail;
		this.memberCreated = memberCreated;
	}
	
	
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	public String getMemberFname() {
		return memberFname;
	}
	public void setMemberFname(String memberFname) {
		this.memberFname = memberFname;
	}
	public String getMemberLname() {
		return memberLname;
	}
	public void setMemberLname(String memberLname) {
		this.memberLname = memberLname;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public Date getMemberCreated() {
		return memberCreated;
	}
	public void setMemberCreated(Date memberCreated) {
		this.memberCreated = memberCreated;
	}

	
}
