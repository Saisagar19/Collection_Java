package collection.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.add("Reena");//Heterogeneous object are allowed.
		st.add(55);
		st.add(55);//duplicates Elements are allowed
		st.add(null);//null insertion possible
		st.add(true);
		st.add(55.3);
		st.add('a');
		st.add(2515);
		st.add('s');
		
		System.out.println("Stack 1: "+st);
		//push
		st.push(34);
		System.out.println(st);
		System.out.println("----------------");
		//pop
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println("----------------");
		// retrieve  an element
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println("----------------");
		
		Stack st1=new Stack();
		st1.add("teena");
		st1.add(5.5);
		st1.add(false);
		st1.add(553);
		st1.add('b');
		st1.add(215);
		// AddAll 
		System.out.println("Stack 2: "+st);
		System.out.println("----------------");;
		st.addAll(st1);
		System.out.println("updated Stack 1: "+st);
		System.out.println("----------------");
		
		//search
		System.out.println(st.search("teena"));
		System.out.println("----------------");
		
		
	}
}
