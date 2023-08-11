import java.util.Scanner;

public class Power
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the base number: ");
		int base = input.nextInt();
		
		System.out.println("Please enter the exponent number: ");
		int exponent = input.nextInt();
		
		int total = integerPower(base, exponent);
		
		System.out.println("Your answer is: "+total);
	}
	public static int integerPower(int base,int exponent)
	{
		int total = base;
		
		for(int counter = 1; counter<exponent; counter++)
		{
			if (exponent==1)
			{
				return base;
			}
			total *= base;
		}
		return total;
	}
}