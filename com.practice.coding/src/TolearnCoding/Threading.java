package TolearnCoding;

public class Threading extends Thread {
	int a=12,b=14,c=0; 
	public void run(){
		c=a+b;
		System.out.println("addition is :"+c);
		
	}
	public static void main(String[] args) {
		Threading t=new Threading();
		t.start();
		
	}

}
