package Java.com.javaChapter6;

public class TableOfBinaryTest {

    public static void main(String[] args) {
        for(int count = 1; count <= 256; count++){
            if(count == 1){
                System.out.printf("%s%12s%15s%18s%n", "Decimal", "Binary", "OctalDecimal", "HexDecimal");
            }
            System.out.printf("%3s%15s%12s%20s%n",count, TableOfBinary.convertBinary(count),TableOfBinary.convertOctal(count), TableOfBinary.convertHexadecimal(count));
        }
    }

}
