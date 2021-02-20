package Java.com.javaChapter14.comparison;

public class StringCompare {
    public static void main(String[] args) {
        String string1 = new String("Hello");
        String string2 = "goodbye";
        String string3 = "Happy Birthday";
        String string4 = "happy birthday";

        System.out.printf("string1 = %s%nstring3 = %s%nstring4 = %s%n%n", string1, string2, string3, string4);
        if(string1.equals("Hello"))
            System.out.println("string equals \"hello\"");
        if ( string1 == "hello" ) //
            System.out.println("s1 is the same object as \"hello\"");
        else
            System.out.println("s1 is not the same object as \"hello\"");

        if ( string3.equalsIgnoreCase(string4) ) // true
            System.out.printf("%s equals %s with case ignored%n", string3, string4);
        else
            System.out.println("s3 does not equal s4");

        System.out.printf("%nstring1.compareTo(string2 is %d", string1.compareTo(string2));

        // test regionMatches (case sensitive)
        if ( string3.regionMatches(0, string4, 0, 5) )
            System.out.println("First 5 characters of s3 and s4 match");
        else
            System.out.println(
                    "First 5 characters of s3 and s4 do not match");
// test regionMatches (ignore case)
        if ( string3.regionMatches(true, 0, string4, 0, 5) )
            System.out.println(
                    "First 5 characters of s3 and s4 match with case ignored");
        else
            System.out.println(
                    "First 5 characters of s3 and s4 do not match");
    }
}