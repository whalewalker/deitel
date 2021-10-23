package Java.com.dsa.algo;

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
    void when_StringContainOnlySpaces_returnOne(){
        assertEquals(1, leetCode.subString("       "));
    }

    @Test
    void when_LengthOfStringIsGreaterThatThreeWithTheSameCharacter_returnOne(){
        assertEquals(1, leetCode.subString("bbbbb"));
    }

    @Test
    void when_StringContainDifferentCharacter_returnSubStringLength(){
        String value = "abcabcbb";
        int expected = 3;
        leetCode.subString(value);
        int actual = leetCode.subString(value);
        assertEquals(expected, actual);

        // Another scenario
        assertEquals(3, leetCode.subString("pwwkew"));
        assertEquals(2, leetCode.subString("au"));
        leetCode.subString("hcyljtfqldcxofzwscnezsbbqwxqyqqisotdhatsdxrrdsqvudbwxcxpbufbkxlemgivgbqmbjdecvbyycuygrpjm");
    }

    @Test
    void when_StringContainSpace_returnOne(){
        assertEquals(1, leetCode.subString(" "));
    }

    @Test
    void when_sortedArraysSizeIsNull_returnZero(){
        assertEquals(0.00000, leetCode.findMedianSortedArrays(null, null));
    }

    @Test
    void when_OneSortedArrayIsNull_returnZero(){
        assertEquals(0.00000, leetCode.findMedianSortedArrays(new int[]{0, 1}, null));
    }

    @Test
    void when_sortedArraysElementContainZeros_returnZero(){
        assertEquals(0.00000, leetCode.findMedianSortedArrays(new int[]{0, 0, 0}, new int[]{0, 0}));
    }

    @Test
    void when_OneSortedArrayDoesNotContainAnyThing_returnMedianOfTheContainedArray(){
        assertEquals(2.00000, leetCode.findMedianSortedArrays(new int[0], new int[]{2}));
    }

    @Test
    void when_sortedArraysBothContainValidElement_returnMedianOfSortedArray(){
        assertEquals(2.50000, leetCode.findMedianSortedArrays(new int[]{1,2}, new int[]{3, 4}));
    }
}