package Java.com.javaChapter8.Practices;

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

    public static void main(String[] args) {
        Date birthDay = new Date(7, 2, 2001 );
        Date hire = new Date(1, 1, 2023);

        Employee employee = new Employee("Ismail", "Abdullah", birthDay, hire);
       System.out.println(employee);
    }
}