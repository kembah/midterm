package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	private Enrollment(){
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		EnrollmentID = new UUID(0, 0);
	}
	
	public void SetGrade (double grade){
		this.Grade = grade;
	}
	
}
