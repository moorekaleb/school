
 class Rethrowing
{
	public static void main(String args[])
	{
		int a = 0;
		
		try
		{


			Rethrowing ob=new Rethrowing();

			int cat=ob.someMethod();

			if(a>50)
				throw ( new ArithmeticException("\n The number is greater than 50"));

		System.out.println("no is less then 50  ="+a);
		}

		catch(ArithmeticException e)
		{
			System.out.println("Error found"+e.getMessage());
			e.printStackTrace();
			StackTraceElement[] traceElements = e.getStackTrace();
			

		}
		
		finally
		{
			System.out.println();
			System.out.println("Done");
		}
	}

	int someMethod()throws ArithmeticException
	{
		Rethrowing ob1=new Rethrowing();

		int a=12,b=0;

		int c=ob1.someMethod2(a,b);

		return c;
	}

	int someMethod2(int a,int b)
	{ 
		int c1=a/b;

		return c1;
	}
}