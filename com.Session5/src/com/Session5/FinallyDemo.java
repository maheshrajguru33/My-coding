package com.Session5;
import java.util.Scanner;
public class FinallyDemo {
	public static void main(String[] args) {
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		try{
			result=num1/num2;
			System.out.println("Devision is: "+result);
			
		}
		catch(Exception e)
		{
			System.out.println("Can't devide by zero");
		}
		finally{
			sc.close();
			System.out.println("Connection close");
		}
		
	}

}
