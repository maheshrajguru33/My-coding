package com.Session5;

import java.util.Scanner;
public class ThrowDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		//Throw keyword is used to throw the error
		if(age<18)
		{
			throw new ArithmeticException ("age is not valid");
		}
		else
		{
			
			System.out.println("you can vote");
		}
	}

}