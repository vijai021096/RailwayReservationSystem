package com.vj.railway.system;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Train {

	private static int[] confirmedBerths = new int[63];
	private static Queue<Integer> racBerth = new LinkedList<>();
	private static Queue<Integer> waitingList = new LinkedList<>();
	static int lowerBerth = 18;
	static int upperBerth = 18;
	static int middleBerth = 18;
	static int sideLower = 9;
	static int sideUpper = 9;
	static int ticketCounter=0;
	static ArrayList<Passenger> children = new ArrayList<>();
	static int racticketCount=18;

	public Train() {
		initializeConfirmedBerths();
		initialiseRac();
		initialiseWaitingList();
	}

	public void initializeConfirmedBerths() {
		for (int i = 0; i < 63; i++) {
			Train.confirmedBerths[i] = 0;
		}
	}

	public void initialiseRac() {
		for (int i = 0; i < 18; i++) {
			Train.racBerth.add(0);
		}
	}

	public void initialiseWaitingList() {
		for (int i = 0; i < 10; i++) {
			Train.waitingList.add(0);
		}
	}

	public void bookTicket(Passenger passenger, int m) {
		// TODO Auto-generated method stub
		
		if(passenger.getAge()<5) {
			children.add(passenger);
	        m--;
		}
		else {
			if((passenger.getGender().equals("F")&&(m>=0))||(passenger.getAge()>60)){
				allotLowerBerth();
				
			}
			else if(passenger.getBerthPreference().equals("M")) {
				if(ticketCounter<63) {
				if(middleBerth>0) {
				allotMiddleBerth();
				}
				else {
					if(upperBerth>0) {
						allotUpperBerth();
					}
					else if(sideUpper>0) {
						allotSideUpper();
					}
					else {
						allotLowerBerth();
					}
				}
				
			}
				else {
					if(racticketCount>0) {
						
						allotRacBerth();
						
					}
					
				}
			}

			else if(passenger.getBerthPreference().equals("U")) {
				allotUpperBerth();
			}
			else if(passenger.getBerthPreference().equals("L")) {
				allotLowerBerth();
			}
			else if(passenger.getBerthPreference().equals("SU")) {
				allotSideUpper();
			}
			
		}

	}

	private void allotRacBerth() {
		// TODO Auto-generated method stub
		racticketCount--;
		racBerth.add(1);
		
	}

	private void allotUpperBerth() {
		// TODO Auto-generated method stub
		upperBerth--;
		confirmedBerths[ticketCounter]=1;
		ticketCounter++;
	}

	private void allotSideUpper() {
		// TODO Auto-generated method stub
		sideUpper--;
		confirmedBerths[ticketCounter]=1;
		ticketCounter++;
		
	}

	private void allotMiddleBerth() {
		// TODO Auto-generated method stub
		middleBerth--;
		confirmedBerths[ticketCounter]=1;
		ticketCounter++;
		
	}

	private void allotLowerBerth() {
		// TODO Auto-generated method stub
		lowerBerth--;
		confirmedBerths[ticketCounter]=1;
		ticketCounter++;
		
	}

}
