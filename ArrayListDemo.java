package com.code.mahi;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> List=new ArrayList<>();
		List.add(10);
		List.add(20);
		List.add(30);
		List.add(10);
		List.add(50);
		List.add(20);
		System.out.println(List);
		
		//enhanced for loop
		for(int x:List)
			System.out.print(" "+x);
	}

}
