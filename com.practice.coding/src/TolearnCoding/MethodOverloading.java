package TolearnCoding;
//Method overloading /compiltime polymorphisam/static polymorphism/early binding
public class MethodOverloading {
	public void area(int a, int b)
	{
		System.out.println("area of Triangle"+(0.5*a*b));
	}
	public void area(int r)
	{
		System.out.println("are of circle"+(3.14*r*r));
	}
	public void area (float s)
	{
		System.out.println("area of Squar"+(s*s));
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.area(80.2f);
		m.area(15);
		m.area(12,15);
	}

}
