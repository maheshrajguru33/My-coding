package HandlingFile;
import java.io.File;
public class CreatingFolder {
	public static void main(String[] args) {
//		File file=new File("Apple");
//		
//		System.out.println(file.exists());
//		
//		System.out.println(file.mkdir());
//		 
//		System.out.println(file.exists());
		
		File f2=new File("BMW\\Mercides");
		
		System.out.println(f2.exists());
		System.out.println(f2.mkdirs());
		System.out.println(f2.exists());
	
	}
	

}