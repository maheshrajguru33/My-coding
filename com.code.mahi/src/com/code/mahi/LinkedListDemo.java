package com.code.mahi;

import java.util.LinkedList;

public class LinkedListDemo {
	
		public static void main(String[] args) {
			LinkedList<Double> List=new LinkedList<>();
			List.add(10.0);
			List.add(20.0);
			List.add(30.2);
			List.add(10.0);
			List.add(50.365289);
			List.add(20.2325);
			List.add(2, 50.36);
			//List.remove(2);
			System.out.println(List);
			System.out.println(List.contains(10.0));
			
			//enhanced for loop
			for(double x:List)
				System.out.println(" "+x);
			
		}

}
