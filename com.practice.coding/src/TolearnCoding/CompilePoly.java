package TolearnCoding;

public class CompilePoly {
	double c;
	void add(){
		int a=20,b=50;
		c=a+b;
		System.out.println(c);
	}
	void add(int x,int y){
		c=x+y;
		System.out.println(c);
	}
	void add(int x,double y){
		c=x+y;
		System.out.println(c);
	}
	public static void main(String[] args) {
		CompilePoly r=new CompilePoly();
		r.add();
		r.add(100,500);
		r.add(152,52.25);
	}
}

