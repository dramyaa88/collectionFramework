package demo.queue;

import java.util.PriorityQueue;
import java.util.Queue;

class Product implements Comparable 
{
	private int pid;
	private String pname;
	
	public Product(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(this.pid>o.pid)
			return 1;
		else if(this.pid<o.pid)
			return -1;
		else
			return 0;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class PriorityQueueDemo {
	
	public void pQueue()
	{
		Queue<Product> obj = new PriorityQueue<Product>();
		obj.add(new Product(1,"ram"));
		obj.add(new Product(2,"ramyaa"));
		obj.add(new Product(3,"ramkumar"));
		obj.add(new Product(4,"hemu"));
		
		
		obj.element();
		
		
	}

}
