package TolearnCoding;
import java.util.Scanner;
public class MethodExecution {
	public int multiply(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		MethodExecution m=new MethodExecution();
		System.out.println("multiplication"+m.multiply(15,20));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num");
		int num1=sc.nextInt();
		System.out.println("Enter second num");
		int num2=sc.nextInt();
		
			System.out.println("Multiplication is "+m.multiply(num1, num2));
	}

}
