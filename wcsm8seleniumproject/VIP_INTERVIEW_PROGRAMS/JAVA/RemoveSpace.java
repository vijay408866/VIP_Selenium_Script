package JAVA;

public class RemoveSpace {
	public static void main(String[] args) {
		RemoveSpace("   v    i   j  a   y   ");
	}
	public static void RemoveSpace(String str) {
		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				System.out.print(ch);
			}
		}

	}

}
