package org.System;

public class AxisBank extends BankInfo {

	public void deposit (int a, int b, int c) {
	int d = a+b+c;
	System.out.println(d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank o = new AxisBank();
		o.deposit(1, 2, 4);
		o.saving();
		o.fixed();

	}

}
