package com.java.list.arraylist;

public class BankAccountDetails implements Comparable<BankAccountDetails> {

	private String bankName;
	private String ifscCode;
	private String accountNum;
	private String customerName;
	private int userId;

	public String getBankName() {
		return bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public String getCustomerName() {
		return customerName;
	}

	public int getUserId() {
		return userId;
	}

	public BankAccountDetails(String bankName, String ifscCode,
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

	public int compareTo(BankAccountDetails o) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getClass().getName() + " compareTo() called");
		int x = this.bankName.compareTo(o.bankName);
		// x can have values -1,0,1
		System.out.println(this.bankName + "--" + o.bankName + " and x: " + x);
		return x;
	}
}
