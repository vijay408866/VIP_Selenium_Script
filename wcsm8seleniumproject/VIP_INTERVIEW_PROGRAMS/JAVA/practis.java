package JAVA;

public class practis {
	public static void main(String[] args) {
    String str="abcdABCD1234";
	String Digit="";
	String uppercase="";
	String charecters="";
	for (int i = 0; i < str.length(); i++) {
		if (Character.isUpperCase(str.charAt(i))) {
			uppercase=uppercase+str.charAt(i);
		}
		else if (Character.isDigit(str.charAt(i))) {
			Digit=Digit+str.charAt(i);
		}
		else {
			charecters=charecters+str.charAt(i);
	    
		}
	}
	System.out.println(Digit);
	System.out.println(uppercase);
	System.out.println(charecters);
	}

}
