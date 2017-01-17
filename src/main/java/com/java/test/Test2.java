package com.java.test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		Map<EmployeeInfo, EmployeeInfo> emp = new LinkedHashMap<EmployeeInfo, EmployeeInfo>();

		emp.put(new EmployeeInfo(01), new EmployeeInfo("MIHIR", "KOLKATA",
				10000));
		emp.put(new EmployeeInfo(02), new EmployeeInfo("AJAY", "MUMBAI", 45000));

		emp.put(new EmployeeInfo(03), new EmployeeInfo("KARTHIK", "DELHI",
				20000));
		emp.put(new EmployeeInfo(04), new EmployeeInfo("GANESH", "BNGALORE",
				10700));
		emp.put(new EmployeeInfo(05), new EmployeeInfo("DURGA", "PUNE", 12000));

		Set<Entry<EmployeeInfo, EmployeeInfo>> entryset = emp.entrySet();

		for (Entry<EmployeeInfo, EmployeeInfo> entry : entryset) {
			EmployeeInfo emp1 = entry.getKey();
			EmployeeInfo emp2 = entry.getValue();

			System.out.println(emp1.getEmpNo() + "--" + emp2.getEmpName()
					+ "--" + emp2.getEmpCity() + "--" + emp2.getEmpSal());

			// System.out.println(entry.getKey()+"--"+entry.getValue());

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

class EmployeeInfo {
	private int empNo;
	private String empName;
	private String empCity;
	private int empSal;

	public EmployeeInfo(int empNo) {
		super();
		this.empNo = empNo;
	}

	public EmployeeInfo(String empName, String empCity, int empSal) {
		super();
		this.empName = empName;
		this.empCity = empCity;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [empNo=" + empNo + ", empName=" + empName
				+ ", empCity=" + empCity + ", empSal=" + empSal + "]";
	}

	public int getEmpNo() {
		return empNo;
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

	// public void setEmpNo(int empNo) {
	// this.empNo = empNo;
	// }
	//
	// public void setEmpName(String empName) {
	// this.empName = empName;
	// }
	//
	// public void setEmpCity(String empCity) {
	// this.empCity = empCity;
	// }
	//
	// public void setEmpSal(int empSal) {
	// this.empSal = empSal;
	// }

}
