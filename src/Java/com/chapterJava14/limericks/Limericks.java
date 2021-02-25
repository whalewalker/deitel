package Java.com.chapterJava14.limericks;

import java.security.SecureRandom;

public class Limericks {
    private String[] firstLimericksRhymes;
    private String[] secondLimericksRhymes;
    private String[] limericksWords;
    private String[] articles;
    private String[] nouns;
    private String[] verbs;
    private String[] prepositions;

    public Limericks() {
        this.firstLimericksRhymes = new String[]{"ark", "bark", "cork", "truck", "clerc"};
        this.secondLimericksRhymes = new String[]{"abduction", "compaction", "transaction", "refraction", "subtraction"};
        this.limericksWords = new String[]{"time", "love", "day", "light", "night", "man", "water", "life", "dark", "dead", };
        this.articles = new String[]{"the", "a", "one", "some", "any"};
        this.nouns =  new String[]{"boy" , "girl" , "dog" , "town", "car"};
        this.verbs =  new String[]{"drove" , "jumped" , "ran" , "walked", "skipped"};
        this.prepositions =  new String[]{"to" , "from" , "over" , "under", "on"};
    }

    public int generateRandomNumber() {
        SecureRandom random = new SecureRandom();
        return random.nextInt(5);
    }

    public String[] getFirstLimericksRhymes() {
        return firstLimericksRhymes;
    }

    public String[] getSecondLimericksRhymes() {
        return secondLimericksRhymes;
    }

    public String[] getLimericksWords() {
        return limericksWords;
    }

    public String[] getArticles() {
        return articles;
    }

    public String[] getNouns() {
        return nouns;
    }

    public String[] getVerbs() {
        return verbs;
    }

    public String[] getPrepositions() {
        return prepositions;
    }

    public String generateSentence() {
        StringBuilder builder = new StringBuilder();
        String space = " ";
        String article = articles[generateRandomNumber()];
        char capitalize = article.charAt(0);
        capitalize = Character.toUpperCase(capitalize);
        String firstArticle = article.replace(article.charAt(0), capitalize);

        for(int count = 1; count <= 5; count++){
           switch (count){
               case 1, 2, 5 -> poem(builder, space, firstArticle, firstLimericksRhymes);
               case 3, 4 ->  poem(builder, space, firstArticle, secondLimericksRhymes);
           }
        }
        return builder.toString();
    }

    private void poem(StringBuilder builder, String space, String firstArticle, String[] limericksRhymes) {
        builder.append(firstArticle).append(space).append(nouns[generateRandomNumber()]).append(space).append(limericksWords[generateRandomNumber()]).append(space)
                .append(verbs[generateRandomNumber()]).append(space).append(prepositions[generateRandomNumber()]).append(space)
                .append(articles[generateRandomNumber()]).append(space).append(nouns[generateRandomNumber()]).append(space).append(limericksRhymes[generateRandomNumber()]).append(".\n");
    }

}
