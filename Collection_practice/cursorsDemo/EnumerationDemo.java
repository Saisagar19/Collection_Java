package cursorsDemo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		for (int i = 0; i <=10; i++) 
		{
			v.add(i);	
		}
		System.out.println(v);
		//But i Wanted to get an object one by one from the collection then we use the concept of cursors
		//there are three type of cursors;
		//1)Enumeration 2)Iterator 3)ListIterator
		
		//for legacy classes we use Enumeration
		
		Enumeration<Integer> e=v.elements(); 
		
		while(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
	
	}
}
