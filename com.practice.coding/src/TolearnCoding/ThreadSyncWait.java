package TolearnCoding;

public class ThreadSyncWait {
	private static Object LOCK=new Object();
	public static void main(String[] args)throws InterruptedException {
		Thread.sleep(1000);
		
		System.out.println("Thread "+Thread.currentThread().getName()+" is woke up after 1 second of sleep");
		
		synchronized (LOCK) {
			
			LOCK.wait(2000);
			System.out.println("Object"+LOCK+"is woke up after 2 second of wait" );
		}
		
	}

}
