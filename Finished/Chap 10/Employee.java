public abstract class Employee
{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;
    public Employee(String firstName, String lastName, String socialSecurityNumber, int month, int day, int year)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        birthDate = new Date(month, day, year);
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    public Date getBirthDate()
    {
        return birthDate;
    }
    @Override
    public String toString()
    {
        return String.format("%s %s%nsocial security number: %s%ndate of birth: %s", getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate().toString());
    }
    public abstract double earnings();
}