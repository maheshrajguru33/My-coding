package com.code.mahi;
import java.util.Scanner;
public class SingalDimeArray {
	public static void main(String[] args) {
		int a[]={10,20,30,40,50,60,70};
		System.out.println("Lenght of an Array :"+a.length);
		System.out.println("Element on Index 5: "+a[5]);
		
		//Printing all element using array
		System.out.println("Using for loop");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println("Using for each loop");
		for(int element:a)
			System.out.println(element);
		//creating array object using new
		String b[]=new String[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter Name");
			b[i]=sc.next();
		}
		System.out.println("Printing Array element");
		for(String element:b)
			System.out.println("pringting in Upercase :"+element.toUpperCase());
	}

}

