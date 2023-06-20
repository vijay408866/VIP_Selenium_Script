package JAVA;

public class ReversString {
	public static void main(String[] args) {
	int num=123456;
	String str=" ";
	while (num!=0) {
		int rem=num%10;
		str=str+rem;
		num=num/10;
	}
	System.out.println(str);
	}

}
