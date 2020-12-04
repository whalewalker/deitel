package Java.com.javaChapter2;

public class ChrisMax {

    public static void main(String[] args) {
        int counter = 1;
        String day = "";

        while (counter <= 12) {

            switch (counter) {
                case 1:
                    day = "first";
                    break;
                case 2:
                    day = "second";
                    break;
                case 3:
                    day = "third";
                    break;
                case 4:
                    day = "fourth";
                    break;
                case 5:
                    day = "fifth";
                    break;
                case 6:
                    day = "sixth";
                    break;
                case 7:
                    day = "seventh";
                    break;
                case 8:
                    day = "eighth";
                    break;
                case 9:
                    day = "ninth";
                    break;
                case 10:
                    day = "tenth";
                    break;
                case 11:
                    day = "eleventh";
                    break;
                case 12:
                    day = "twelfth";
                    break;

            }

            switch (day) {
                case "first":
                case "second":
                case "third":
                case "fourth":
                case "fifth":
                case "sixth":
                case "seventh":
                case "eighth":
                case "ninth":
                case "tenth":
                case "eleventh":
                case "twelfth":

                    System.out.printf("On the %s day of christmas my true love sent to me %n", day);
                    break;
            }

            switch (day) {
                case "twelfth":
                    System.out.println("Twelve drummers drumming");
                case "eleventh":
                    System.out.println("Eleven pipers piping,");
                case "tenth":
                    System.out.println("Ten lords a-leaping,");
                case "ninth":
                    System.out.println("Nine ladies dancing,");
                case "eighth":
                    System.out.println("Eight maids a-milking,");
                case "seventh":
                    System.out.println("Seven swans a-swimming,");
                case "sixth":
                    System.out.println("Six geese a-laying, ");
                case "fifth":
                    System.out.println("Five gold rings, ");
                case "fourth":
                    System.out.println("Four calling birds,");
                case "third":
                    System.out.println("Three french hens,");
                case "second":
                    System.out.println("Two turtle doves,");
                case "first":
                    System.out.println("A partridge in a pear tree.");
                    break;
            }

            counter++;
        }
    }
}
