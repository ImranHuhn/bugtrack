package com.bugtrack.proj1.entities;

import java.util.Date;

public class Ticket {
//id, create, members, roles, status, comments, update
	
	private long ticketId;
	private Date ticketCreated;
	private String ticketRoles;
	private String ticketStatus;
	private String ticketComments;
	private Date ticketUpdate;
	
	public Ticket() {
		
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
