package collection.LinkedList;

import java.util.LinkedList;

public class Assign2 {

	public static void main(String[] args) {
		LinkedList lt=new LinkedList();
		lt.add("Sagar");
		lt.add(100);
		lt.add("Student");
		lt.add("Sit College");
		lt.add('A');
		lt.add(0.33);
		lt.add(true);
		lt.add(110);
		
		// get element at a specific position
		System.out.println(lt.get(5));
		System.out.println(lt.get(0));
		System.out.println(lt.get(1));
	
	
	}
}
