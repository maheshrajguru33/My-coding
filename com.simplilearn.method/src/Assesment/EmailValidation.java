package Assesment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String Arr;
        String regex = "[\\w]+@[\\w]+\\.[a-zA-Z]{2,3}";
	    Pattern pattern = Pattern.compile(regex);
        
        String emails[]= new String[10];
        emails[0]="simplilearn@gmail.com";
        emails[1]="manmohan123@gmail.com";
        emails[2]="amitshah@123.com";
        emails[3]="narendra123@yahoo.com";
        emails[4]="shardpawar@youtube.com";
        emails[5]="arvindkejriwal123@gmail.com";
        emails[6]="Amolkolhe123@yahoo.com";
        emails[7]="googlebhai123@gmail.com";
        emails[8]="Sanjayraut123@yahoo.com";
        emails[9]="nitingadkari123@gmail.com";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        Arr = sc.nextLine();
        Matcher ma = pattern.matcher((CharSequence)Arr);
        System.out.println(Arr+ " : " + ma.matches());
        
        for (int i=0;i<emails.length;i++) {
        	if(Arr.equals(emails[i])){
        	
           	  System.out.println("Congratulations it's matched and Valid Email You are Logged in");
           	  	break;
        	}
        	
        	else
        	  
        	     System.out.println("Invalid Email please try again");
               }
        	 
          
       }
	
}
      



