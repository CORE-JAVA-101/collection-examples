package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App35 {

	// creating a list having unique elements
	public static void main(String[] args) {

		stringTypeUniqueList();
		userDefinedTypeUniqueList();
	}

	public static void stringTypeUniqueList() {
		List<String> stringNameList = new ArrayList<String>();

		String s1 = new String("Ram");
		String s2 = new String("hari");
		String s3 = new String("Ram");

		stringNameList.add(s1);
		stringNameList.add(s2);

		System.out.println(stringNameList);

		System.out.println(stringNameList.contains(s1));
		System.out.println(stringNameList.contains(s2));
		System.out.println(stringNameList.contains(s3));// i have not added s3
														// but it returns true
														// because String class
														// override equals
														// method for content
														// comparison

	}

	public static void userDefinedTypeUniqueList() {
		List<Laptop> laptopList = new ArrayList<Laptop>();

		Laptop l1 = new Laptop(4, "SONY", "WINDOWS");
		Laptop l2 = new Laptop(4, "DELL", "WINDOWS");
		Laptop l3 = new Laptop(4, "SONY", "WINDOWS");

		laptopList.add(l1);
		laptopList.add(l2);

		System.out.println(laptopList);

		System.out.println(laptopList.contains(l1));
		System.out.println(laptopList.contains(l2));
		System.out.println(laptopList.contains(l3));

	}
}

class Laptop {

	private Integer processor;
	private String brand;
	private String osName;

	public Laptop(Integer processor, String brand, String osName) {
		super();
		this.processor = processor;
		this.brand = brand;
		this.osName = osName;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println((Laptop) obj);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (osName == null) {
			if (other.osName != null)
				return false;
		} else if (!osName.equals(other.osName))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		return true;
	}

	// to String()
	@Override
	public String toString() {
		return "Laptop [processor=" + processor + ", brand=" + brand
				+ ", osName=" + osName + "]";
	}

}