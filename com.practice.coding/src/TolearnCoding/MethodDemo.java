package TolearnCoding;

public class MethodDemo {
	public void print(){
		System.out.println("Hello Mahi");
		
	}
	public int cube(int n){
		int result=n*n*n;
		return result;
	}
	public static void main(String[] args) {
		MethodDemo obj=new MethodDemo();
		obj.print();
		
		System.out.println("cube of 7: "+obj.cube(6));
	}
}
