package collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add("lavender");
		list.add("Sagar");
		list.add(10.22);
		list.add('a');
		list.add(null);
		list.add(true);
		list.add("Sagar");
		list.add(5, 10);
		System.out.println("List 1: " + list);

		System.out.println("--------------------------");

		LinkedList list1 = new LinkedList();
		list1.add(100);
		list1.add('D');
		list1.add("Rahul");
		list1.add(90.22);
		System.out.println("List 2: " + list1);

		System.out.println("--------------------------");

		// Add all
		list.addAll(list1); // Add all 2nd list elements into 1st list or vice versa
		System.out.println("Updated List 1: " + list);

		System.out.println("--------------------------");

		// Addfirst
		list.addFirst(103); // It add first Element to the list
		System.out.println(list);

		System.out.println("--------------------------");

		// Addlast
		list.addLast("Bye");
		System.out.println(list); // It add last Element to the list

		System.out.println("--------------------------");

		// Add--> at index
		list.add(1, true);
		System.out.println(list);

		System.out.println("--------------------------");
		// Remove
		list.remove();
		System.out.println(list);
		System.out.println("-----------------------");
		// remove at index
		list.remove(2);
		System.out.println(list);
		System.out.println("-----------------------");
		// Remove an object
		list.remove("Rahul");
		System.out.println(list);

		// if you remove an integer or character it will throw an exception
		System.out.println("-----------------------");
		// indexof
		System.out.println("indext of : " + list.indexOf(10));
		System.out.println("-----------------------");
		// contains
		System.out.println(list.contains(10));
		System.out.println("-----------------------");
		// element
		System.out.println(list.element());
		System.out.println("-----------------------");
		// getFirst
		System.out.println(list.getFirst());
		System.out.println("-----------------------");
		// getLast
		System.out.println(list.getLast());
		System.out.println("-----------------------");
		// lastindexOf
		System.out.println("Last index of: " + list.lastIndexOf(10));
		System.out.println("-----------------------");
		// retrieve and remove an element
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println("-----------------------");
		// Check if list is empty or not
		System.out.println("is empty or not: " + list.isEmpty());
		System.out.println("-----------------------");
		// replace an element at a specific position
		list.set(0, 99.99);
		System.out.println(list);

		// reverse linked list
		Collections.reverse(list);
		System.out.println("Reverse list 1: " + list);

	}

}
