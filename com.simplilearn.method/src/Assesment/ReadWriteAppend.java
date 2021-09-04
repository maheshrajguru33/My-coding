package Assesment;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadWriteAppend {
	public static void RWA()throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Pass the string to read write");
		String data=sc.nextLine();
		FileOutputStream out=new FileOutputStream("C:\\Users\\patil\\Desktop\\Mahi\\Stream1.txt");
		out.write(data.getBytes());
		out.close();
		
		System.out.println("Enter string for append data");
		String Apend=sc.nextLine();

		sc.close();
		
		Path path=Paths.get("C:\\Users\\patil\\Desktop\\Mahi\\Stream1.txt");
		
				Files.write(path, data.getBytes());
		
		List<String> lines=Arrays.asList(Apend);
		Files.write(Paths.get("C:\\Users\\patil\\Desktop\\Mahi\\Stream1.txt"), lines, StandardCharsets.UTF_8,
				StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		
		System.out.println("Reading added String");
		
		FileInputStream in=new FileInputStream("C:\\Users\\patil\\Desktop\\Mahi\\Stream1.txt");
		int x=0;
		while((x=in.read())!=-1)
			System.out.print((char)x);
			
		in.close();
		}
	
		
	public static void main(String[] args)throws IOException {
		RWA();
	}
}
	