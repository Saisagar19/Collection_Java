package collection.LinkedList;

import java.util.LinkedList;

public class Assign9 {
	
	public static void main(String[] args) {
		LinkedList list1=new LinkedList();
		list1.add("lily");
		list1.add("rose");
		list1.add("lotus");
		list1.add(10);
		list1.add('F');
		list1.add(100);
		list1.add(10.66);
		list1.add("tulip");
		list1.add("iris");
		list1.add("lavender");
		System.out.println("List 1: "+list1);
		
		// Check if list is empty or not
		System.out.println(list1.isEmpty());
		System.out.println("-----------------------");
		
		LinkedList list=new LinkedList();
		
		System.out.println(list.isEmpty());
		
}
}
