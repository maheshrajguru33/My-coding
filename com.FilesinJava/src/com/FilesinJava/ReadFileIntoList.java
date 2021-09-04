package com.FilesinJava;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
public class ReadFileIntoList {

	public static List<String> readFile(String file)throws IOException{
		
		List<String> lines=Collections.emptyList();
		try {
			lines=Files.readAllLines(Paths.get(file),StandardCharsets.UTF_8);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return lines;
	}
	
	public static void main(String[] args)throws IOException {
		List<String> result=readFile("C:\\Users\\patil\\Desktop\\Mahi\\Stream1.txt");
		//System.out.println(result);
		
		Iterator<String> iterator=result.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}


