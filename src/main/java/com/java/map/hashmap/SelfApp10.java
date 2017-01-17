package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*form a address book with fields of 1stname,lastName,phone,dob,address,email
 * sort by 1 fld(lastName)
 * limit the number of entries but it should be expanded by modifying 1 line only
 * sort by any field
 * display only entries matching a certain criteria(name starts with M)
 * Use of multiple addressBook
 * move 1 addressbook entry to others
 * keep track of number of elements in address book
 *  
 * */

class Contacts {
	private long phoneNo;
	private String DOB;
	private String address;
	private String emailID;

	public Contacts(long phoneNo, String dOB, String address, String emailID) {
		super();
		this.phoneNo = phoneNo;
		DOB = dOB;
		this.address = address;
		this.emailID = emailID;
	}

	@Override
	public String toString() {
		return "Contacts [phoneNo=" + phoneNo + ", DOB=" + DOB + ", address="
				+ address + ", emailID=" + emailID + "]";
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public String getDOB() {
		return DOB;
	}

	public String getAddress() {
		return address;
	}

	public String getEmailID() {
		return emailID;
	}

}

class NameDetails {
	private String firstName;
	private String lastName;

	public NameDetails(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "NameDetails [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}

public class SelfApp10 {
	
	static int limit1 = 4;

	
	/********* CONDITION CHECKING + ADDING *********/
	
	
	static void checking(Map<NameDetails, Contacts> o, NameDetails n, Contacts c)
			throws Exception {
		int count = o.size();
		if (count >= limit1)
			throw new Exception("LIMIT REACHED");
		else
			o.put(n, c);
		}

	
	public static void main(String[] args) throws Exception {

		Map<NameDetails, Contacts> addressBook1 = new HashMap<NameDetails, Contacts>();
		Map<NameDetails, Contacts> addressBook2 = new HashMap<NameDetails, Contacts>();

		/******** 1ST ADDRESS BOOK *********/

		try {

			checking(addressBook1, new NameDetails("Sandip", "Roy"),
					new Contacts(999999991, "01/01/1990", "Kolkata",
							"sandip.roy@gmail.com"));

				checking(addressBook1, new NameDetails("Sivraj", "Kumar"),
					new Contacts(999999992, "08/06/1994", "Mumbai",
							"sivraj.kumar@gmail.com"));

				checking(addressBook1, new NameDetails("Kuldeep", "Roy"),
					new Contacts(999999993, "05/02/1993", "Delhi",
							"kuldeep.roy@gmail.com"));

				checking(addressBook1, new NameDetails("Sandip", "Banshal"),
					new Contacts(999999994, "12/10/1991", "Bangalore",
							"sandip.banshal@gmail.com"));

				checking(addressBook1, new NameDetails("Kuldeep", "Singh"),
					new Contacts(999999995, "11/12/1992", "Kolkata",
							"kuldeep.singh@gmail.com"));
	
		} catch (Exception e) {
			e.printStackTrace();

		}

		/******** 2ND ADDRESS BOOK *********/

		
		addressBook2.put(new NameDetails("Suraj", "Kumar"), new Contacts(
				999999191, "01/01/1994", "Kolkata", "suraj.kumar@gmail.com"));

		addressBook2.put(new NameDetails("Sivraj", "Kumar"), new Contacts(
				999999292, "08/06/1994", "Mumbai", "sivraj.kumar@gmail.com"));

		addressBook2.put(new NameDetails("Payel", "Roy"), new Contacts(
				999999393, "05/02/1993", "Delhi", "payel.roy@gmail.com"));

		addressBook2.put(new NameDetails("Sandip", "Makija"),
				new Contacts(999999494, "12/10/1991", "Bangalore",
						"sandip.makija@gmail.com"));

		addressBook2.put(new NameDetails("visal", "Singh"), new Contacts(
				999999595, "11/12/1992", "Kolkata", "visal.singh@gmail.com"));

		/******* ITERATING BY DIFFERENT MEANS **********/

		// System.out.println(contactMap);

		Set<Entry<NameDetails, Contacts>> es1 = addressBook1.entrySet();
		Set<Entry<NameDetails, Contacts>> es2 = addressBook2.entrySet();

		for (Entry<NameDetails, Contacts> e : es1)
			System.out.println(e.getKey() + "-------" + e.getValue());
		System.out.println("\n\n");

		Iterator<Entry<NameDetails, Contacts>> it = es2.iterator();

		while (it.hasNext()) {
			Entry entry = it.next();
			System.out.println(entry.getKey() + "--------------"
					+ entry.getValue());
		}
		System.out
				.println("\nCounting the number of elements of 1st address book:     "
						+ addressBook1.size() + "\n");

		/********** MOVING ADDRESSBOOK1 TO ADDRESSBOOK2 *********/

		addressBook2.putAll(addressBook1);

		Set<Entry<NameDetails, Contacts>> es3 = addressBook2.entrySet();

		for (Entry<NameDetails, Contacts> e : es3)
			System.out.println(e.getKey() + "-------" + e.getValue());

	}
}

/*
 * --> form a address book with fields of *
 * 1stname,lastName,phone,dob,address,email..... sort by 1 fld(lastName)
 * ........-->limit the number of entries but it should be expanded by modifying
 * 1 line only ....sort by any field ....display only entries matching a certain
 * criteria(name starts with M).....--> Use of multiple addressBook.....--> move
 * 1 addressbook entry to others...... -->keep track of number of elements in
 * address book
 */
