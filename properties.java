package demo.utility;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class properties {
	
	public static void invoke()
	{
		Properties obj = new Properties();
		obj.setProperty("ID", "Name");
		Properties pro = new Properties(obj);
		pro.setProperty("100", "Ram");
		pro.setProperty("101", "Ramyaa");
		System.out.println(pro.getProperty("100"));
		
		Set<Entry<Object,Object>> set = pro.entrySet();
		Iterator<Entry<Object,Object>> itr = set.iterator();
		
		while(itr.hasNext())
		{
			Entry<Object,Object> s = itr.next();
			System.out.println(s.getKey()+" "+s.getValue());
		}
		
		//method 2
		Set s2 = pro.stringPropertyNames();
		Iterator<Entry<Object,Object>> itr1 = s2.iterator();
//		itr  = s2.iterator();
		System.out.println("Property name");
		while(itr1.hasNext());
		{
			System.out.println("Name :"+itr1.next());
		}
		
		//enumeration
		Enumeration e = pro.propertyNames();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}
	
	public static void main(String[] args) {
		invoke();
	}
}
