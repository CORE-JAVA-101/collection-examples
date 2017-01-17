package com.java.set.hashset;

import java.util.HashSet;
import java.util.Set;
/*
 *Creating and printing Set of Student class
 *Set checks the object ref but not the object contents unless equals() method is implemented
 * */
public class App2 {
	public static void main(String[] args) {

		Set<Student> studentSet = new HashSet<Student>();

		Student s1 = new Student(10, "gayatri");
		Student s2 = new Student(20, "arman");
		Student s3 = new Student(10, "gayatri");
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
System.out.println(studentSet);
		System.out.println(studentSet.size());//why 3
	}
}

class Student {
	private int rollNum;
	private String name;

	public Student(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + "]";
	}

}