/* Created by Halil Ibryam
 * Student Number: 160335419
 */
package com.example.tddCoursework;

public class Qualification {
	// Declaring variables
	private String qualification;
	private String level;
	private String date;
	// Constructor
	public Qualification(String qualification, String level, String date) {
		this.qualification = qualification;
		this.level = level;
		this.date = date;
	}
	// Getter and Setters
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	// To string method to print qualification name, level and date acheived
	@Override
	public String toString() {
		return ("Name: " + this.getQualification() + " \tLevel: " + this.getLevel() + " \nDate Achieved: "
				+ this.getDate() + "\n");
	}
}
