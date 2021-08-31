package TolearnCoding;
import java.util.Scanner;
public class TryCatch {
	public static void main(String[] args) {
		float
		a,b;float c;
		System.out.println("Enter two numbers");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		
		try{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Can not devide by zero");
			
		}
	}

}
