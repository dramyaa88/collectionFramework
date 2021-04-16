package demo.userObject;

public class EmployeeClass implements Comparable<EmployeeClass> {
	
	private int empId;
	private String empName;
	
	public EmployeeClass(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "EmployeeClass [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public void display()
	{
		System.out.print("EmpId :"+empId);
		System.out.print("  Name :"+empName);
		System.out.println();
	}

	@Override
	public int compareTo(EmployeeClass o) {
		// TODO Auto-generated method stub
		System.out.println("First coming object :"+o);
		System.out.println("current object :"+this);
		if(this.empId>o.empId)
		{
			return 1;
		}
		else if(this.empId<o.empId)
		{
			return -1;
		}
		else
			return 0;
	}

}
