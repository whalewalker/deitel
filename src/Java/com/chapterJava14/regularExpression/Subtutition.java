package Java.com.chapterJava14.regularExpression;

import java.util.Arrays;

class substitution {
    public static void main(String[] args) {
        String firstName = "This sentences ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7,8";

        System.out.printf("Original String 1 %s%n", firstName);
        firstName = firstName.replaceAll("\\*", "^");
        System.out.printf("^ substituted fro *: 5s%n", firstName);

        firstName = firstName.replaceAll("stars", "carets");
        System.out.printf("\"carets\" substituted for \"starts\": %s%n", firstName);

        System.out.printf("Every word replaced by \\\"word\\\": %s%n%n",firstName.replaceAll("\\w+", "word"));
        System.out.printf("Original String 2: %s%n", secondString);

        for(int count = 0; count < secondString.length(); count++){
            secondString = secondString.replaceFirst("\\d", "digit");
        }

        System.out.printf(
                "First 3 digits replaced by \"digit\" : %s%n", secondString);
        System.out.print("String split at commas: ");
        String[] results = secondString.split(",\\s*");
        System.out.println(Arrays.toString(results));
    }
}
