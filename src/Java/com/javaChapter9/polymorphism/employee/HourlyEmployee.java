package Java.com.javaChapter9.polymorphism.employee;

public class HourlyEmployee extends Employee{
    private double wages;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wages, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        if(wages < 0.0)
            throw new IllegalArgumentException("Hourly wage must be greater than or equal to 0.0");
        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("Hours worked must be between 0.0 to 168.0 hours");
        }
        this.wages = wages;
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        if(wages < 0.0)
            throw new IllegalArgumentException("Hourly wage must be greater than or equal to 0.0");
        this.wages = wages;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("Hours worked must be between 0.0 to 168.0 hours");
        }
        this.hours = hours;
    }

    @Override
    public double earning() {
        if(getHours() <= 40)
            return getWages() * hours;
        else {
            double extraTime = getHours() - 40;
            double overFlow = extraTime * getWages() * 1.5;
            return (40 * getWages() + overFlow);
        }
    }

    @Override
    public String toString()
    {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWages(),
                "hours worked", getHours());
    }
}
