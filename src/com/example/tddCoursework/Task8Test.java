/* Created by Halil Ibryam
 * Student Number: 160335419
 */
package com.example.tddCoursework;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Task8Test extends AbstractLoggingJUnitTest {
	private RecordManager rm;
	private Employees a;
	private Employees b;
	private Qualification q1;
	private Qualification q2;
	private Qualification q3;

	@Before
	public void initialize() {
		rm = new RecordManager();
		a = new Employees("Ringo Starr", "10 Admiral Grove", "45654", "CSC");
		b = new Employees("George Harrison", "12 Arnold Grove", "07849821444", "Accounting");
		rm.addEmployee(a);
		rm.addEmployee(b);
	}

	@Test  // Add Qualification to Employee a using addQualification method and check with AssertEquals
	public void canAddQualifications() {
		q1 = new Qualification("Marketing", "First", "10/10/1969");
		rm.addQualification(a.getID(), q1);
		assertEquals("Qualification not added", q1, a.getQualification().get(0));
	}

	@Test  // Adding two qualifications to Employee b and checking if they are added.
	public void canAddMultipleQualifications() {
		q2 = new Qualification("Marketing", "First", "10/10/1969");
		rm.addQualification(b.getID(), q2);
		q3 = new Qualification("Marketing", "First", "10/10/1969");
		rm.addQualification(b.getID(), q3);
		assertEquals("Can't add multiple qualifications", 2, b.getQualification().size());
		
	}
}
