package Java.com.dsa.algo.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeTest {

    LeetCode leetCode;

    @BeforeEach
    void setUp() {
        leetCode = new LeetCode();
    }

    @AfterEach
    void tearDown() {
        leetCode = null;
    }

    @Test
    void when_stringIsNull_returnZero(){
        assertEquals(0, leetCode.subString(null));
    }
    
    @Test
    void when_StringIsEmpty_returnZero(){
        assertEquals(0, leetCode.subString(""));
    }

    @Test
    void when_StringContainOnlySpaces_returnZero(){
        assertEquals(0, leetCode.subString("       "));
    }

    @Test
    void when_LengthOfStringIsGreaterThatThreeWithTheSameCharacter_returnOne(){
        assertEquals(1, leetCode.subString("bbbbb"));
    }

    @Test
    void when_StringContainDifferentCharacter_returnSubStringLength(){
//        String value = "abcabcbb";
//        int expected = 3;
//        leetCode.subString(value);
//        int actual = leetCode.subString(value);
//        assertEquals(expected, actual);

//        // Another scenario
//        assertEquals(3, leetCode.subString("pwwkew"));
//        assertEquals(2, leetCode.subString("au"));
        leetCode.subString("hcyljtfqldcxofzwscnezsbbqwxqyqqisotdhatsdxrrdsqvudbwxcxpbufbkxlemgivgbqmbjdecvbyycuygrpjm");
    }

    @Test
    void when_StringContainSpace_returnOne(){
        assertEquals(1, leetCode.subString(" "));
    }
}