package TolearnCoding;

public class PolymorphismDemo {

	public void area(int b,int h){
		System.out.println("Area of Triangle:"+(1/2*b*h));
		
	}
	public void area(int r){
		System.out.println("Area of circle:-"+3.14*r*r);
	}
	public void area(float s){
		System.out.println("Area of Squar "+(s*s));
	}
	public static void main(String[] args) {
		PolymorphismDemo m=new PolymorphismDemo();
		m.area(12.03f);
		m.area(12,12);
		m.area(54);
	}
	
	
}
