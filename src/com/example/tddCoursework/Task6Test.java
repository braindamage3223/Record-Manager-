/* Created by Halil Ibryam
 * Student Number: 160335419
 */
package com.example.tddCoursework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task6Test extends AbstractLoggingJUnitTest {

	@Test
	public void findEmployeesWithSameName() {
		// Creating recordManager, Employees and Qualifications and adding them to each other.
		RecordManager rm = new RecordManager();
		Employees a = new Employees("John Lennon", "251 Menlove Ave", "07849821333", "Marketting");
		Qualification a1 = new Qualification("Sales", "First", "07/11/2010");
		Employees b = new Employees("John Lennon", "251 Menlove Ave", "07849821777", "Banking");
		Qualification b1 = new Qualification("Banking", "First", "07/04/2009");
		Employees c = new Employees("George  Harrison", "12 Arnold Grove", "84983", "CSC");
		Qualification c1 = new Qualification("Marketing", "First", "07/04/2009");
		rm.addEmployee(a);
		a.addQualification(a1);
		rm.addEmployee(b);
		b.addQualification(b1);
		rm.addEmployee(c);
		c.addQualification(c1);

		/* Use for loop to search through the record manager and look for employee with the name John Lennon 
		and return a list of the employee with the name John Lennon and all the additional information aboute them*/
		int count = 0;
		for (Employees e : rm.findEmployeesWithSameName("John Lennon")) {
			assertEquals("Employees with the same Name not found in Record Manager", "John Lennon", e.getName());
			count++;
		}

		assertEquals("Employees with the same Name not found in the Record Manager", 2, count);

	}

}
