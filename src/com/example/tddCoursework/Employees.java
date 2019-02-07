/* Created by Halil Ibryam
 * Student Number: 160335419
 */
package com.example.tddCoursework;

import java.util.ArrayList;
import java.util.List;

public class Employees {
	// Declaring variables
	private String name;
	private String address;
	private String number;
	private String department;
	private final int ID;
	private static int nextID = 100000;
	List<Qualification> record;

	// Constructor
	public Employees(String name, String address, String number, String department) {
		this.ID = nextID;
		nextID++;
		this.name = name;
		this.address = address;
		this.number = number;
		this.department = department;
		this.record = new ArrayList<Qualification>();
	}

	// Method to add Qualification to an Employee
	public void addQualification(Qualification q) {
		record.add(q);
	}

	public List<Qualification> getQualification() {
		return record;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// Get unique ID.
	public int getID() {
		return ID;
	}

	// ToString method to print Employee and Qualifications
	@Override
	public String toString() {
		String a = "Name: " + this.getName() + " \tAddress: " + this.getAddress() + " \nNumber: " + this.getNumber()
				+ " \tDepartment : " + this.getDepartment() + "\n" + "ID: " + this.getID() + "\n";
		int i = 1;
		for (Qualification q : record) {
			a += "Qualification " + i + ":\n" + q;
			i++;
		}
		return a;
	}
}
