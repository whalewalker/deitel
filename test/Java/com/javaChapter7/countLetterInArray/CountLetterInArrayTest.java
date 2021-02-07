package Java.com.javaChapter7.countLetterInArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CountLetterInArrayTest {
    @Test
    void testIfCharacterCanBeGenerated(){
        CountLetterInArray character = new CountLetterInArray();
        assertNotNull(character.createCharacterArray());
    }

    @Test
    void testIfCharacterCanDisplay(){
        CountLetterInArray character = new CountLetterInArray();
        char[] charactersArray = character.createCharacterArray();
        String characters = character.displayCharacterArray(charactersArray);
        System.out.println(characters);
        assertNotNull(characters);
    }

    @Test
    void testIfNumberOfCharacterOccurrenceCanBeObtain(){
        CountLetterInArray character = new CountLetterInArray();
        char[] charactersArray = character.createCharacterArray();
        int[] characterCount = character.characterCount(charactersArray);

        System.out.println(character.displayCharacterArray(charactersArray));
        System.out.println(Arrays.toString(characterCount));

        assertEquals(26, characterCount.length);
    }
}