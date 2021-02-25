package Java.com.chapterJava14.caseSensitive;

public class CaseSensitive {
    private static String word;

    public CaseSensitive() {
        word = "";
    }

    public static String getWord() {
        return word;
    }

    public static void toUpperCase(String newWord) {
        word = newWord.toUpperCase();
    }

    public static void toLowerCase(String newWord) {
        word = newWord.toLowerCase();
    }

    public static void toCapitalize(String newWord) {
      char firstChar = newWord.charAt(0);
      firstChar = Character.toUpperCase(firstChar);
      String transformWord = "";
      transformWord= newWord.toLowerCase();

      word = transformWord.replace(transformWord.charAt(0), firstChar);
    }
}
