package linkedlistDemo;

import java.util.Collections;
import java.util.LinkedList;

public class linkedListDemo {
	public static void main(String[] args) 
	{
		LinkedList list= new LinkedList();
		list.add(1);
		list.add("Sagar");
		list.add(44.55);
		list.add(true);
		list.add(null);
		list.add("Oops");
		list.add("Dsa");
		System.out.println(list);

		//for adding an object in the list
		LinkedList list1= new LinkedList();
		list1.add("rohit");
		list1.add("soham");
		list1.add(false);
		list1.add(96);
		list1.add(88.5);
		System.out.println(list1);

		//adding to list in a one

		list.addAll(list1);
		System.out.println(list);
		//Adding an object in the first index
		list.addFirst("start");
		System.out.println(list);
		//Adding an object in the last index
		list.addLast("end");
		System.out.println(list);
		//add at index
		list.add(1, null);
		System.out.println(list);
		//contains - 
		System.out.println(list.contains("soham"));
		// remove 1st element from the list
		list.remove();
		System.out.println(list);

		//remove at index
		list.remove(3);
		System.out.println(list);

		// remove an object
		list.remove("soham");
		System.out.println(list);

		//remove first element from the list
		list.removeFirst();
		System.out.println(list);

		//remove last element from the list
		list.removeLast();
		System.out.println(list);

		// element- it will show the first element of the list.it is commonly used in iterator.
		System.out.println(list.element());

		System.out.println("**********************************");
		//get - get an object from the list using for loop concept
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("**********************************");
		//indexof - it will print the index of an object
		System.out.println(list.indexOf(null));

		//GetFirst- it will print first element of a list
		System.out.println(list.getFirst());
		//GetLast- it will print first element of a list
		System.out.println(list.getLast());

		//lastindexof
		System.out.println(list.lastIndexOf(false));
		//pollMethod- it will delete the first element and also show the deleted element
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.isEmpty());
		Collections.reverse(list);
		System.out.println(list);
		//replace --> it will replace oldObject with the new one.
		Collections.replaceAll(list, "Sagar", "saisagar");
		System.out.println(list);
		

	}



}
