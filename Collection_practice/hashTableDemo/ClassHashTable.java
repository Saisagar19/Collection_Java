package hashTableDemo;

import java.util.Hashtable;

public class ClassHashTable {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> h= new Hashtable<Integer, String>();
		h.put(1, "Sagar");
		h.put(2, "Aaditya");
		h.put(3, "Devesh");
		h.put(4, "Sahil");
		h.put(5, "Siddhant");
		h.put(6, "pranay");
		System.out.println(h);		
	}

}
