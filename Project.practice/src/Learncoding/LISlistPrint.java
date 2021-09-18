package Learncoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LISlistPrint {
	
	public void LIS(int []arr){
        
	       {
	      
	        if (arr == null || arr.length == 0) {
	            return;
	              
	        }
	 
	        List<List<Integer>> LIS = new ArrayList<>();
	        for (int i = 0; i < arr.length; i++) {
	            LIS.add(new ArrayList<>());
	        }
	 
	        
	        LIS.get(0).add(arr[0]);
	 
	        for (int i = 1; i < arr.length; i++)
	        { 
	            for (int j = 0; j < i; j++)
	            {
	                if (arr[j] < arr[i] && LIS.get(j).size() > LIS.get(i).size()) {
	                    LIS.set(i, new ArrayList<>(LIS.get(j)));
	                }
	            }
	 
	            LIS.get(i).add(arr[i]);
	        }
	        int j = 0;
	        for (int i = 0; i < arr.length; i++)
	        {
	            if (LIS.get(j).size() < LIS.get(i).size()) {
	                j = i;
	        }
	    }
	 
	        System.out.print(LIS.get(j));
	    
	    }
	 }

 public static void main(String args[])
 {
 	Scanner sc=new Scanner(System.in);
 	System.out.println("Enter the size of array : ");
 	int size=sc.nextInt();
 	int arr[]=new int[size];
 	System.out.println("Enter the elements of list");
 	for(int i=0;i<size;i++)
 	{
 		arr[i]=sc.nextInt();	
 	}
 	
 	LISlistPrint ls=new LISlistPrint();
 	ls.LIS(arr);
     
      sc.close();
 }
}

