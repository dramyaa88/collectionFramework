package demo.list;

import java.util.Enumeration;
import java.util.Vector;

import demo.userObject.EmployeeClass;

 //Vecotor is synchronized

public class VectorDemo {
	
	public void vectorOperations()
	{
		Vector v = new Vector(5,5);
		//heterogeneous objects
		
		System.out.println("Default capacity of the vector "+v.capacity());
		
		v.add("Java"); //String Object
		v.add(500); // Integer Object
		v.add(4567.87f);
		v.add(678);
		v.add(6789.89f);
		v.add("Ram");
		v.add(456);
		v.add(5678.67f);
		v.add(567);
		v.add("Hemu");
		
		
		
		//creating user defined object
		EmployeeClass emp = new EmployeeClass(52,"Ramyaa");
		
		v.add(emp);
		
		System.out.println("Size of vector after adding "+v.size());
		
		System.out.println("capacity of the vector "+v.capacity());
		
		
		System.out.println("First Element "+v.firstElement());
		System.out.println("Last Element "+v.lastElement());
		System.out.println("Element at index 0 "+v.get(0));
		System.out.println("Index of "+v.indexOf("Ram"));
		System.out.println("Last Index of "+v.lastIndexOf(emp));
		Object obj[] = v.toArray();
		
		for(Object ob : obj)
		{
			System.out.println(ob);
		}
		
		System.out.println("Traversing using enumeration ");
		//traversing using enumeration Interface
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			Object objj = e.nextElement();
			//
			if(objj instanceof String )
			{
				System.out.println("String : "+objj);
			}
			else if(objj instanceof Float)
			{
				System.out.println("Float : "+objj);
			}
			else if(objj instanceof Double)
			{
				System.out.println("Double :"+objj);
			}
			else if(objj instanceof EmployeeClass)
			{
				EmployeeClass ee = (EmployeeClass)objj;
			}
		}
		System.out.println("Capacity "+v.capacity());
		v.trimToSize();
		System.out.println("Capacity "+v.capacity());
		System.out.println(v);
		v.remove("Java");
		v.remove(0);
		System.out.println("Size of vector " +v.size());
		v.remove(emp);
		System.out.println("Size of vector " +v.size());
		System.out.println(v);
		System.out.println("Clone "+v.clone());
		System.out.println("Contains :"+v.contains("Ram"));
		System.out.println("Elements At 3rd position:"+v.elementAt(3));
		
		//autoboxing and unboxing
		int value = 100;
		
		Integer ivalue = new Integer(value);
		
		//from 1.5
		Integer i =value;
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		VectorDemo obj = new VectorDemo();
		obj.vectorOperations();
	}

}
