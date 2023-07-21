package JAVA;
public class ReversStringin3ways2 {
	public static void main(String[] args) {
		// program 1//
		
		String str = "vijay is silent";
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			st = str.charAt(i) + st;
		}
		System.out.println(st);                // tnelis si yajiv  //
		// program 2//

		String st1 = "";
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			st1 = strArr[i] + " " + st1;
		}
		System.out.println(st1);                 // silent is vijay  //
		// program 3//
		
		String st2="";
		String[]strArry=str.split(" ");
		for (int i = 0; i < strArry.length; i++) {
			String st3=strArry[i];
			String s="";
			for (int j = 0; j < st3.length(); j++) {
				s=st3.charAt(j)+s;
			}
			st2=st2+s+" ";
		}
		System.out.println(st2);                  // yajiv si tnelis  //
	}                                                   
}