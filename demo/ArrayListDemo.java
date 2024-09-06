package collection.demo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(10);	// it is not adding an int data type.
		list.add(55);	// Int primitive data type is wrapped into Integer object.So we are adding an object to an arraylist.
		list.add(88);
		list.add(99);
		list.add(1);	//Duplicate elements are allowed
		list.add(1);
		list.add(10);
		list.add("Sagar");// Heterogeneous objects are allowed i.e(different data type objects)
		list.add(10.22);
		list.add('a');
		list.add(null);		// Null insertion are allowed;
		list.add(true);
		//System.out.println(list);
		
		ArrayList list1=new ArrayList();
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
		//System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		
		
		
		 
		
		
		
		
	}

}
