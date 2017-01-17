package com.java.list.arraylist;

public class Employee {
	private String empId;
	private String empNm;
	private String empCity;

	public Employee(String empId, String empNm, String empCity) {
		// super();
		this.empId = empId;
		this.empNm = empNm;
		this.empCity = empCity;
	}

	
	public String getEmpId() {
		return empId;
	}


	public String getEmpNm() {
		return empNm;
	}


	public String getEmpCity() {
		return empCity;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNm=" + empNm + ", empCity="
				+ empCity + "]";
	}

	

	
}
