package com.java.list.vector.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class App1 {
	/*
	 * Stack is a subclass of Vector that implements a standard last-in,
	 * first-out stack. Stack only defines the default constructor, which
	 * creates an empty stack. Stack includes all the methods defined by Vector,
	 * and adds several of its own.
	 * 
	 * To put an object on the top of the stack, call push(). To remove and
	 * return the top element, call pop(). An EmptyStackException is thrown if
	 * you call pop( ) when the invoking stack is empty. You can use peek( ) to
	 * return, but not remove, the top object.
	 * 
	 * The empty() method returns true if nothing is on the stack. The search()
	 * method determines whether an object exists on the stack, and returns the
	 * number of pops that are required to bring it to the top of the stack.
	 * Here is an example that creates a stack, pushes several Integer objects
	 * onto it, and then pops them off again:
	 */
	static void showpush(Stack st, int a) {
		st.push(new Integer(a));
		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}

	static void showpeek(Stack st) {
		System.out.print("peek -> ");// Looks at the object at the top of this
										// stack without removing it from the
										// stack.

		Integer a = (Integer) st.peek();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	static void showpop(Stack st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	static void showsearch(Stack st, Object obj) {
		System.out.print("search -> ");
		Integer a = (Integer) st.search(obj);
		/*
		 * Returns the 1-based position where an object is on this stack. If the
		 * object o occurs as an item in this stack, this method returns the
		 * distance from the top of the stack of the occurrence nearest the top
		 * of the stack; the topmost item on the stack is considered to be at
		 * distance 1. The equals method is used to compare o to the items in
		 * this stack.
		 */
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	public static void main(String args[]) {
		// try to work out with other methods of collection framework related to
		// stack
		Stack st = new Stack();
		System.out.println("stack: " + st);

		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);

		showsearch(st, 66);
		showpeek(st);

		showpop(st);
		showpop(st);
		showpop(st);

		try {
			showpop(st);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}

}