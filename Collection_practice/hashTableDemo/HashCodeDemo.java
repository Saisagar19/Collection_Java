package hashTableDemo;

import java.util.Hashtable;

public class HashCodeDemo {


	public static void main(String[] args) 
	{
		Hashtable<Integer, String> h= new Hashtable<Integer, String>();
		h.put(8, "Sagar");
		h.put(22, "Aaditya");
		h.put(12, "Devesh");
		h.put(29, "Sahil");
		h.put(13, "Siddhant");
		h.put(23, "pranay");
		System.out.println(h);	
	}
	
	class Temp
	{
		int i;
		
		public Temp(int i)
		{
			this.i=i;
			
		}
		public int hashCode()
		{
			return i;	
		}
		
		public String toString(){
			
			return i+" ";
		}	
	}
}
