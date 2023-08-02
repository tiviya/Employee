package org;

public class Demo extends Employee {
	@Override
	public void empId(int e) {
		System.out.println("renaming the same methods employee's id print statement"+e);
		super.empId(e);
	}
	@Override
public void  empName(String f) {
	System.out.println(f +"=renaming the same methods employee's name print statement");
	super.empName("Raja");

}
public static void main(String[]args) {
	Demo i=new Demo();
	i.empId(51);
	i.empName("Raja");
	
}
}
