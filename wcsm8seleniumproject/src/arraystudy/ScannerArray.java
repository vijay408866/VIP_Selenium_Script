
package arraystudy;

import java.util.Scanner;

public class ScannerArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch;
		ch = new char[5];
		System.out.println("enter value");
		for (int index = 0; index <= ch.length - 1; index++) {
			ch[index] = sc.next().charAt(0);
		}
		for (int index = 0; index <= ch.length - 1; index++) {
			System.out.println(ch[index]);
		}
	}

}
