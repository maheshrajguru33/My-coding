package HandlingFile;
import java.util.Scanner;

public class FactProg {
	public static void main(String[] args) {
		int i,n,f=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number to find Factorial:==>");
		n=s.nextInt();
		for(i=1;i<=n;i++){
			f=f*i;
		}
		System.out.println(f);
		
	}

}