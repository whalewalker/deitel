package Java.com.javaChapter6;

public class TableOfBinary {


    static boolean checkDecimal(int decimal) {
        while (decimal > 0) {
            if (decimal % 10 > 9) {
                return false;
            }
            decimal /= 10;
        }
        return true;
    }

    public static String convertBinary(int decimal) {
        int base = 1;
        int reminder;
        String reverse = "";
        String mainConversion = "";

        while (base != 0) {
            base = decimal / 2;

            reminder = decimal % 2;

            reverse += reminder;

            decimal = base;
        }
        for (int i = reverse.length() - 1; i >= 0; i--) {
            mainConversion = mainConversion + reverse.charAt(i);
        }
        return mainConversion;
    }



    public static String convertOctal(int decimal) {
        int base = 1;
        int reminder;
        String reverse = "";
        String mainConversion = "";

        while (base != 0) {
            base = decimal / 8;

            reminder = decimal % 8;

            reverse += reminder;

            decimal = base;
        }
        for (int i = reverse.length() - 1; i >= 0; i--) {
            mainConversion = mainConversion + reverse.charAt(i);
        }
        return mainConversion;
    }



    public static String convertHexadecimal(int decimal) {
        int base = 1;
        int reminder;
        String reverse = "";
        String mainConversion = "";

        while (base != 0) {
            base = decimal / 16;

            reminder = decimal % 16;

            reverse += reminder;

            decimal = base;
        }
        for (int i = reverse.length() - 1; i >= 0; i--) {
            mainConversion = mainConversion + reverse.charAt(i);
        }
        return mainConversion;
    }
    public static void main(String[] args) {
        for(int count = 1; count <= 256; count++){
            System.out.printf("%s%10s%15s%20s%n", "Decimal", "Binary", "OctalDecimal", "HexDecimal");
            System.out.printf("%5s%8s%8s%10s%n",count, TableOfBinary.convertBinary(count),TableOfBinary.convertOctal(count), TableOfBinary.convertHexadecimal(count));
        }
    }
}
