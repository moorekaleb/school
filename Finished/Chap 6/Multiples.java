import java.util.Scanner;

public class Multiples 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of multiple pairs: ");
		int number = input.nextInt();
		
		for(int counter = 1; counter<=number; counter++)
		{
			System.out.println("Please enter the base number: ");
			int first = input.nextInt();
			
			System.out.println("Please enter the questioned multiple: ");
			int second = input.nextInt();
			
			boolean result = isMultiple(first, second);
			if(result==true)
				System.out.printf("%d is a multiple of %d %n", second, first);
			else 
				System.out.printf("%d is not a multiple of %d %n", second, first);
		}
		
	}
	public static boolean isMultiple(int first, int second)
	{
		boolean fact = false;
		
		if(second%first==0)
		{
			fact = true;
		}
		return fact;
	}
}