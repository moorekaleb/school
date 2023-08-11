 import java.util.Scanner;
 
 class MainError
 {
	int a,b;

	void setData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	int getCal()
	{
		return (a/b);
	}
 }

 class SubError extends MainError

 {
	int a,b,c;

	void setData(int a,int b,int c)
	{
		this.a=a;

		this.b=b;

		this.c=c;
	}

	int getCal()
	{
		return ((a/b)*c);
	}
 }

 class ExceptionTest
 {
	public static void main(String args[])
	{
		try
		{
		MainError m=new MainError();

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer number: ");
		int a = input.nextInt();
		
		System.out.print("Please enter an integer number: ");
		int b = input.nextInt();
		
		m.setData(a,b);

		int op=m.getCal();

		System.out.println("The result is: "+op);

		SubError s=null;

		s.setData(12,2,2);

		int op1=s.getCal();

		System.out.println("The result is: "+op1);
		}

		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
 }