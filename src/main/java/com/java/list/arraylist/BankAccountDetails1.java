package com.java.list.arraylist;

public class BankAccountDetails1 implements Comparable<BankAccountDetails1> {

	private String bankName;
	private String ifscCode;
	private String accountNum;
	private String customerName;
	private int userId;

	public BankAccountDetails1(String bankName, String ifscCode,
			String accountNum, String customerName, int userId) {
		// super();
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.accountNum = accountNum;
		this.customerName = customerName;
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "BankAccountDetails [bankName=" + bankName + ", ifscCode="
				+ ifscCode + ", accountNum=" + accountNum + ", customerName="
				+ customerName + ", userId=" + userId + "]\n";
	}

	public int compareTo(BankAccountDetails1 o) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getClass().getName() + " compareTo() called");
		int x = this.bankName.compareTo(o.bankName);

		if (x == 0) {
			x = this.customerName.compareTo(o.customerName);
		}
		return x;
	}
}
