package com.FilesinJava;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile2 {
	public static void CreatFileUsingFileClass()throws IOException{
		File file=new File("C:\\Users\\patil\\Desktop\\Mahi\\Shree.txt");
		
		if(file.createNewFile()){
			System.out.println("File Created");
		}
		else{
			System.out.println("file Allready exists");
		}
		
		//Write some content
		FileWriter write=new FileWriter(file);
		write.write("The java programing is the very exciting thing which I love to do");
		write.close();
	}
	public static void main(String[] args)throws IOException{
		CreatFileUsingFileClass();
	}

}
