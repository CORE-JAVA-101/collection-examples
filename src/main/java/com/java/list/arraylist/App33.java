package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App33 {
	// sort using comparator
	// sort by bank name: BankNameComparator

	// sort by customer name: CustomeNameComparator

	// sort by bank name and if bank name is same then sort by customer name:
	// BankNameCustomerNameComparator

	public static void main(String[] args) {

		List<BankAccountDetails> listForBankNameComparator = uploadBankAccountDetails();
		List<BankAccountDetails> listForCustomeNameComparator = uploadBankAccountDetails();
		List<BankAccountDetails> listForBankNameCustomerNameComparator = uploadBankAccountDetails();

		Collections.sort(listForCustomeNameComparator,
				new CustomeNameComparator());
		System.out.println("Sorting by cutomer name");
		System.out.println(listForCustomeNameComparator);
		System.out.println("\n");

		System.out.println("-------------------------------------");

		Collections.sort(listForBankNameComparator, new BankNameComparator());
		System.out.println("Sorting by BankName in reverse order:");
		System.out.println(listForBankNameComparator);
		System.out.println("\n");

		System.out.println("-------------------------------------");

		Collections.sort(listForBankNameCustomerNameComparator,
				new BankNameCustomerNameComparator());
		System.out.println("Sorting by Bank Name and then by CustomerName");
		System.out.println(listForBankNameCustomerNameComparator);

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

class CustomeNameComparator implements Comparator<BankAccountDetails> {

	public int compare(BankAccountDetails o1, BankAccountDetails o2) {
		// TODO Auto-generated method stub
		int x = o1.getCustomerName().compareTo(o2.getCustomerName());
		return x;
	}
}

class BankNameComparator implements Comparator<BankAccountDetails> {

	public int compare(BankAccountDetails o1, BankAccountDetails o2) {
		// TODO Auto-generated method stub
		int x = o2.getBankName().compareTo(o1.getBankName());// reverse sorting
		return x;
	}
}

class BankNameCustomerNameComparator implements Comparator<BankAccountDetails> {

	public int compare(BankAccountDetails o1, BankAccountDetails o2) {
		// TODO Auto-generated method stub
		int x = o1.getBankName().compareTo(o2.getBankName());
		if (x == 0) {
			x = o1.getCustomerName().compareTo(o2.getCustomerName());
		}
		return x;
	}
}