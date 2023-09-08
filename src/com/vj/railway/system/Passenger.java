package com.vj.railway.system;

public class Passenger {
	
	private String name;
	private int age;
	private String gender;
	private String berthPreference;
	
	
	public Passenger(String name,int age,String gender,String berthPreference) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.berthPreference=berthPreference;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBerthPreference() {
		return berthPreference;
	}


	public void setBerthPreference(String berthPreference) {
		this.berthPreference = berthPreference;
	}
	
	

	
}
