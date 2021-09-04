package com.Session5;

import java.util.ArrayList;

import java.util.Collections;

public class TestComparable {
	public static void main(String[] args) {
		Employee e1=new Employee(2003,"Mahesh Raj");
		Employee e2=new Employee(6301,"Shubhu Raj");
		Employee e3=new Employee(4009,"SaiRaj Raj");
		Employee e4=new Employee(10000,"Aishwarya");
		
		ArrayList<Employee> List=new ArrayList<>();
		List.add(e1);
		List.add(e2);
		List.add(e3);
		List.add(e4);
		System.out.println("Befor sort:"+List);
		Collections.sort(List);
		System.out.println("After sort:"+List);
	}

}
