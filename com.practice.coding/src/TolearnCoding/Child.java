package TolearnCoding;

public class Child extends Parent {
	public Child(){
		//super();
		System.out.println("Child class Constructor");
	}
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.str);
		c.print();
		//System.out.println(c.msg);
	}

}