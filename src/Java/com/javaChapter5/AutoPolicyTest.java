package Java.com.javaChapter5;

import java.util.Scanner;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");

        policyINNoFaultState(policy1);
       policyINNoFaultState(policy2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number : ");
        int accountNumber = scanner.nextInt();
        policy1.setAccountNumber(accountNumber);

        System.out.print("Enter model of your car : ");
        String model = scanner.next();
        policy1.setMakeAndModel(model);

        System.out.print("Enter the state of your policy (e.g MA) : ");
        String state = scanner.next();
        policy1.setState(state);


        policyINNoFaultState(policy1);

    }

    public static void policyINNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d ; Car : %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), (policy.IsNotFaultState() ? "is" : "is not"));
    }
}
