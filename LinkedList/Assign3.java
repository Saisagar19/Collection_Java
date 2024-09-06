package collection.LinkedList;

import java.util.LinkedList;

public class Assign3 {

	public static void main(String[] args) {
		
		// Remove 2 elements , 1 from beginning 1 from end
		
		LinkedList lt=new LinkedList();
		lt.add("Sagar");
		lt.add(100);
		lt.add("Student");
		lt.add("Sit College");
		lt.add('A');
		lt.add(0.33);
		lt.add(true);
		lt.add(110);
		
		System.out.println(lt);
		System.out.println("---------");
		
		lt.remove();
		System.out.println(lt);
		
		System.out.println("---------");
		
		lt.remove(6);
		System.out.println(lt);
	}
}
