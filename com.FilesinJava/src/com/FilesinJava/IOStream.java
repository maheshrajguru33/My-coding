package com.FilesinJava;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class IOStream {
	public static void InputOutput()throws IOException{
		String data="Hello Good Afternoon";
		FileOutputStream out=new FileOutputStream("C:\\Users\\patil\\Desktop\\Mahi\\Stream.txt");
		out.write(data.getBytes());
		System.out.println("Data added");
		out.close();
		
		FileInputStream in=new FileInputStream("C:\\Users\\patil\\Desktop\\Mahi\\Stream.txt");
		int x=0;
		while((x=in.read())!=-1)
			System.out.print((char)x);
		}
		
	
	public static void main(String[] args)throws IOException {
		InputOutput();
		
	}

}