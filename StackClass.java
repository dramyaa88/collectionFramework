package demo.list;

import java.util.Stack;

public class StackClass {
	
	public void stackOperations()
	{
		Stack s = new Stack();
		System.out.println("Default capacity "+s.capacity());
		System.out.println("Push Operation ");
		s.push("Ram");
		s.push("RamKumar");
		s.push("Ram Kumar");
		s.push("Ramyaa");
		s.push(52);
		s.push(78654.89f);
		s.push(7865);
		s.push("Java");
		s.push(9087);
		s.push(7865);
		s.push(7865);
		System.out.println("size :"+s.size());
		System.out.println("Capacity :"+s.capacity());
		System.out.println(s);
		System.out.println("Pop Operattion ");
		s.pop();
		System.out.println(s);
		System.out.println("Peek Opoeration ");
		System.out.println(s.peek());
		
	}
	
	public static void main(String[] args) {
		StackClass obj =  new StackClass();
		obj.stackOperations();
	}
	
	
}
