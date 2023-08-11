import java.util.Scanner;

public class Arithmetic 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		
		int number1;
		int number2;
		int sum;
		int product;
		int difference;
		int quotient;
		
		System.out.println("Please input an integer.");
		
		number1 = input.nextInt();
		
		System.out.println("Please input a second integer.");
		
		number2 = input.nextInt();
		
		sum = number1 + number2;
		product = number1 * number2;
		difference = number1 - number2;
		quotient = number1 / number2;
		
		System.out.printf("your sum=%d%n product=%d%n difference=%d%n quotient=%d%n", sum, product, difference, quotient);
		
	}
	
}