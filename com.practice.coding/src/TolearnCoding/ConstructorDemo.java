package TolearnCoding;

public class ConstructorDemo {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.rollno=30;
		s1.name="sakshi";
		s1.name="lonikand";
		Student s2=new Student();
		s2.name="shree";
		s2.address="nimgav";
		s2.rollno=33;
		s1.display();
		s2.display();
	}

}