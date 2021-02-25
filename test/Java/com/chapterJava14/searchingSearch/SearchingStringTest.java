package Java.com.chapterJava14.searchingSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchingStringTest {
    @Test
    void word_canCountHowManyOccurrenceACharacterAppear(){
        String word = "Hello";
        assertEquals(2, SearchingString.searchCharacter(word, 'l'));
    }

}