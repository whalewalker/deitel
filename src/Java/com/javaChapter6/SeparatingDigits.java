package Java.com.javaChapter6;

public class SeparatingDigits {

    public static int quotientOfNumber(int value) {
        return value / 10;
    }

    public static int reminderOfNumber(int value) {
        return value % 10;
    }

    public static String displayDigits(int value) {
       StringBuilder output = new StringBuilder();
        value = reverseDigit(value);
       while (value != 0){
          output.append(reminderOfNumber(value)).append("  ");
          value = quotientOfNumber(value);
       }
       return output.toString();
    }

    public static int reverseDigit(int value) {
        int reverse = 0;
        int reminder;
        while (value != 0){
            reminder = reminderOfNumber(value);
            reverse = 10 * reverse + reminder;
            value = quotientOfNumber(value);
        }
        return reverse;
    }
}
