package collection.LinkedList;

import java.util.LinkedList;

public class Assign7 {
	public static void main(String[] args) {
		LinkedList list1=new LinkedList();
		list1.add("lily");
		list1.add("rose");
		list1.add("lotus");
		list1.add("orchid");
		list1.add("mariegold");
		list1.add("sunflower");
		list1.add("iris");
		list1.add("tulip");
		list1.add("iris");
		list1.add("lavender");
		System.out.println("List 1: "+list1);
		
		LinkedList list2=new LinkedList();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		list2.add(10);
		list2.add(2.00);
		list2.add(true);
		System.out.println("List 2: "+list2);
		
		list1.addAll(list2);
		System.out.println("Updated List :"+list1);
		
		
		
		
		
		
	}

}
