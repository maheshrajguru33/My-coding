package com.code.mahi;

public class Innerclass {
	private String msg="Welcome to Simplilearn";
	private int getCube(int x){
		return x*x*x;
	}
	class Inner{
		void hello()
		{
			System.out.println(msg);
			System.out.println("cube of 9: "+getCube(9));
			
		}
	}
	public static void main(String[] args) {
		Innerclass obj=new Innerclass();
		Innerclass.Inner inner=obj.new Inner();
		inner.hello();
	}
}
