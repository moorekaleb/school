public class BasePlusCommissionEmployee
{
	private CommissionEmployee E;
	private double baseSalary;
	public BasePlusCommissionEmployee(String firstName, String lastName,
		String socialSecurityNumber, double grossSales, double commissionRate,
		double baseSalary)
		{
			try
			{
				E = new CommissionEmployee(firstName, lastName, socialSecurityNumber, 
					grossSales, commissionRate);
			}
			catch(IllegalArgumentException e)
			{
				System.out.printf("Illegal Argument Error: %s", e.getMessage());
			}
			if(baseSalary < 0.0)
				throw new IllegalArgumentException("Base salary must be >= 0.0");
			this.baseSalary = baseSalary;
		}
		public void setBaseSalary()
		{
			if(baseSalary < 0.0)
				throw new IllegalArgumentException("Base salary must be >= 0.0");
			this.baseSalary = baseSalary;
		}
		public double getBaseSalary()
		{
			return baseSalary;
		}
		public String getFirstName()
		{
			return E.getFirstName();
		}
		public String getLastName()
		{
			return E.getLastName();
		}
		 public String getSocialSecurityNumber()
		{
			return E.getSocialSecurityNumber();
		}
		public void setGrossSales(double grossSales)
		{
			E.setGrossSales(grossSales);
		}
		public double getGrossSales()
		{
			return E.getGrossSales();
		}
		public void setCommissionRate()
		{
			E.setCommissionRate();
		}
		public double getCommissionRate()
		{
			return E.getCommissionRate();
		}
		public double earnings()
		{
			return getBaseSalary() + E.earnings();
		}
		public String toString()
		{
			return String.format("%s %s%n%s: %.2f", "base-salaried", 
				E.toString(), "base salary", getBaseSalary());
		}
}