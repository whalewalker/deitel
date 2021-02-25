package Java.com.chapterJava14.pigLatin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    PigLatin latin = new PigLatin();


    @Test
    void word_canBeReverse(){
        latin.split("I");
        assertEquals("Iay ", latin.getWord());
    }

    @Test
    void sentence_canBeTokenize(){
        String sentence = "Hello dear i just call the plumber";
        int tokens = latin.printLatin(sentence);
        assertEquals(7, tokens);
    }
}