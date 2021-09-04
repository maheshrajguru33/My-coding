package com.Session5;

public class Employee implements Comparable<Employee>{
	int empId;
	String empName;
	public Employee(){
		
	}
//	public Employee (int empId, String empName){
//		super();
//		this.empId=empId;
//		this.empName=empName;
//		
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "empId=" + empId  +", empName=" + empName ;
		
	}
	@Override
	public int compareTo(Employee obj) {
		// TODO Auto-generated method stub
	//	return empName.compareTo(obj.empName);//on the basis of Name sorting
//on the basis of the empId
		
		if(empId==obj.empId)
		return 0;
		else if(empId>obj.empId)
			return 1;
		else
			return -1;
	}
	
	



}
