package com.java.list.arraylist;

public class Employee1 {
	private String empId;
	private String empNm;
	private String empCity;

	public Employee1(String empId, String empNm, String empCity) {
		// super();
		this.empId = empId;
		this.empNm = empNm;
		this.empCity = empCity;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empNm=" + empNm + ", empCity="
				+ empCity + "]";
	}

	// alt+shift+s,h : to generate equals and hashCode method. but you have to
	// remember this for interview.
	@Override
	public int hashCode() {
		System.out.println(this.getClass().getName() + "- hashCode()");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empCity == null) ? 0 : empCity.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empNm == null) ? 0 : empNm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(this.getClass().getName() + "- equals()");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (empCity == null) {
			if (other.empCity != null)
				return false;
		} else if (!empCity.equals(other.empCity))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empNm == null) {
			if (other.empNm != null)
				return false;
		} else if (!empNm.equals(other.empNm))
			return false;
		return true;
	}

}
