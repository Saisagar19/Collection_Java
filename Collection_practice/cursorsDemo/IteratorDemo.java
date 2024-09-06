package cursorsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList aa=new ArrayList();
		aa.add(25);
		aa.add(22);
		aa.add(27);
		aa.add(24);
		aa.add(35);
		aa.add(456);
		System.out.println(aa);
		//we can apply iterator concept to any collection object hence it is universal cursor
		// iterator has three methods: 1)hasNext() 2)next() 3)remove()
		Iterator itr=aa.iterator();
		while(itr.hasNext()) 
		{
			Integer in=(Integer)itr.next();
			if(in %2==0)
			{
				System.out.println(in);
			}
			else
			{
				itr.remove();
			}
		}
		System.out.println(aa);
		
		
	}

}
