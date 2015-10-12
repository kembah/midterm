package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Staff_Test {

	@Test
	public void test_avgSalary() {
		ArrayList<Staff> staffArray = new ArrayList<Staff>();
		staffArray.add(new Staff(null, null, null, null, null, null, null, null, 0, 1070.0, null, null));
		staffArray.add(new Staff(null, null, null, null, null, null, null, null, 0, 2000.0, null, null));
		staffArray.add(new Staff(null, null, null, null, null, null, null, null, 0, 3000.0, null, null));
		staffArray.add(new Staff(null, null, null, null, null, null, null, null, 0, 6000.0, null, null));
		staffArray.add(new Staff(null, null, null, null, null, null, null, null, 0, 9000.0, null, null));
	
		double s = 0;
		for (int i = 0; i<staffArray.size();i++ ){
			s = s + staffArray.get(i).getSalary();
		}
		assertEquals(s/5, 4214.0, 0.0);
	
	
	}
	

}
