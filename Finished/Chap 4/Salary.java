/*	ask how many employees there are
	while(counter<employees)
	  ask for name wages and hours
	  if(hours<40)
		  gross=hours*wages
	  else
		  over_time=(hours - 40) / 2;
		  gross= (hours - over_time) * wages;
	  print("name pay is gross")
*/
import java.util.Scanner;

public class Salary{
	public static void main(String[] args){
		
		int counter = 0;
		int employees;
		double gross;
		double over_time;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of employees: ");
		
		employees = input.nextInt();
		
		while(counter<employees){
			System.out.println("Enter first name of employee:");
			String first_name = input.next();
			
			System.out.println("Enter last name of employee:");
			String last_name = input.next();
			
			System.out.println("Enter the amount of hours worked:");
			double hours = input.nextDouble();
			
			System.out.println("Enter the wage:");
			double wages = input.nextDouble();
			
			if(hours<=40){
				gross = hours * wages;
				System.out.printf("%s %s gross income is %.2f%n",first_name,
					last_name,gross);
			}
			else{
				over_time=(hours - 40) / 2;
				gross= (hours - over_time) * wages;
				System.out.printf("%s %s gross income is %.2f%n",first_name,
					last_name,gross);
			}
			counter+= 1;
		}
			
	}
	
}