import java.util.Scanner;
public class CompareStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to compare:");
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        System.out.println("Enter the starting index of comparison:");
        int start = sc.nextInt();
        System.out.println("Enter the number of characters to be compared:");
        int number = sc.nextInt();
        if(s1.regionMatches(start, s2, start, number))
       	   System.out.printf("%d characters starting from index %d match.\n", number, start);
			if(s1.equalsIgnoreCase(s2))
				System.out.println("The Strings are equal if Case is ignored.");
        else
            System.out.printf("%d characters starting from index %d do not match.", number, start);
    }
}