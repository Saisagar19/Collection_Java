package collection.LinkedList;

import java.util.LinkedList;

public class Assign1 {
	
	public static void main(String[] args) {
		System.out.println("List 1:");
		LinkedList lt=new LinkedList();
		lt.add(100);
		lt.add("NAme");
		lt.add("Age");
		lt.add('A');
		lt.add(10.33);
		lt.add(true);
		lt.add(100);
		lt.add('M');
		System.out.println(lt);
		
		System.out.println(lt.contains(10.33));
		System.out.println(lt.contains(10.3));
		System.out.println(lt.contains("Age"));
		
		System.out.println("-----------------");
		
		
		
		
		
	}

}
