package Learncoding;
import java.util.*;
public class ArrList {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		ArrayList<Integer> lk=new ArrayList<Integer>();
		
		li.add(5);
		li.add(63);
		li.add(8);
		li.add(10);
		li.add(11);
		li.add(12);
		li.add(5, 19);
		
		lk.add(120);
		lk.add(110);
		lk.add(150);
		lk.add(140);
		lk.add(130);
		lk.add(150);
		lk.add(140);
		//lk.clone();
		System.out.println(lk.size());
//		for(int i=0;i<lk.size();i++){
//			System.out.print(lk.get(i));
//			System.out.print(" ,");
//		}
		//lk.clone();
//		System.out.println(lk);
//		System.out.println(li);
		
//		li.remove(6);
//		System.out.println(li);
//		
//		System.out.println(li.contains(3));
//		System.out.println(li.contains(10));
//		System.out.println(li);
//		System.out.println(lk);
////		
//		li.addAll(0,lk);
//		System.out.println(li);
//		System.out.println(lk);
		
//		System.out.println(li.indexOf(10));
	//	System.out.println(lk.lastIndexOf(150));
//		System.out.println(lk.size());
	}

}
