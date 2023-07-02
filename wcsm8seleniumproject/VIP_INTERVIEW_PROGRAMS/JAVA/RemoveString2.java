package JAVA;

public class RemoveString2 {
	public static void main(String[] args) {
		String str="25fAd52sB5gC6";
		String upper="";
		String numbers="";
		String characters="";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				upper=upper+str.charAt(i);
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				numbers=numbers+str.charAt(i);
			}
			else
			{
				characters=characters+str.charAt(i);
			}
		}
		System.out.println(upper);
		System.out.println(numbers);
		System.out.println(characters);
	}
	
}

