package Java.com.chapterJava14.searchingSearch;

public class SearchingString {

    public static int searchCharacter(String word, char character) {
        return word.indexOf(character, word.length());
    }
}
