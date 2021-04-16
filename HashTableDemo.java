package demo.map;

import java.util.*;

public class HashTableDemo {
	
	static void hashh()
	{
	
	Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
	numbers.put("one", 1);
	numbers.put("two", 2);
	numbers.put("three", 3);
	
	//enumeration 
	Enumeration e = numbers.elements();
	while(e.hasMoreElements())
	{
		System.out.print(e.nextElement()+" ");
		
	}
	System.out.println();
	
	//Iterator
	Set set = numbers.entrySet();
	Iterator itr = set.iterator();
	while(itr.hasNext())
	{
		Map.Entry map = (Map.Entry)itr.next();
		System.out.println(map.getKey()+" "+map.getValue());
	}
	
	System.out.println();
	
	//keySet
	Set<String> sets = numbers.keySet();
	Iterator<String> itrr = sets.iterator();
	while(itrr.hasNext())
	{
		String key = itrr.next();
		System.out.println(key +" "+numbers.get(key));
		
	}
	
	}
//	hs.put(1,"Ram");
//	hs.put(10,new EmployeeClass(2,"Ramyaa"));
//	hs.put(20,new EmployeeClass(3,"RamKumar"));
//	hs.put(30,new EmployeeClass(4,"Ram Kumar"));
//	hs.put(40,new EmployeeClass(5,"Hemu"));
//	hs.put(50,new EmployeeClass(6,"Sasi"));
	public static void main(String[] args) {
		hashh();
	}
	

}
