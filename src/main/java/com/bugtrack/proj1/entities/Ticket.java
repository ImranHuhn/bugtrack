package com.bugtrack.proj1.entities;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ticket {
//id, create, members, roles, status, comments, update
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ticketId;
	private Date ticketCreated;
	private String ticketRoles;
	private String ticketStatus;
	private String ticketComments;
	private Date ticketUpdate;
	
	
	public Ticket() {
		
	}

	
	public Ticket(Date ticketCreated, String ticketRoles, String ticketStatus, String ticketComments,
			Date ticketUpdate) {
		super();
		this.ticketCreated = ticketCreated;
		this.ticketRoles = ticketRoles;
		this.ticketStatus = ticketStatus;
		this.ticketComments = ticketComments;
		this.ticketUpdate = ticketUpdate;
	}
	
	
	public long getTicketId() {
		return ticketId;
	}
	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}
	public Date getTicketCreated() {
		return ticketCreated;
	}
	public void setTicketCreated(Date ticketCreated) {
		this.ticketCreated = ticketCreated;
	}
	public String getTicketRoles() {
		return ticketRoles;
	}
	public void setTicketRoles(String ticketRoles) {
		this.ticketRoles = ticketRoles;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getTicketComments() {
		return ticketComments;
	}
	public void setTicketComments(String ticketComments) {
		this.ticketComments = ticketComments;
	}
	public Date getTicketUpdate() {
		return ticketUpdate;
	}
	public void setTicketUpdate(Date ticketUpdate) {
		this.ticketUpdate = ticketUpdate;
	}
	
}
