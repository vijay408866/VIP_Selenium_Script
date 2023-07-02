package JAVA;
public class ReversStringin3ways2 {
	public static void main(String[] args) {
		//1.program
		String str="We are berojgar";
		String newStr="";
		for (int i = 0; i < str.length(); i++) {
			newStr=str.charAt(i)+newStr;
			// ragjoreb era eW
		}
		System.out.println(newStr);
		//2.program
		String newStr1="";
		String[] strArr=str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			String st=strArr[i]; 
			String s="";
			for (int j=0;j<st.length();j++) {
				s=st.charAt(j)+s;			 
			}//eW era ragjoreb 
			newStr1=newStr1+s+" ";
		}
		System.out.println(newStr1);
		//3.program
		String newStr2="";
		String[] strArr1=str.split(" ");
		for (int i = 0; i < strArr1.length; i++) {
			newStr2=strArr1[i]+" "+newStr2;			
		}
		System.out.println(newStr2);
		//berojgar are We
	}
}