package com.code.mahi;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo {
	public static void main(String[] args) {
		String pattern="[a-zA-Z]+";
		String check="Regular Expression";
		
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(check);
		
		while(m.find()){
			System.out.println(check.substring(m.start(), m.end()));
		}
	}

}
