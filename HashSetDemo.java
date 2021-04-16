package demo.set;
import java.util.Collections;
import java.util.HashSet;

import demo.userObject.EmployeeClass;

public class HashSetDemo {
	
	public void invoke()
	{
		HashSet<EmployeeClass> hs = new HashSet<EmployeeClass>();
		Collections.synchronizedSet(hs);
		hs.add(new EmployeeClass(1,"Ram"));
		hs.add(new EmployeeClass(2,"Ramyaa"));
		hs.add(new EmployeeClass(3,"RamKumar"));
		hs.add(new EmployeeClass(4,"Ram Kumar"));
		hs.add(new EmployeeClass(5,"Hemu"));
		hs.add(new EmployeeClass(6,"Sasi"));
		
		System.out.println(hs);
		
		System.out.println("IsEmpty :"+hs.isEmpty());
		hs.remove("Hemu");
		System.out.println("size :"+hs.size());
		System.out.println("SplitIterator :"+hs.spliterator());
		
		
	}
	
	public static void main(String[] args) {
		
		HashSetDemo hss = new HashSetDemo();
		hss.invoke();
	}

}
