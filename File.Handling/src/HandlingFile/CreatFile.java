package HandlingFile;
import java.io.File;
import java.io.IOException;

public class CreatFile {
	public static void main(String[] args) {
		File file=new File("cbd.txt");
	
		System.out.println(file.exists());
		try{
			System.out.println(file.createNewFile());
		}
		catch(IOException e){
			System.out.println(e);
		}
		String jkl=file.getAbsolutePath();
		System.out.println(jkl);
		
		File f2=file.getAbsoluteFile();
		System.out.println(f2);
		
	}

}
   