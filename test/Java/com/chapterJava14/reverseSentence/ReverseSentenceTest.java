package Java.com.chapterJava14.reverseSentence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSentenceTest {
    @Test
    void sentence_canBeReverseSentence(){
        String sentence = "I love you";
        String expected = "you love I ";
        assertEquals(expected, ReverseSentence.reverse(sentence));
    }
}

