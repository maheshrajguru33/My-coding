package Assesment;

import java.util.Scanner;

public class Calculator
	{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		float a,b,c,selection;
		System.out.println("Please enter any two numbers:");
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("make you selection");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplication");
	
		selection=scan.nextInt();

		if(selection==1){
		c=a+b;
		System.out.println("Addition is "+c);
		}
		else if(selection==2){
		c=a-b;
		System.out.println("Substraction is "+c);
		}
		else if(selection==3){
			try{
		c=a/b;
		System.out.println("Division is "+c);
		}
			catch (Exception e){
				System.out.println("Can not devide by zero");
			}
		}	
		else if(selection==4){
		c=a*b;
		System.out.println("Multiplication is "+c);			
		}
		else
		{
		System.out.println("you choosen wrong option");
		}

	}

}
	
