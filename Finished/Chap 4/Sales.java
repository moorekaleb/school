/*
ask for sales
while(counter<10)
	get sales from user
	if(largest<number)
		largest = number
	increase counter
display largest number
*/
import java.util.Scanner;

public class Sales{
	public static void main(String[] args){
		int counter = 0;
		int number;
		int largest = 0;
		
		System.out.println("Please enter the 10 contestants sales amount:");
		
		Scanner input = new Scanner(System.in);
		
		while(counter<10){
			number = input.nextInt();
			if(number>largest)
				largest = number;
			counter+= 1;
			
		}
		System.out.println("The largest sale amount is: "+largest);
	}
}