package school;

import java.util.ArrayList;

public class Student extends Person {
	private int numCourses = 0;
	private String[] courseArray;
	private int [] gradeArray;
	private static int COURSE_MAX = 30;
	     
	public Student(String name, String address) {
		super(name, address);
		courseArray = new String[COURSE_MAX];
		gradeArray = new int[COURSE_MAX];
		
	}
	
	
	public String toString() {
		 return "Student: " + super.toString();
	}
	
	public void addCourseGrade(String course, int grade) {
		courseArray[numCourses] = course;
		gradeArray[numCourses] = grade;
		++numCourses;

		
	}
	
	public void printGrades() {
		for(int s : gradeArray) {
		System.out.println(s);
		
		}
	}
}
