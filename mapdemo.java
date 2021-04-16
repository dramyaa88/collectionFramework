package demo.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import demo.userObject.EmployeeClass;

public class mapdemo {
	static void hashmap()
	{
		HashMap<Integer,EmployeeClass> hs=new HashMap<Integer,EmployeeClass>();
		
		hs.put(120,new EmployeeClass(1,"Ram"));
		hs.put(10,new EmployeeClass(2,"Ramyaa"));
		hs.put(20,new EmployeeClass(3,"RamKumar"));
		hs.put(30,new EmployeeClass(4,"Ram Kumar"));
		hs.put(40,new EmployeeClass(5,"Hemu"));
		hs.put(50,new EmployeeClass(6,"Sasi"));
		
		
		//System.out.println(hs);
		
//		((Object) hmap).elements();
//		
		Set set = hs.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry mapentry  = (Map.Entry)itr.next();
			System.out.println(mapentry.getKey()+"\t"+mapentry.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		
		hashmap();
	}

}
