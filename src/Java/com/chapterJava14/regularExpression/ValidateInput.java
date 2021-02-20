package Java.com.chapterJava14.regularExpression;

import java.util.Scanner;

public class ValidateInput {
    public static boolean validateFirstName(String firstName){
        return firstName.matches("[A_Z][a-zA-Z]*");
    }

    public static boolean validateLastName(String lastName){
        return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)");
    }

    public static boolean validateAddress(String address){
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateCity(String city){
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateState(String state){
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateZipCode(String zip){
        return zip.matches("\\d{5}");
    }

    public static boolean validatePhone(String phone){
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }


    public static void main(String[] args) {
        // get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please enter address:");
        String address = scanner.nextLine();
        System.out.println("Please enter city:");
        String city = scanner.nextLine();
        System.out.println("Please enter state:");
        String state = scanner.nextLine();
        System.out.println("Please enter zip:");
        String zip = scanner.nextLine();
        System.out.println("Please enter phone:");
        String phone = scanner.nextLine();


        System.out.println("%nValidate Result:");
        if (!ValidateInput.validateFirstName(firstName))
            System.out.println("Invalid first name");
        else if (!ValidateInput.validateLastName(lastName))
            System.out.println("Invalid last name");
        else if (!ValidateInput.validateAddress(address))
            System.out.println("Invalid address");
        else if (!ValidateInput.validateCity(city))
            System.out.println("Invalid city");
        else if (!ValidateInput.validateState(state))
            System.out.println("Invalid state");
        else if (!ValidateInput.validateZipCode(zip))
            System.out.println("Invalid zip code");
        else if (!ValidateInput.validatePhone(phone))
            System.out.println("Invalid phone number");
        else
            System.out.println("Valid input. Thank you.");
    }
}
