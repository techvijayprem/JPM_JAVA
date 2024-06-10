package exceptionExample;

public class exception_2 {
	
	public static void main(String [] args)
	{
	int a,b,result;
	a = 12;
	
	try
	{
		int[] arr = {2,3,5,0,7,9};
		
		for(int i : arr )
		{
			result = a/arr[i];
		}
		
		int result1 = a/arr[6];
	}
	
	catch(ArithmeticException e1)
	{
		System.out.print(e1.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException ar)
	{
		System.out.print(ar.getMessage());
	}
	catch(Exception e)
	{
		System.out.print("Not be zero");

	}

}
}
