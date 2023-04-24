package arraystudy;

public class arrayInitializtion {
public static void main(String[] args) {
int[]x= {1,2,3,4,5};
      // 0 1 2 3 4 index value
for(int i=0;i<x.length;i++) {
System.out.println(x.clone()[i]);
}
// or
//rivers order
for(int i=x.length-1;i>=0;i--) {
System.out.println(x.clone()[i]);

}
}
}
