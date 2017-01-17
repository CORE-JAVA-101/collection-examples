//package com.java.list.arraylist;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//// Create a list of Employee with Empno, Empname, Empsal, Emploc.
//// set is used to replace/update an object at a given index.
//// Removing elements form the ArrayList
//// using remove(int index)
//// using remove(Object object)
//// delete all the elements 
//
//public class SelfApp9 {
//	public static void main(String[] args) {
//
//		List<Employe> empList = new ArrayList<Employe>();
//
//		empList.add(new Employe(0, 20000, "Raj", "bangaore"));
//		empList.add(new Employe(1, 10000, "swaRaj", "Mumbai"));
//		empList.add(new Employe(2, 25000, "BiRaj", "Delhi"));
//		empList.add(new Employe(3, 15000, "mahaRaj", "Mumbai"));
//
//		System.out.println(empList);
//		System.out.println();
//
//		Iterator<Employe> it = empList.iterator();
//		while (it.hasNext())
//			System.out.println(it.next());
//
//		System.out.println();
//		System.out.println(empList.get(1));
//
//		empList.set(1, new Employe(3, 15000, "mahaRaj", "Mumbai"));
//		System.out.println();
//
//		System.out.println(empList.get(1));
//		System.out.println();
//
//		empList.remove(3);
//
//		Iterator<Employe> it2 = empList.iterator();
//		while (it2.hasNext())
//		System.out.println(it2.next());
//		System.out.println();
//		empList.add(1, new Employe(1, 80000, "RAJA", "Kolkata"));
//
//		Iterator<Employe> it1 = empList.iterator();
//
//		while (it1.hasNext())
//			System.out.println(it1.next());
//		System.out.println();
//
//		System.out.println("\nAfter clearing ... " + "");
//
//		// empList.removeAll(empList);
//		empList.clear();
//
//		Iterator<Employe> it3 = empList.iterator();
//		while (it3.hasNext())
//			System.out.println(it3.next());
//
//	}
//}
//
//class Employe {
//	private int EmpNo;
//	private long EmpSal;
//	private String EmpName;
//	private String EmpLoc;
//
//	public Employe(int empNo, long empSal, String empName, String empLoc) {
//		super();
//		EmpNo = empNo;
//		EmpSal = empSal;
//		EmpName = empName;
//		EmpLoc = empLoc;
//	}
//
//	@Override
//	public String toString() {
//		return "Employe [EmpNo=" + EmpNo + ", EmpSal=" + EmpSal + ", EmpName="
//				+ EmpName + ", EmpLoc=" + EmpLoc + "]";
//	}
//
//}
