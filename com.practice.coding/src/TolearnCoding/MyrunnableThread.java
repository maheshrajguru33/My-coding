package TolearnCoding;

public class MyrunnableThread implements Runnable {
	public int myCount=0;
	public MyrunnableThread(){
	}
	@Override
	public void run() {
		while(myCount<=10)
			try{
				System.out.println(++myCount);
			}
			catch(Exception e)
		{
				
				System.out.println(e);
		}

	}
	public static void main(String[] args) {
		Thread t1=new Thread(new MyrunnableThread());
		Thread t2=new Thread(new MyrunnableThread());
		Thread t3=new Thread(new MyrunnableThread());
		t1.start();
		t2.start();
		t3.start();
	}

}