package com.Session5;

public class ExceArray {
	public static void main(String[] args) {
		
			int a[]=new int[3];
			int x=10;
			try{
				for(int i=0;i<7;i++){
				a[i]=x;
				x=x+10;
				}
				
				
			}
				catch (Exception e)
				{
					for(int num:a){
						System.out.println(num);
					}
					System.out.println(e);
					
					
				}
			}
		
	}


