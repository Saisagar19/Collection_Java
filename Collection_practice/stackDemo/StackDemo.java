package stackDemo;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack st1=new Stack();
		st1.add("Hello");
		st1.add(10);
		st1.add('A');
		st1.add(22.5f);
		st1.add(22.667);
		st1.add(true);
		st1.add("Hello");
		System.out.println(st1);
		
		System.out.println("-------------------------");
		//push--> it will add an element in the stack
		st1.push(100);
		System.out.println(st1);
		System.out.println("-------------------------");
		//pop--> it will remove an element from the stack(LIFO order)
		st1.pop();
		System.out.println(st1);
		System.out.println("-------------------------");
		//peek --> it will return the top element from the stack
		System.out.println(st1.peek());
		System.out.println("-------------------------");
		Stack st2=new Stack();
		
		st2.add(100);
		st2.add('D');
		st2.add(56.5f);
		st2.add(56.667);
		st2.add(false);
		st2.add("Hi");
		System.out.println(st2);
		//AddAll-->it add one list to another list
		st1.addAll(st2);
		System.out.println(st1);
		System.out.println(st2.search('D'));


	}

}
