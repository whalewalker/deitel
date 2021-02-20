package Java.com.chapterJava14.comparingPortion;

import java.security.SecureRandom;

public class ComparingPortion {

    public boolean compareStringPortion(String firstStr, String secondStr) {
        SecureRandom random = new SecureRandom();
        boolean isEqual = false;
        int randomNumber = random.nextInt(Math.abs(firstStr.length() - secondStr.length()));
        firstStr = firstStr.toLowerCase();
        secondStr = secondStr.toLowerCase();

        if(firstStr.regionMatches(randomNumber, secondStr, 0, randomNumber))
            isEqual = true;
        return isEqual;
    }
}
