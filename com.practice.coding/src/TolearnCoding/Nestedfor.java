package TolearnCoding;

import java.util.Scanner;

public class Nestedfor {
	public static void main(String[] args) {
		int i,j,n,m;
		System.out.println("Please enter the value to print rows");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		System.out.println("Please enter the value to print columns");
		m=ref.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
