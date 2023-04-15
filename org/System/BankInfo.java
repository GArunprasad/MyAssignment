package org.System;

public class BankInfo {

	public void saving() {
		System.out.println("save");
	}
public void fixed() {
		System.out.println("Save");
	}
public void deposit(int a, int b) {
	int c = a+b;
	System.out.println(c);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	BankInfo obj = new BankInfo();
	obj.deposit(1, 3);
}
}
