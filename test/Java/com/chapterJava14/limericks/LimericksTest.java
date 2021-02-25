package Java.com.chapterJava14.limericks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LimericksTest {
Limericks poem;

    @BeforeEach
    void setUp() {
        poem = new Limericks();
    }

    @AfterEach
    void tearDown() {
        poem = null;
    }

    @Test
    void checkIfRandomNumberCanBeGenerated(){
        int random1 = poem.generateRandomNumber();
        int random2 = poem.generateRandomNumber();
        assertNotEquals(random1, random2);
    }

    @Test
    void poem_wordsAreNotEmpty(){
        assertNotNull(poem.getFirstLimericksRhymes());
        assertNotNull(poem.getSecondLimericksRhymes());
        assertNotNull(poem.getLimericksWords());
        assertNotNull(poem.getArticles());
        assertNotNull(poem.getNouns());
        assertNotNull(poem.getPrepositions());
        assertNotNull(poem.getVerbs());

    }

    @Test
    void poem_canGenerateLimericksSentence(){
            String randomSentence = poem.generateSentence();
            assertNotNull(randomSentence);
            assertFalse(randomSentence.isEmpty());
            System.out.println(randomSentence);
    }


}