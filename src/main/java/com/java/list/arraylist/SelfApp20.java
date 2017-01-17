package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Arraylist of type car using UUID as engine no 
// arraylist to array
// SORTING Using Arrays class[java.util]
// SORTING Using Collections.sort
//iterate using 3 types of iterator 
//similary for user defined data type try to use the below methods
// addAll
// retainAll
// containsAll
// remove(int index)
// remove(Object object)
// remove(Collection c)
// indexOf

public class SelfApp20 {

	public static void iteratingMethod(List<Vehicle> o) {
		Iterator<Vehicle> it = o.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

	public static void main(String[] args) {

		Bike model11 = new Bike(UUID.randomUUID().toString(), "Honda", 45000,
				90);
		Bike model12 = new Bike(UUID.randomUUID().toString(), "Honda", 50000,
				75);
		Bike model13 = new Bike(UUID.randomUUID().toString(), "HERO", 40000, 60);
		Bike model14 = new Bike(UUID.randomUUID().toString(), "Yamaha", 650000,
				100);

		Car model1 = new Car(UUID.randomUUID().toString(), "Honda", 450000, 60,
				"Red");
		Car model2 = new Car(UUID.randomUUID().toString(), "Maruti", 200000,
				60, "White");
		Car model3 = new Car(UUID.randomUUID().toString(), "Hyundai", 850000,
				85, "Black");
		Car model4 = new Car(UUID.randomUUID().toString(), "BMW", 8500000, 60,
				"Brown");
		Car model5 = new Car(UUID.randomUUID().toString(), "Audi", 5000000, 70,
				"White");

		Car model6 = new Car(UUID.randomUUID().toString(), "Mercedeze", 900000,
				60, "White");

		List<Vehicle> carList = new ArrayList<Vehicle>();
		List<Vehicle> bikeList = new ArrayList<Vehicle>();

		bikeList.add(model11);
		bikeList.add(model12);
		bikeList.add(model13);
		bikeList.add(model14);

		carList.add(model1);
		carList.add(model2);
		carList.add(model3);
		carList.add(model4);
		carList.add(model6);
		carList.add(2, model5);

		System.out.println("\nDisplaying car info \n ");
		iteratingMethod(carList);

		System.out.println("\nConverting list to array\n");
		Object arr[] = carList.toArray();

		System.out.println("\nPrinting array....using for loop \n");
		for (int i = 0; i < carList.size(); i++)
			System.out.println(carList.get(i));

		System.out.println("\nPrinting array....using for-each \n");
		for (Object car : arr) {
			Car c = (Car) car;
			System.out.println(c);
		}

		Collections.sort(carList, new Logic());

		System.out.println("\nDisplying after sorting\n");

		iteratingMethod(carList);

		carList.addAll(0, bikeList);
		System.out.println("\n Displying after merging\n");
		Iterator<Vehicle> it1 = carList.iterator();
		while (it1.hasNext())
			System.out.println(it1.next());

		System.out.println("\n Contains all bike? "
				+ carList.containsAll(bikeList));

		System.out.println("\n Contains Model-3? " + carList.contains(model3));

		carList.remove(model12);
		System.out
				.println("\n Contains Model-12? " + carList.contains(model12));

		carList.retainAll(bikeList);
		System.out.println("\n Contains all car? "
				+ carList.containsAll(bikeList));
		System.out.println("\nShowing bikes in carlist\n*******");
		iteratingMethod(carList);

		System.out.println("\n Showing the index of Model-3\n*****");
		System.out.println(carList.indexOf(model3));

		System.out.println("****FINALLY CLEARING ALL THE DATA******");
		carList.clear();
		bikeList.clear();

		iteratingMethod(carList);
		iteratingMethod(bikeList);

		System.out.println("CLEARED... NO DATA TO SHOW" + "");
	}

}

class Logic implements Comparator<Vehicle> {

	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		if (o1.getPrice() < o2.getPrice())
			return 1;
		else
			return -1;
	}

}

abstract class Vehicle {
	public abstract long getPrice();
}

class Car extends Vehicle {
	private String engineNo;
	private String company;
	private long price;
	private int mileage;
	private String color;

	public Car(String engineNo, String company, long price, int mileage,
			String color) {
		super();
		this.engineNo = engineNo;
		this.company = company;
		this.price = price;
		this.mileage = mileage;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [engineNo=" + engineNo + ", company=" + company
				+ ", price=" + price + ", mileage=" + mileage + ", color="
				+ color + "]";
	}

	public String getEngineNo() {
		return engineNo;
	}

	public String getCompany() {
		return company;
	}

	public long getPrice() {
		return price;
	}

	public int getMileage() {
		return mileage;
	}

	public String getColor() {
		return color;
	}

}

class Bike extends Vehicle {
	private String engineNo;
	private String company;
	private long price;
	private int mileage;

	public Bike(String engineNo, String company, long price, int mileage) {
		super();
		this.engineNo = engineNo;
		this.company = company;
		this.price = price;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Bike [engineNo=" + engineNo + ", company=" + company
				+ ", price=" + price + ", mileage=" + mileage + "]";
	}

	public String getEngineNo() {
		return engineNo;
	}

	public String getCompany() {
		return company;
	}

	public long getPrice() {
		return price;
	}

	public int getMileage() {
		return mileage;
	}

}