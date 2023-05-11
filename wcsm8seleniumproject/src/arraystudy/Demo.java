package arraystudy;

import java.util.Iterator;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int arr[]= {0,20,3,50,60,42,90,50,20,0,40,50,8};
		
		int max=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (max<=arr[i]) 
			{
				max=arr[i]; 
			}
		}
		System.out.println(max);
		
		
//		int a=10;
//		Integer obj=Integer.valueOf(a);
//		System.out.println(a);
//		System.out.println(obj);
//		System.out.println();
//		
//		short b=10000;
//		Short obj1=Short.valueOf(b);
//		System.out.println(b);
//		System.out.println(obj1);
//		System.out.println();
//		
//		long c=12547;
//		Long obj2=Long.valueOf(c);
//		System.out.println(c);
//		System.out.println(obj2);
//		System.out.println();
//
//		byte d=122;
//		Byte obj3=Byte.valueOf(d);
//		System.out.println(d);
//		System.out.println(obj3);
//		System.out.println();
//		
//		float f=100.2f;
//		Float obj4=Float.valueOf(f);
//		System.out.println(f);
//		System.out.println(obj4);
//		System.out.println();
//		
//		double g=1025.22;
//		Double obj5=Double.valueOf(g);
//		System.out.println(g);
//		System.out.println(obj5);
//		System.out.println();
//		
//		char h='a';
//		Character obj6=Character.valueOf(h);
//		System.out.println(h);
//		System.out.println(obj6);
//		System.out.println();
//		
//		boolean i=true;
//		Boolean obj7=Boolean.valueOf(i);
//		System.out.println(i);
//		System.out.println(obj7);
//		System.out.println();
//		
//		
		
		
		
		
		

		
	}
}
