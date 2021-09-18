package HandlingFile;
import java.io.File;
public class RecursionforDelete {
	public static void main(String[] args) {
		File file=new File("abcd");
		System.out.println(file.exists());
		System.out.println(file.delete());
		System.out.println(file.exists());
	}

}
