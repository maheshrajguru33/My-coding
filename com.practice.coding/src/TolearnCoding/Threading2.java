package TolearnCoding;

public class Threading2 implements Runnable {
	int a=12,b=14,c=0; 
	public void run(){
		c=a+b;
		System.out.println("addition is :"+c);
		
	}
	public static void main(String[] args) {
		Runnable r=new Threading2();
		Thread t=new Thread(r);
		t.start();
		
	}

}
