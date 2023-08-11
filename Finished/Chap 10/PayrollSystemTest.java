
public class PayrollSystemTest
{
    public static void main(String[] args)
    {
        Date today = new Date(1, 31, 2019);
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 1, 24, 1998, 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 5, 20, 1990, 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 7, 18, 1997, 10000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 1, 2, 1996, 5000, 0.04, 300);
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        System.out.printf("Employees processed (polymorphically) on %s:%n%n", today);
        for(Employee currentEmployee : employees)
        {
            System.out.println(currentEmployee);
            double earnings = currentEmployee.earnings();
            if(currentEmployee.getBirthDate().getMonth() == today.getMonth())
                earnings += 100.00;
            System.out.printf("Earnings for the month of January, 2019: %,.2f", earnings);
            System.out.println();
            System.out.println();
        }
    }
}



