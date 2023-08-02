package org;

public class Employee {
public void empId(int a) {
	System.out.println(a);
}
public void empName() {
	System.out.println("The employee name is Tiviya");
	
}
public void empName(String b) {
	System.out.println("The employee name is"+b);
	
}

public void empPhone(String b, int c) {
System.out.println("Employee"+ b + "Phone no. is"+ c);
	
}
public void empDob(String b,int d, String e) {
	System.out.println(b+d+e);
}
public static void main(String[]args) {
	Employee e =new Employee();
	e.empId(01);
	e.empName();
	e.empName("Priya");
	e.empPhone("Priya", 95);
	e.empDob("Priya", 11, "June");
	
	
	
}


}
