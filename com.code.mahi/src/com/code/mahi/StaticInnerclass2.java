package com.code.mahi;

public class StaticInnerclass2 {
	private static String msg="Welcome to Simplilearn";
	
	static class Inner{
		void hello()
		{
			System.out.println(msg);
			
		}
	}
	public static void main(String[] args) {
		//StaticInnerclass2 obj=new StaticInnerclass2();
		StaticInnerclass2.Inner obj=new StaticInnerclass2.Inner();
		obj.hello();
	}
}
