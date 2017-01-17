package com.java.map.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.Comparator;

/*-->form a address book with fields of 1stname,lastName,phone,dob,address,email
 * sort by 1 fld(lastName)
 * -->limit the number of entries but it should be expanded by modifying 1 line only
 * sort by any field
 * display only entries matching a certain criteria(name starts with M)
 * --->Use of multiple addressBook
 * --->move 1 addressbook entry to others
 * --->keep track of number of elements in address book
 *  
 * */

class Names {
	private String firstName;
	private String lastName;

	@Override
	public String toString() {
		return "Names [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public Names(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	
	
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}


class Address {
	private long phone;
	private String DOB;
	private String address;
	private String email;

	public Address(long phone, String dOB, String address, String email) {
		super();
		this.phone = phone;
		DOB = dOB;
		this.address = address;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Address [phone=" + phone + ", DOB=" + DOB + ", address="
				+ address + ", email=" + email + "]";
	}

	public long getPhone() {
		return phone;
	}

	public String getDOB() {
		return DOB;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	
}

public class SelfAppCopy10 {
	static int limit1 =4;
	static int limit2 = 3;

	static void check1(Map<Names, Address> m, Names n, Address a)
			throws Exception {

		if (m.size() >= limit1)
			throw new Exception("LIMIT REACHED ");
		else
			m.put(n, a);

	}

	// static void checkAndCopy1(Map<Names, Address> m, Map<Names, Address> n)
	// throws Exception {
	//
	// if (m.size() >= limit1)
	// throw new Exception("LIMIT REACHED ");
	// else
	// m.putAll(n);
	//
	// }
	//
	// static void checkAndCopy2(Map<Names, Address> m, Map<Names, Address> n)
	// throws Exception {
	//
	// if (n.size() >= limit2)
	// throw new Exception("LIMIT REACHED ");
	// else
	// n.putAll(m);
	//
	// }

	static void check2(Map<Names, Address> m, Names n, Address a)
			throws Exception {

		if (m.size() >= limit2)
			throw new Exception("LIMIT REACHED ");
		else
			m.put(n, a);

	}
	
	static void move (Map<Names,Address> m1,Map<Names,Address> m2){
		m1.putAll(m2);
	m2.clear();
	
	System.out.println("\n------------------------------------------\nADDRESS BOOK2 MOVED TO ADDRESS BOOK1\n------------------------------------------");

}
	
	static void copy (Map<Names,Address> m1,Map<Names,Address> m2){
		m1.putAll(m2);
		
		System.out.println("\n------------------------------------------\nADDRESS BOOK2 COPIED TO ADDRESS BOOK1\n------------------------------------------");

}

	static long mob() {
		Random r = new Random();
		long mob = r.nextInt(900000000);
		return mob;
	}

	static void display(Map<Names, Address> map) {

		Set<Entry<Names, Address>> adr = map.entrySet();
		for (Entry<Names, Address> entry : adr)
			System.out.println(entry.getKey() + "--" + entry.getValue());
	}

	public static void main(String[] args) {

		Map<Names, Address> adrs1 = new HashMap<Names, Address>();
		try {
			check1(adrs1, new Names("Suraj", "Kumar"), new Address(mob(),
					"01/01/1994", "Kolkata", "suraj.kumar@gmail.com"));

			check1(adrs1, new Names("Sivraj", "Kumar"), new Address(mob(),
					"08/06/1994", "Mumbai", "sivraj.kumar@gmail.com"));

			check1(adrs1, new Names("Payel", "Roy"), new Address(mob(),
					"05/02/1993", "Delhi", "payel.roy@gmail.com"));

			check1(adrs1, new Names("Sandip", "Makija"), new Address(mob(),
					"12/10/1991", "Bangalore", "sandip.makija@gmail.com"));

			check1(adrs1, new Names("visal", "Singh"), new Address(mob(),
					"11/12/1992", "Kolkata", "visal.singh@gmail.com"));

			check1(adrs1, new Names("Shipra", "Ghosh"), new Address(mob(),
					"01/01/1990", "Kolkata", "sandip.roy@gmail.com"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		Map<Names, Address> adrs2 = new HashMap<Names, Address>();
		try {

			check2(adrs2, new Names("Sivraj", "Kumar"), new Address(mob(),
					"08/06/1994", "Mumbai", "sivraj.kumar@gmail.com"));

			check2(adrs2, new Names("Kuldeep", "Roy"), new Address(mob(),
					"05/02/1993", "Delhi", "kuldeep.roy@gmail.com"));

			check2(adrs2, new Names("Sandip", "Banshal"), new Address(mob(),
					"12/10/1991", "Bangalore", "sandip.banshal@gmail.com"));

			check2(adrs2, new Names("Kuldeep", "Singh"), new Address(mob(),
					"11/12/1992", "Kolkata", "kuldeep.singh@gmail.com"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DISPLAYING ADRESS BOOK 1\n----------------------------------------");
		
		display(adrs1);

		System.out.println();

		System.out.println("DISPLAYING ADRESS BOOK 2\n----------------------------------------");
		
		display(adrs2);

		//copy(adrs1, adrs2);
		move(adrs1, adrs2);

		System.out.println("\n"
						+ "DISPLAYING ADRESS BOOK 1\n----------------------------------------");
		display(adrs1);
		System.out.println();
		System.out.println("DISPLAYING ADRESS BOOK 2\n----------------------------------------");
		display(adrs2);

		
		Set<Entry<Names, Address>> ntrySet=adrs1.entrySet();
		List<Entry<Names, Address>> ntryList=new ArrayList<Entry<Names, Address>>(ntrySet);

		/********* SORTING *********/
		Collections.sort(ntryList,new Comparator<Entry<Names, Address>>() {							// Using annonymous class
		
			public int compare(Entry<Names, Address> o1,Entry<Names, Address> o2) {
			// TODO Auto-generated method stub
			return ((o1.getValue().getDOB()).compareTo(o2.getValue().getDOB()));
		}	
		});
		
		System.out.println("\nAFTER SORTING ADDRESSBOOK 1\n............................");
		for(Entry<Names, Address> rec:ntryList)
		System.out.println(rec);
	
	}
}	

/*-->form a address book with fields of 1stname,lastName,phone,dob,address,email
 * sort by 1 fld(lastName)
 * -->limit the number of entries but it should be expanded by modifying 1 line only
 * sort by any field
 * display only entries matching a certain criteria(name starts with M)
 * --->Use of multiple addressBook
 * --->move 1 addressbook entry to others
 * --->keep track of number of elements in address book
 */