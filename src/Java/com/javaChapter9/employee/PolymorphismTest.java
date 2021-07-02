package Java.com.javaChapter9.employee;

public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue"
        ,"Jones", "222-2-222-2", 1000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        System.out.printf("%S %S:%n%n%s%n%n", "Call commission employee's to-string with super class reference",  "to super object", commissionEmployee);

        System.out.printf("%S %S:%n%n%s%n%n", "Call basePlus commissionEmployee's to-string with sub-class reference",  "to  sub-object", basePlusCommissionEmployee);

        CommissionEmployee commissionEmployee1 = basePlusCommissionEmployee;
        System.out.printf("%s %s:%n%n%s%n",
                "Call BasePlusCommissionEmployee's toString with superclass",
                "reference to subclass object", commissionEmployee1.toString() );

    }
}
