package JAVA;

import java.util.Iterator;

public class Prime1to100Number3 {
	public static void main(String[] args) {
       int count=0;
		for (int i = 1; i < 100; i++) {
			count=0;
			for (int j = 1; j < 100; j++) {
				if (i%j==0) {
					count++;
			}
		}
		if (count==2) {
			System.out.print(i+" ");
		}
			
		}
	}

}
