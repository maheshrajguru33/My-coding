package com.Session5;

import java.util.Scanner;
public class CustomException {
	public static void main(String[] args)throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		//Throw keyword is used to throw the error
		if(age<18)
		{
			throw new MyException("age is not valid");
		}
		else
		{
			
			System.out.println("you can vote");
		}
	}

}