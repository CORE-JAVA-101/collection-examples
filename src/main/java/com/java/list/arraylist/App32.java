package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App32 {
	// sorting user defined data types with comparable

	// sort by bank name and if bank name is same then sort by customer name

	// consider three strings like ALFA,BETA,GAMA
	// ALFA-BETA = -1
	// GAMA-BETA = 1
	// BETA-BETA = 0

	public static void main(String[] args) {
		List<BankAccountDetails1> detailsList = uploadBankAccountDetails1();

		System.out.println(detailsList);

		Collections.sort(detailsList);

		System.out.println(detailsList);

		System.out.println("***result is sorted**");

	}

	private static List<BankAccountDetails1> uploadBankAccountDetails1() {
		BankAccountDetails1 details1 = new BankAccountDetails1("HDFC",
				"HDFC000101", "50001019", "MAHESH", 1234);

		BankAccountDetails1 details2 = new BankAccountDetails1("IDBI",
				"IDBI000101", "40041011", "ASIS", 1239);

		BankAccountDetails1 details3 = new BankAccountDetails1("ICICI",
				"ICICI0001", "509110199", "MAHESH", 1234);

		BankAccountDetails1 details4 = new BankAccountDetails1("HDFC",
				"HDFC000101", "50001020", "ARMAN", 1233);

		BankAccountDetails1 details5 = new BankAccountDetails1("ICICI",
				"ICICI0001", "50911059", "RUPALI", 4567);

		BankAccountDetails1 details6 = new BankAccountDetails1("HDFC",
				"HDFC000101", "50001119", "DINESH", 9867);

		BankAccountDetails1 details7 = new BankAccountDetails1("IDBI",
				"IDBI000101", "40041012", "ALINA", 5645);

		List<BankAccountDetails1> detailsList = new ArrayList<BankAccountDetails1>();

		detailsList.add(details1);
		detailsList.add(details2);
		detailsList.add(details3);
		detailsList.add(details4);
		detailsList.add(details5);
		detailsList.add(details6);
		detailsList.add(details7);

		return detailsList;
	}
}
