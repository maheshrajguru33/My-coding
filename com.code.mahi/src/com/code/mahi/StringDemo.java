package com.code.mahi;
import java.util.Scanner;
public class StringDemo {

	public static void main(String[] args) {
		String s1=new String("Hello");
		
		System.out.println("Length of string "+s1.length());
		String s2="Gollo";
		System.out.println(s1==s2);
		
		System.out.println("Compare String "+s1.compareTo(s2));
		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(3));
		System.out.println(sub.substring(5,7));
		
		//Cehck string is Empty
		String s3="";
		System.out.println("Check string is empty or not:==> "+s3.isEmpty());
		
		//To uppercase and Lowercase
		System.out.println("to Uppercase: "+s1.toUpperCase());
		System.out.println("to Lowercase: "+s1.toLowerCase());
		
		//trim
		String s4="          MaheShu          ";
		System.out.println("string length without trim "+s4.length());
		String s5=s4.trim();
		System.out.println("String after trim "+s5.length());
		
		//Replace
		String s6="Welcome to simplilearn";
		String s7=s6.replace("simplilearn", "Java");
		System.out.println("Befor Replace "+s6);
		System.out.println("After Replace "+s7);
		
		
		
		
		
	}

}
