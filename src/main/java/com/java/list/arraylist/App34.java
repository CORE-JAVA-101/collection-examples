package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class App34 {

	// Enumeration: 
	public static void main(String[] args) {

		List<Books> bookList = new ArrayList<Books>();

		for (int i = 1; i < 5; i++) {
			Books books = new Books("ISBN" + i, "AUTHOR" + i,
					"PUBLICATION" + i, 234.56f);
			bookList.add(books);
		}

		Enumeration<Books> bookEnums = Collections.enumeration(bookList);

		while (bookEnums.hasMoreElements())
			System.out.println(bookEnums.nextElement());

	}
}

class Books {
	private String isbnNUm;
	private String author;
	private String publication;

	private float price;

	public Books(String isbnNUm, String author, String publication, float price) {
		super();
		this.isbnNUm = isbnNUm;
		this.author = author;
		this.publication = publication;
		this.price = price;
	}

	public String getIsbnNUm() {
		return isbnNUm;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublication() {
		return publication;
	}

	public float getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Books [isbnNUm=" + isbnNUm + ", author=" + author
				+ ", publication=" + publication + ", price=" + price + "]";
	}

}
