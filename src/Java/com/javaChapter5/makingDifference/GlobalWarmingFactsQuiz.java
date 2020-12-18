package Java.com.javaChapter5.makingDifference;

public class GlobalWarmingFactsQuiz {

    private String question;
    private String option;
    private int score;


    public int getScore() {
        return score;
    }


    public String getOption() {
        return option;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void checkOption(String option) {
        if(option.equals("False")){
            this.option = option;
            score = 1;
        }else {
            System.out.println("Fail");
        }
    }
}
