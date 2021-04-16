package demo.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import demo.userObject.EmployeeClass;

public class TreeSetDemo {
	
	public void invoke()
	{
		TreeSet<EmployeeClass> hs = new TreeSet<EmployeeClass>(new EmployeeNameComparator);
		hs.add(new EmployeeClass(1,"Ram"));
		hs.add(new EmployeeClass(2,"Ramyaa"));
		hs.add(new EmployeeClass(3,"RamKumar"));
		hs.add(new EmployeeClass(4,"Ram Kumar"));
		hs.add(new EmployeeClass(5,"Hemu"));
		hs.add(new EmployeeClass(6,"Sasi"));
		
		System.out.println(hs);
		
		Iterator<EmployeeClass> i = hs.iterator();
		int it=1;
		while(i.hasNext())
		{
			EmployeeClass e = i.next();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		TreeSetDemo ts = new TreeSetDemo();
		ts.invoke();
	}
}
