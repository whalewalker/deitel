package Java.com.chapterJava14.randomSentences;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomSentenceTest {
    RandomSentence  sentence;

    @BeforeEach
    void setUp() {
        sentence = new RandomSentence();
    }

    @AfterEach
    void tearDown() {
        sentence = null;
    }

    @Test
    void article_arrayIsNotNull(){
        assertNotNull(sentence.getArticles());
    }
    @Test
    void noun_arrayIsNotNull(){
        assertNotNull(sentence.getNouns());
    }

    @Test
    void verb_arrayIsNotNull(){
        assertNotNull(sentence.getVerbs());
    }

    @Test
    void preposition_arrayIsNotNull(){
        assertNotNull(sentence.getPrepositions());
    }

    @Test
    void random_numberCanBeGenerated(){
        int rand1 = sentence.generateRandomNumber();
        int rand2 = sentence.generateRandomNumber();
        assertNotEquals(rand2, rand1);
    }

    @Test
    void randomSentence_canBeGenerated(){
        for (int count = 0; count <= 20; count++){
            String randomSentence = sentence.generateSentence();
            assertNotNull(randomSentence);
            assertFalse(randomSentence.isEmpty());
            System.out.println(randomSentence);
        }
    }
}