package com.code.mahi;

public class LocalMethodInnerclass {
	private String msg="Welcome to simplilearn";
		void display()
			{
		class Inner{
			void msg(){
				System.out.println(msg);
			}
		}
		
		//object can create inside the method
		Inner i=new Inner();
		i.msg();
	}
	public static void main(String[] args) {
		LocalMethodInnerclass m1=new LocalMethodInnerclass();
		m1.display();
		
	
				
	}
}
