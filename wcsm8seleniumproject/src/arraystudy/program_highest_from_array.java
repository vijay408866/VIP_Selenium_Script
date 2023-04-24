package arraystudy;

public class program_highest_from_array {
	public static void main(String[] args) {
		
	int[]x= {1,2,3,4,5};
	
	int max=x[0];
	
	for(int index=0;index<x.length;index++)
	{
	if(max<x[index])
	{
	max=x[index];
	}
	}
	System.out.println(max);
	}

}
