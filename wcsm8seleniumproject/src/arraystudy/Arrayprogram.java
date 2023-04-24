package arraystudy;

public class Arrayprogram {
public static double[] product(int [] a) {
double[]pro=new double[2];
pro[0]=a[0]*a[1];
pro[1]=a[2]*a[3];
return pro;
}
public static void main(String[] args) {
int[]x=new int[4];
x[0]=24;
x[1]=35;
x[2]=40;
x[3]=33;
double[] d=product(x);
System.out.println(d[0]);
System.out.println(d[1]);
}

}
