package Java.com.chapterJava14.randomSentences;

import java.security.SecureRandom;

public class RandomSentence {

    private String[] articles;
    private String[] nouns;
    private String[] verbs;
    private String[] prepositions;

    public RandomSentence() {
        this.articles = new String[]{"the", "a", "one", "some", "any"};
        this.nouns =  new String[]{"boy" , "girl" , "dog" , "town", "car"};
        this.verbs =  new String[]{"drove" , "jumped" , "ran" , "walked", "skipped"};
        this.prepositions =  new String[]{"to" , "from" , "over" , "under", "on"};
    }

    public String[] getArticles() {
        return articles;
    }

    public void setArticles(String[] articles) {
        this.articles = articles;
    }

    public String[] getNouns() {
        return nouns;
    }

    public void setNouns(String[] nouns) {
        this.nouns = nouns;
    }

    public String[] getVerbs() {
        return verbs;
    }

    public void setVerbs(String[] verbs) {
        this.verbs = verbs;
    }

    public String[] getPrepositions() {
        return prepositions;
    }

    public void setPrepositions(String[] prepositions) {
        this.prepositions = prepositions;
    }


    public String generateSentence() {
       StringBuilder builder = new StringBuilder();
       String space = " ";
       String article = articles[generateRandomNumber()];
       char capitalize = article.charAt(0);
       capitalize = Character.toUpperCase(capitalize);
       String firstArticle = article.replace(article.charAt(0), capitalize);

       builder.append(firstArticle).append(space).append(nouns[generateRandomNumber()]).append(space)
       .append(verbs[generateRandomNumber()]).append(space).append(prepositions[generateRandomNumber()]).append(space)
       .append(articles[generateRandomNumber()]).append(space).append(nouns[generateRandomNumber()]).append(".");

       return builder.toString();
    }

    public int generateRandomNumber() {
        SecureRandom random = new SecureRandom();
        return random.nextInt(5);
    }
}
