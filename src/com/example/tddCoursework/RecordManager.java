/* Created by Halil Ibryam
 * Student Number: 160335419
 */
package com.example.tddCoursework;

import java.util.ArrayList;
import java.util.List;

public class RecordManager {
	private List<Employees> employee;

	public RecordManager() {
		this.employee = new ArrayList<Employees>();

	}

	public void addEmployee(Employees a) {
		employee.add(a);
	}

	public List<Employees> getEmployee() {
		return employee;
	}

	// Method that search for Employees with completely matching names
	public List<Employees> findEmployeesWithSameName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name can't be null");
		}

		List<Employees> matchingEmployees = new ArrayList<Employees>();

		for (Employees e : employee) {
			if (e.getName().equals(name)) {
				matchingEmployees.add(e);
				// System.out.println(e); // Print line to print employees with matching
				// name(Optional)
			}
		}

		return matchingEmployees;
	}

	// Method to add Qualification to an employee given their ID
	public void addQualification(int employeeID, Qualification q) {
		Employees e = getEmployeeByID(employeeID);
		if (e == null) {
			throw new IllegalArgumentException("No employee with that ID.");
		}
		e.addQualification(q);
	}

	public void changeEmployeeName(int employeeID, String name) {
		Employees e = getEmployeeByID(employeeID);

		if (e == null) {
			throw new IllegalArgumentException("No employee with that ID.");
		}
		e.setName(name);

	}

	public void changeEmployeeAddress(int employeeID, String address) {
		Employees e = getEmployeeByID(employeeID);
		if (e == null) {
			throw new IllegalArgumentException("No employee with that ID.");
		}
		e.setAddress(address);
	}

	public Employees getEmployeeByID(int empID) {
		for (Employees e : employee) {
			if (e.getID() == empID) {
				return e;
			}
		}
		return null;
	}

}
