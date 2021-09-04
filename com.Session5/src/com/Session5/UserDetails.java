package com.Session5;

public class UserDetails {
	void checkName(String name)throws MyException{
		if(name.charAt(0)=='@'){
			throw new MyException("Name can not start with @");
		}
		else{
			System.out.println("Valid name");
		}
	}
	
	public static void main(String[] args) {
		String name1="mahesh raj";
		String name2="@mahesh raj";
		
		UserDetails u=new UserDetails();
		try{
		u.checkName(name1);
		//u.checkName(name2);
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}
	

}
