package Learncoding;

public class LambdaThread {
	public static void main(String[] args) {
	
	Runnable thread1=()->{
		for(int i=1;i<=10;i++){
			System.out.println("Value of I is"+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	};
	Thread t=new Thread(thread1);
	
	t.start();
	Runnable thread2=()->{
		for(int i=1;i<=10;i++){
			System.out.println("Table of 2"+" "+i*2);
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	};
	Thread t2=new Thread(thread2);
	t2.start();
	}
}
