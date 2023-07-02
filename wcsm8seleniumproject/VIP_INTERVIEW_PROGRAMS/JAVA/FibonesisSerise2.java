package JAVA;

public class FibonesisSerise2 {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int num=0;
		System.out.print(n1+" "+n2);
		while (num<=10) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			num++;
		}
	}

}
