import java.util.Scanner;
import java.lang.String;

public class Find
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string you wish to count: ");
		String sentence = scanner.nextLine();
		int count = 0;
		System.out.println("Please enter the item to count: ");
		String toFind = scanner.next();
		for(int i=0;i<sentence.length();i++)
		{
			int index = sentence.indexOf(toFind,i);
			if(index>=0)
			{
				count++;
				i= index;
			}
		}
		System.out.print("The amount of this symbol found is: ");
		System.out.println(count);
	}
}