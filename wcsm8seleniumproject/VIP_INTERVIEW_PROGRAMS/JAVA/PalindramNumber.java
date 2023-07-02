package JAVA;

public class PalindramNumber {
	public static void main(String[] args) {
		int num=121;
		String str="";
		int temp=num;
		while (num!=0) {
			int rem=num%10;
			str=str+rem;
			num=num/10;
		}
		int a=Integer.parseInt(str);
		if (a==temp) {
			System.out.println("palindram");
		}
		else
		{
		System.out.println("not");
		}
	}
}
