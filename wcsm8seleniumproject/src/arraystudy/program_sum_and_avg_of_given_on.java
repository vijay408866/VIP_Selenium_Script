package arraystudy;

public class program_sum_and_avg_of_given_on {
public static void main(String[] args) {
int [] subject= {5,6,7,8,9};
int sum=0;
for(int index=0;index<subject.length;index++) {
sum=sum+subject[index];
}
System.out.println("sum of the given number"+sum);

double avg=sum/subject.length;

System.out.println("avrege of the given number "+avg);
}
}
