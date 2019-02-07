/* Created by Halil Ibryam
 * Student Number: 160335419
 */
package com.example.tddCoursework;

import java.util.List;

public class RecordManagerTest {

	public static void print() {
		// Creating recordManager
		RecordManager rm = new RecordManager();
		// Creating Employee and Qualifications
		Employees a = new Employees("John Lennon", "251 Menlove Ave", "07849821333", "Marketting");
		Qualification a1 = new Qualification("Marketting", "First", "07/10/1985");
		Qualification a2 = new Qualification("Sales", "First", "07/07/1986");
		Employees b = new Employees("George Harrison", "12 Arnold Grove", "07849821444", "Accounting");
		Qualification b1 = new Qualification("Accounting", "First", "07/03/1982");
		Qualification b2 = new Qualification("Sales", "First", "07/03/1982");
		Employees c = new Employees("Ringo Starr", "10 Admiral Grove", "07849821555", "Communications");
		// Addding Employees to RecordManager and Qualifications to Employees
		rm.addEmployee(a);
		rm.addQualification(a.getID(), a1);
		rm.addQualification(a.getID(), a2);
		rm.addEmployee(b);
		rm.addQualification(b.getID(), b1);
		rm.addQualification(b.getID(), b2);
		rm.addEmployee(c);
		// Using list to store employees
		List<Employees> rec;
		rec = rm.getEmployee();
		// for loop to print Employees and their Qualifications
		for (Employees e : rec) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		// Calling the print method above
		print();

	}
}