import java.util.Scanner; 

public class InvoiceTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter amount to buy:");
		int itemAmount = input.nextInt();
		
		Invoice invoice1 = new Invoice("213","Toy Car",itemAmount,2.10);
		
		System.out.printf("%nInvoice amount: %.2f",invoice1.getInvoiceAmount());
	}
	
}