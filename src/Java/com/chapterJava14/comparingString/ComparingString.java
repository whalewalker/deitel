package Java.com.chapterJava14.comparingString;

public class ComparingString {

    public static String checkEqual(String firstValue, String secondValue) {
        String answer = null;
       if(firstValue.compareTo(secondValue) == 0){
           answer = "equal to";
       }
       return answer;
    }

    public static String getFirstWord(String sentence) {
        return sentence.substring(0, sentence.indexOf(' '));
    }

    public static String checkGreater(String firstValue, String secondValue) {
        String answer = null;
        if(firstValue.compareTo(secondValue) > 0){
            answer = "greater than";
            System.out.println(firstValue.compareTo(secondValue) > 0);
        }
        return answer;
    }

    public static String checkLesser(String firstValue, String secondValue) {
        String answer = null;
        if(firstValue.compareTo(secondValue) < 0){
            answer = "lesser than";
        }
        return answer;
    }
}
