package arraystudy;

public class program_odd_even_by_using_advance_for_loop {
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5,6,7,8};
		
		//enhanced for loop
		System.out.println("even number is array");
		
		for(int value:a)
		{
		if(value%2==0)
		{
		System.out.println(value);
		}
		System.out.println("odd number is array");
		for (int value1:a)
		{
		if(value1%2!=0)
		System.out.println(value1);
		}
		}

}
}
