package Java.com.chapterJava14.reverseSentence;

public class ReverseSentence {

    public static String reverse(String sentence) {
        StringBuilder reverse = new StringBuilder();
        String[] tokens = sentence.split(" ");
        int lastIndex = tokens.length - 1;

        for(int count = lastIndex; count >= 0; count--){
            reverse.append(tokens[count]).append(" ");
        }
        return reverse.toString();
    }
}
