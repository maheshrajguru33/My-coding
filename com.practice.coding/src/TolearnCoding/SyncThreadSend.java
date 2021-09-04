package TolearnCoding;

public class SyncThreadSend extends Thread{
	private String msg;
	SyncSender sender;
	
	public SyncThreadSend(SyncSender sender,String msg){
		this.sender=sender;
		this.msg=msg;
	}
	
	public void run(){
		synchronized (sender){
			sender.send(msg);
		}
	}
	

}
