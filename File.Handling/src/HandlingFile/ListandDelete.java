package HandlingFile;
import java.io.File;
public class ListandDelete {
	public static void main(String[] args) {
		File file=new File("Apple");
		
		String [] arr=file.list();
		
		for(String tmp:arr){
			System.out.println(tmp);
		}
		
		File f2=new File("Apple\\steve Jobs\\ram.txt");
		System.out.println(f2.exists());
		System.out.println(f2.delete());
		 
	}

}
