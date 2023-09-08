package com.vj.railway.system;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String ab[]) {
	
	
	System.out.println("............Ticket Booking System..............");
	
	
	System.out.println("1.Book Tickets");
	System.out.println("2.Cancel Tickets");
	System.out.println("3.Print Booked Tickets");
	System.out.println("4.print available Tickets");
	
	System.out.println("......Enter your choice.....");
	
	int choice = sc.nextInt();
	
	switch(choice) {
	case 1:
		bookTicket();
		break;
	case 2:
		cancelTicket();
		break;
	case 3:
		printBookedTicket();
		break;
	case 4:
		printAvailableTicket();
		break;
	default:
		break;
	}
	
	
}

	private static void printAvailableTicket() {
		// TODO Auto-generated method stub
		
	}

	private static void printBookedTicket() {
		// TODO Auto-generated method stub
		
	}

	private static void cancelTicket() {
		// TODO Auto-generated method stub
		
	}

	private static void bookTicket() {
		// TODO Auto-generated method stub
		
		System.out.println(".........Ticket Booking..........");
		
		System.out.println("Enter No of passenger ");
		int n = sc.nextInt();
		
		System.out.println("Enter Number of childrens below age 5");
		int m=sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("Enter passenger Name");
		String name = sc.nextLine();
		System.out.println("Enter passenger Age");
		int age = sc.nextInt();
		System.out.println("Enter passenger berth preference(LB,UB,SUB,SLB)");
		String pref = sc.nextLine();
		System.out.println("Enter passenger Gender");
		String gender = sc.nextLine();
		
		
		Passenger passenger = new Passenger(name,age,gender,pref);
	    
		Train train = new Train();
		train.bookTicket(passenger,m);
		
		}
		
		
		
	}
}
