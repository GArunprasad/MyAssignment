package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Arun");
	}
	public void studentDept() {
		System.out.println("EEE");
	}
	public void studentId() {
		System.out.println("14");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.studentDept();
		obj.collegeName();
		obj.studentId();
		obj.deptName();
		obj.studentName();
		
	}

	
}
