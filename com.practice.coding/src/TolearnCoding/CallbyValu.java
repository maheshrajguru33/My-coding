package TolearnCoding;

public class CallbyValu {
	int val=200;
	int operation(int val){
		this.val=val*10/100;
		return val;
	}
	public static void main(String[] args) {
		CallbyValu call=new CallbyValu();
		System.out.println("Befor calling function"+call.val);
		call.operation(234);
		System.out.println("After calling function"+call.val);
	}
}
