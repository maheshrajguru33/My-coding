package HandlingFile;
import java.io.File;

public class CheckPath {
	public static void main(String[] args) {
		File file=new File("E:\\File\\abc.txt");
		//File f2=new File("abc.txt");
		
		String abpath=file.getAbsolutePath();
		System.out.println(abpath);
		
		File f3=file.getAbsoluteFile();
		System.out.println(f3);
		
		
	}

}
   