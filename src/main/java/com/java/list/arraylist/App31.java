package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App31 {
	// sorting user defined data types with comparable

	// sort by bank name

	// consider three strings like ALFA,BETA,GAMA
	// ALFA-BETA = -1
	// GAMA-BETA = 1
	// BETA-BETA = 0
	public static void main(String[] args) {
		List<BankAccountDetails> detailsList = uploadBankAccountDetails();

		System.out.println(detailsList);

		Collections.sort(detailsList);

		System.out.println(detailsList);

		System.out.println("***result is sorted by bank name**");

	}

	private static List<BankAccountDetails> uploadBankAccountDetails() {
		BankAccountDetails details1 = new BankAccountDetails("HDFC",
				"HDFC000101", "50001019", "MAHESH", 1234);

		BankAccountDetails details2 = new BankAccountDetails("IDBI",
				"IDBI000101", "40041011", "ASIS", 1239);

		BankAccountDetails details3 = new BankAccountDetails("ICICI",
				"ICICI0001", "509110199", "MAHESH", 1234);

		BankAccountDetails details4 = new BankAccountDetails("HDFC",
				"HDFC000101", "50001020", "ARMAN", 1233);

		BankAccountDetails details5 = new BankAccountDetails("ICICI",
				"ICICI0001", "50911059", "RUPALI", 4567);

		BankAccountDetails details6 = new BankAccountDetails("HDFC",
				"HDFC000101", "50001119", "DINESH", 9867);

		BankAccountDetails details7 = new BankAccountDetails("IDBI",
				"IDBI000101", "40041012", "ALINA", 5645);

		List<BankAccountDetails> detailsList = new ArrayList<BankAccountDetails>();

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
