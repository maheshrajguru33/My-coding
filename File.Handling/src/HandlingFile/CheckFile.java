package HandlingFile;
import java.io.File;

public class CheckFile {
	public static void main(String[] args) {
		File file=new File("E:\\File\\abc.txt");
		File f1=new File("E:\\File\\mahi");
		File f2=new File("E:\\File\\bcd.doc");
		
		System.out.println(file.exists());
		System.out.println(f1.isDirectory());
		System.out.println(f2.isFile());
		
	}

}
  