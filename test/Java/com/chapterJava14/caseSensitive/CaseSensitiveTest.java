package Java.com.chapterJava14.caseSensitive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaseSensitiveTest {
    @Test
    void word_canBeUpperCase(){
        CaseSensitive.toUpperCase("Love");
        assertEquals("LOVE", CaseSensitive.getWord());
    }

    @Test
    void word_canBeLowerCase(){
        CaseSensitive.toLowerCase("LOVE");
        assertEquals("love", CaseSensitive.getWord());
    }

    @Test
    void word_canBeCapitalize(){
        CaseSensitive.toCapitalize("lOVe");
        assertEquals("Love", CaseSensitive.getWord());
    }
}