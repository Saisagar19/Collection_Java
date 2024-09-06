package cursorsDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("BalKrishna");
		l.add("Sudhama");
		l.add("Balram");
		l.add("Narayana");
		System.out.println(l);
		
		ListIterator ltr=l.listIterator();
		
		while(ltr.hasNext())
		{
			String forward=(String)ltr.next();
			
			
			if(forward.equals("Sudhama"))
			{
				ltr.set("Radha");			//Replacement
			}
			else if(forward.equals("Balram"))
			{
				ltr.remove();		//Removing an object
			}
			else if(forward.equals("Narayana"))
			{
				ltr.add("Ganesha");	//Adding an object 
			}
			
		}
		System.out.println(l);
		System.out.println("----------------------------------");

		while(ltr.hasPrevious())
		{
			String backward=(String)ltr.previous();
			System.out.println(backward);
			
			
			if(backward.equals("BalKrishna"))
			{
				ltr.set("Vishnu");			//Replacement
			}
			else if(backward.equals("Radha"))
			{
				ltr.remove();		//Removing an object
			}
			else if(backward.equals("Narayana"))
			{
				ltr.add("Raghu");	//Adding an object 
			}
			
		}
		System.out.println(l);
	}

}
