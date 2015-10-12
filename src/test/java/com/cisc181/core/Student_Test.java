package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	static ArrayList<Course> Courses = new ArrayList<Course>();
	static ArrayList<Semester> Semesters = new ArrayList<Semester>();
	static ArrayList<Section> Sections = new ArrayList<Section>();
	static ArrayList<Student> Students = new ArrayList<Student>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		Courses.add(new Course("Math"));
		Courses.add(new Course("ComputerScience"));
		Courses.add(new Course("History"));
		Semesters.add(new Semester(null));
		Semesters.add(new Semester(null));
		
	}
	
	@Test
	public void test() {
	}

}
