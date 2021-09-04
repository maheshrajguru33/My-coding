package TolearnCoding;

public class SyncMain {
	public static void main(String[] args) {
//common sender object
		SyncSender send=new SyncSender();
		
		SyncThreadSend s1=new SyncThreadSend(send,"Hello");
		SyncThreadSend s2=new SyncThreadSend(send, "Good Morning");
		
		s1.start();
		s2.start();
	}

}
