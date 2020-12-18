package Java.com.javaChapter5.makingDifference;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GlobalWarmingFactsQuizTest {
    GlobalWarmingFactsQuiz myQuizApp = new GlobalWarmingFactsQuiz();

    @Test
    void checkIfQuestionCanBeGenerated(){
        String question = "Wasting less food is a way to reduce greenhouse gas emissions?";;
        myQuizApp.setQuestion(question);
        assertEquals(question, myQuizApp.getQuestion());
    }

    @Test
    void checkIfOptionCanBeGenerated(){
        String question = "Wasting less food is a way to reduce greenhouse gas emissions?";;
        myQuizApp.setQuestion(question);
        String option = "True";
        myQuizApp.checkOption(option);
        assertEquals(option, myQuizApp.getOption());
    }
}