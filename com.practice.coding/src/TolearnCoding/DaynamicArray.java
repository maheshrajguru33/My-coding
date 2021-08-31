package TolearnCoding;

import java.util.Scanner;

public class DaynamicArray {

	public static void main(String[] args) {
		int size,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		size=s.nextInt();
		int a[]=new int[size];
		
		for(i=0;i<size;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Printed array elements "); 
		for(i=0;i<size;i++){
			System.out.println(a[i]+" ");
			
		}
		
	}
}
