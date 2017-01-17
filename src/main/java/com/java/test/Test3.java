package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		Map<EmployeeNo, EmployeeInfo1> emp = new LinkedHashMap<EmployeeNo, EmployeeInfo1>();

		emp.put(new EmployeeNo(01), new EmployeeInfo1("MIHIR", "KOLKATA", 10000));
		emp.put(new EmployeeNo(02), new EmployeeInfo1("AJAY", "MUMBAI", 45000));

		emp.put(new EmployeeNo(03), new EmployeeInfo1("KARTHIK", "DELHI", 20000));
		emp.put(new EmployeeNo(04), new EmployeeInfo1("GANESH", "BNGALORE",
				10700));
		emp.put(new EmployeeNo(05), new EmployeeInfo1("DURGA", "PUNE", 12000));

		Set<Entry<EmployeeNo, EmployeeInfo1>> entryset = emp.entrySet();

		for (Entry<EmployeeNo, EmployeeInfo1> entry : entryset) {
			EmployeeNo emp1 = entry.getKey();
			EmployeeInfo1 emp2 = entry.getValue();

			// System.out.println(emp1.getEmpNo() + "--" + emp2.getEmpName()
			// + "--" + emp2.getEmpCity() + "--" + emp2.getEmpSal());

			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		
		// Iterator<EmployeeInfo> it = .iterator();
		//
		// while (it.hasNext()){
		// EmployeeInfo key=it.next();
		// EmployeeInfo value= emp.get(key) ;
		// System.out.println(key+"---"+value);
		// }
	}
}

class EmployeeNo {
	private int empNo;

	public EmployeeNo(int empNo) {
		super();
		this.empNo = empNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	@Override
	public String toString() {
		return "EmployeeNo [empNo=" + empNo + "]";
	}

	
}

class EmployeeInfo1 {
	private String empName;
	private String empCity;
	private int empSal;

	public EmployeeInfo1(String empName, String empCity, int empSal) {
		super();
		this.empName = empName;
		this.empCity = empCity;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [empName=" + empName + ", empCity=" + empCity
				+ ", empSal=" + empSal + "]";
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public int getEmpSal() {
		return empSal;
	}
}
