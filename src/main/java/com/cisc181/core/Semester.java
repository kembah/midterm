package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Semester {
	
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;

	public Semester (UUID name){
		SemesterID = name;
		StartDate = null;
		EndDate = null;
		
	}
}

	
