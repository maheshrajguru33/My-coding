package HandlingFile;


public class RecursionDemo {
	int sum(int b){
		if(b>0){
			return b+sum(b-1);
		}
		else
		{
			return 0;
		}
	}
		public static void main(String[] args) {
			RecursionDemo r=new RecursionDemo();
		int a=r.sum(3);
			System.out.println("The Sum of N numbers of Natural numbers"+" "+a);
		}
		
	}


