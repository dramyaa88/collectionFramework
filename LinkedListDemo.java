package demo.list;

import java.util.Iterator;
import java.util.LinkedList;

import demo.userObject.EmployeeClass;

public class LinkedListDemo {
	
	public void invoke()
	{
		LinkedList<EmployeeClass> lle = new LinkedList<EmployeeClass>();
		lle.add(new EmployeeClass(1,"Ram"));
		lle.add(new EmployeeClass(2,"Ramyaa"));
		lle.add(new EmployeeClass(3,"RamKumar"));
		lle.add(new EmployeeClass(4,"Ram Kumar"));
		lle.add(new EmployeeClass(5,"Hemu"));
		
		lle.addFirst(new EmployeeClass(6,"sasi"));
		lle.addLast(new EmployeeClass(7,"dhana"));
		
		System.out.println("Element method");
		EmployeeClass emp = lle.element();
		System.out.println(emp);
		
		System.out.println("Clone :"+lle.clone());
		System.out.println("Containss :"+lle.contains(3));
		System.out.println("Index of :"+lle.indexOf("RamKumar"));
		System.out.println("Poll :"+lle.poll());
		System.out.println("Get index "+lle.get(4));
		//System.out.println("Set :"+lle.set(0, "dhanasekar"));
		
		Iterator<EmployeeClass> obj = lle.iterator();
		
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
		
		System.out.println(lle.contains("Hemu"));
	}
	
	public static void main(String[] args) {
		
		LinkedListDemo ob = new LinkedListDemo();
		ob.invoke();
	}

}
