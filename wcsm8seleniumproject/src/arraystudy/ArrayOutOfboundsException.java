package arraystudy;

public class ArrayOutOfboundsException {
public static void main(String[] args) {
int[] a= {9,8,7,6,5};
System.out.println(a[-1]);//java.lang.ArrayIndexOutOfBoundsException
System.out.println(a[1]);
System.out.println(a[2]);
}

}
