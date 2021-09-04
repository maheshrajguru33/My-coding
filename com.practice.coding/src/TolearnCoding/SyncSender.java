package TolearnCoding;

public class SyncSender {
	public void send(String msg){
		System.out.println("String \t"+ msg);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println(msg+"  Sent successfully");
	}

}
