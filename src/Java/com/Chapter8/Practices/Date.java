package Java.com.Chapter8.Practices;

public class Date {
    private int month;
    private int day;
    private int year;


    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private static final int[] DAYSPERMONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};



    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    public static class Employee{
        private  String firstName;
        private String lastName;
        private Date birthDate;
        private Date hireDate;

        public Employee(String firstName, String lastName, Date birthDate, Date hireDate){
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.hireDate = hireDate;
        }

        public String toString() {
            return String.format("%s, %s Hired: %s Birthday: %s",
                    lastName, firstName, hireDate, birthDate);
        }
    }

   public static void main(String[] args) {
        Date birthDay = new Date(7, 2, 2001 );
        Date hire = new Date(1, 1, 2023);

        Employee employee = new Employee("Ismail", "Abdullah", birthDay, hire);
       System.out.println(employee);
    }
}