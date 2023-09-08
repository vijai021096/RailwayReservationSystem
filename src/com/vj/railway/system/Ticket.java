package com.vj.railway.system;

public class Ticket {
	
	private Passenger passanger;
	
	private int ticketNumber;
	
	
public Ticket(Passenger passenger,int ticketNumber) {
	
	this.passanger=passenger;
	this.ticketNumber=ticketNumber;
	
}


public Passenger getPassanger() {
	return passanger;
}


public void setPassanger(Passenger passanger) {
	this.passanger = passanger;
}


public int getTicketNumber() {
	return ticketNumber;
}


public void setTicketNumber(int ticketNumber) {
	this.ticketNumber = ticketNumber;
}


}
