package com.java.set.hashset;

import java.util.HashSet;
import java.util.Set;
/*
 * Creating and printing Set of Student class
 *Set checks the object ref but not the object contents unless equals() method is implemented
 * */
public class App3 {
	public static void main(String[] args) {

		Set<Student1> studentSet = new HashSet<Student1>();

		Student1 s1 = new Student1(10, "gayatri");
		Student1 s2 = new Student1(20, "arman");
		Student1 s3 = new Student1(10, "gayatri");
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		System.out.println(studentSet);
		System.out.println(studentSet.size());// why 2
	}
}

class Student1 {
	private int rollNum;
	private String name;

	public Student1(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		System.out.println("equals()");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNum != other.rollNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student1 [rollNum=" + rollNum + ", name=" + name + "]";
	}
}