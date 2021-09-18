package HandlingFile;
import java.io.File;
import java.io.IOException;
public class RenameFile {
	public static void main(String[] args)throws IOException{
		File file=new File("Volvo.doc");
		
		System.out.println(file.createNewFile());
		
		File f2=new File("VolvoBus.doc");
		
		System.out.println(file.renameTo(f2));
		
		File f3=new File("Sumo.xlsx");
		System.out.println(f3.createNewFile());
		
		File f4=new File("BMW\\Mercides\\Tata Sumo.xlsx");
		System.out.println(f3.renameTo(f4));
		
		
		
	}

}
