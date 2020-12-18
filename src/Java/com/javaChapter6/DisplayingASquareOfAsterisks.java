package Java.com.javaChapter6;

public class DisplayingASquareOfAsterisks {
    public static String generateAsterisk(String  fillChar, int side) {
        String asterisk = "";

        if(side == -(side) || side == 0){
            asterisk = fillChar;
        }else {
            for(int counter = 0; counter < side; counter++){
                for (int innerCount = 0; innerCount < side; innerCount++){
                    asterisk += fillChar;
                }
                asterisk += "\n";
            }
        }

        return asterisk;
    }
}
