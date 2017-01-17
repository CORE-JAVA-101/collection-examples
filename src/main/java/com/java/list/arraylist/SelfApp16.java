package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Create a list of Employee with Empno, Empname, Empsal, Emploc.
// set is used to replace/update an object at a given index.
// Removing elements form the ArrayList
// using remove(int index)
// using remove(Object object)
// delete all the elements 
// check contains ()
//sort by salary and then make a sublist of the top 2 salary holder and print

public class SelfApp16 {
	public static void main(String[] args) {

		Employe e1 = new Employe(20, 5, "GAneSh", "Satelite");

		List<Employe> empList = new ArrayList<Employe>();

		empList.add(new Employe(0, 20000, "Raj", "bangaore"));
		empList.add(new Employe(1, 10000, "swaRaj", "Mumbai"));
		empList.add(new Employe(2, 25000, "BiRaj", "Delhi"));
		empList.add(new Employe(3, 15000, "mahaRaj", "Mumbai"));

		System.out.println(empList);
		System.out.println();

		Iterator<Employe> it = empList.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		System.out.println();

		empList.set(1, new Employe(3, 15000, "mahaRaj", "Mumbai"));

		System.out.println(empList.get(1));
		System.out.println();

		empList.remove(3);

		Iterator<Employe> it2 = empList.iterator();
		while (it2.hasNext())
			System.out.println(it2.next());
		System.out.println();

		empList.add(1, new Employe(1, 80000, "RAJA", "Kolkata"));
		empList.add(e1);

		Iterator<Employe> it1 = empList.iterator();

		while (it1.hasNext())
			System.out.println(it1.next());
		System.out.println();

		System.out.println(empList.contains(new Employe(1, 80000, "RAJA",
				"Kolkata")));
		System.out.println(empList.contains(e1));

		Collections.sort(empList, new comImple());

		System.out.println();
		
		Iterator<Employe> it4 = empList.iterator();
		while (it4.hasNext())
			System.out.println(it4.next());

		
	System.out.println("Sublist: \n");	
		List<Employe> sList=empList.subList(0, 2);
		
	System.out.println(sList);	
		System.out.println("\nAfter clearing ... " + "");

		// empList.removeAll(empList);
		empList.clear();

		Iterator<Employe> it3 = empList.iterator();
		while (it3.hasNext())
			System.out.println(it3.next());

		
	}
}

/* HERE I WANT TO SORT BY EMPSAL IN ASCENDING ORDER */

class comImple implements Comparator<Employe> {
	public int compare(Employe o1, Employe o2) {
		if (o1.getEmpSal() < o2.getEmpSal())
		return 1;
		else return -1;
	}
}

class Employe {
	private int EmpNo;
	private long EmpSal;
	private String EmpName;
	private String EmpLoc;

	public Employe(int empNo, long empSal, String empName, String empLoc) {
		super();
		EmpNo = empNo;
		EmpSal = empSal;
		EmpName = empName;
		EmpLoc = empLoc;
	}

	@Override
	public String toString() {
		return "Employe [EmpNo=" + EmpNo + ", EmpSal=" + EmpSal + ", EmpName="
				+ EmpName + ", EmpLoc=" + EmpLoc + "]";
	}

	public int getEmpNo() {
		return EmpNo;
	}

	public long getEmpSal() {
		return EmpSal;
	}

	public String getEmpName() {
		return EmpName;
	}

	public String getEmpLoc() {
		return EmpLoc;
	}

}
