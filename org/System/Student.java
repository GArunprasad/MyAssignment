package org.System;

public class Student {

	public void getStudentInfo(int a) {
		System.out.println(a);
	}
	public void getStudentInfo(int b, String name ) {
		System.out.println(b);
		System.out.println(name);
	}
	public void getStudentInfo(long ph, String email ) {
		System.out.println(ph);
		System.out.println(email);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student c = new Student();
		c.getStudentInfo(1);
		c.getStudentInfo(2, "Arun");
		c.getStudentInfo(939399393L, "dvg@gamil.com");
	}
	
}
