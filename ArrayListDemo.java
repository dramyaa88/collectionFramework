package demo.list;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import demo.userObject.EmployeeClass;

public class ArrayListDemo {
	
	public void alOperations()
	{
		ArrayList<EmployeeClass> al = new ArrayList<EmployeeClass>();
		Collections.synchronizedList(al);
		al.ensureCapacity(5);
		System.out.println("Size "+al.size());
		al.add(new EmployeeClass(10,"Ramyaa"));
		al.add(new EmployeeClass(20,"Ramkumar"));
		al.add(new EmployeeClass(30,"Hemu"));
		al.add(new EmployeeClass(10,"Ram"));
		System.out.println("Size "+al.size());
		
		//traversing or iterating the container 
		//case 1 using Iterator
//		Iterator<EmployeeClass> obj =al.iterator();
//		
//		while(obj.hasNext())
//		{
//			EmployeeClass e = obj.next();
//			e.display();
//		}
		
		//case 2 
		ListIterator<EmployeeClass> li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}

		
	}
	
	public static void main(String[] args) {
		ArrayListDemo obj = new ArrayListDemo();
		obj.alOperations();
		
	}

}
