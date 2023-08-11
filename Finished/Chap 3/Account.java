
public class SavingsAccount
{   
   private static double annualInterestRate; // instance variable 
   private double savingssavingsBalance; // instance variable 

   // Account constructor that receives two parameters  
   public Account(double annualInterestRate, double savingsBalance) 
   {
      this.annualInterestRate = annualInterestRate; // assign annualInterestRate to instance variable annualInterestRate

      // validate that the savingsBalance is greater than 0.0; if it's not,
      // instance variable savingsBalance keeps its default initial value of 0.0
      if (savingsBalance > 0.0) // if the savingsBalance is valid
         this.savingsBalance = savingsBalance; // assign it to instance variable savingsBalance
   }

   // method that deposits (adds) only a valid amount to the savingsBalance
   public void deposit(double depositAmount) 
   {      
      if (depositAmount > 0.0) // if the depositAmount is valid
         savingsBalance = savingsBalance + depositAmount; // add it to the savingsBalance 
   }
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount>savingsBalance){
			System.out.println("Withdrawal amount exceeded account savingsBalance.");
		}
		if (withdrawAmount*-1>0.0){
			savingsBalance = savingsBalance - withdrawAmount;
		}
		
	}
   // method returns the account savingsBalance
   public double getsavingsBalance()
   {
      return savingsBalance; 
   } 

   // method that sets the annualInterestRate
   public void setannualInterestRate(double annualInterestRate)
   {
      this.annualInterestRate = annualInterestRate; 
   } 

   // method that returns the annualInterestRate
   public double getannualInterestRate()
   {
      return annualInterestRate; 
   } 
} // end class Account

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
