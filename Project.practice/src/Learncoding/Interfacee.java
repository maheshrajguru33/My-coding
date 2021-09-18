package Learncoding;
import java.util.Scanner;
interface client{
	void input();
	void output();
}

class Interfacee implements client{
	String name; double salary;
	Scanner sc=new Scanner(System.in);
	public void input(){
		System.out.println("Enter Employee Name");
		name=sc.nextLine();
		
		System.out.println("Enter salary of Employee");
		salary=sc.nextDouble();
		
	}
	public void output(){
		System.out.println(name+"  "+salary);
	}
	public static void main(String[] args) {
		
	
		client c=new Interfacee();
		c.input(); c.output();
	}
	
	

}
