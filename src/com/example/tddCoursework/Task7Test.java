/* Created by Halil Ibryam
 * Student Number: 160335419
 */
package com.example.tddCoursework;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Task7Test extends AbstractLoggingJUnitTest {
	// Creating recordManager and Employee
	private RecordManager rm;
	private Employees a;

	@Before
	public void initialize() {
		rm = new RecordManager();
		a = new Employees("Ringo Starr", "10 Admiral Grove", "07849821555", "Communications");
		rm.addEmployee(a);
	}

	@Test	// Change the name of Employee given their ID a from Ringo Starr to John Lennon and use asertEquals if it works.
	public void canChangeEmployeeName() {
		rm.changeEmployeeName(a.getID(), "John Lennon");
		// AssertEquals checks if the String in posistion 2 is same with a.getName(), if not prints the message
		assertEquals("The name was not changeg correctly", "John Lennon", a.getName());
	}

	@Test	//Same principle as above
	public void canChangeEmployeeAddress() {
		rm.changeEmployeeAddress(a.getID(), "251 Menlove Ave");
		assertEquals("The adress was not changeg correctly", "251 Menlove Ave", a.getAddress());
	}

}
