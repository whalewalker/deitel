package Java.com.dsa.algo.LinkedList;

import Java.com.dsa.stack.StackUnderFlowException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
You are given a string with just two types of bracket characters in it - '(' and ')'.Write a function that takes that string as an input and returns a boolean indicating whether the string is balanced or not. A string is considered balanced if all the open-parenthesis characters '(' have a matching close-parenthesis character and all of them are correctly nested and syntactically correct.
Example: given the string
 () => the answer is true
 ((())) => the answer is true
 (()()()) => the answer is true
 (((( => the answer is false
 )(
    => the answer is false
Your code should work for all possible test cases and should have good time-complexity
*/

class BracketTest {

    Bracket bracket;

    @BeforeEach
    void setUp() {
        bracket = new Bracket();
    }

    @AfterEach
    void tearDown() {
        bracket = null;
    }

    @Test
    void throwNullPointer_exceptionWhenStringIsNull(){
        String expected = null;
        assertThrows(NullPointerException.class, ()->  bracket.isValidBracket(expected));
    }

    @Test
    void whenStringIsEmpty_returnFalse() {
        String expected = "";
        boolean actual = bracket.isValidBracket(expected);
        assertFalse(actual);
    }

    @Test
    void whenStringContainSpaces_returnFalse() throws StackUnderFlowException {
        String expected = "   ";
        boolean actual = bracket.isValidBracket(expected);
        assertFalse(actual);
    }

    @Test
    void whenStringContainTwoBracketThatIsSyntacticallyCorrect_returnTrue() {
        String expected = "()";
        boolean actual = bracket.isValidBracket(expected);
        assertTrue(actual);
    }

    @Test
    void whenStringContainMultipleBracket_returnTrue() {
        String expected = "((()))";
        boolean actual = bracket.isValidBracket(expected);
        assertTrue(actual);
    }

    @Test
    void whenStringContainMultipleBracketThatIsSyntacticallyCorrect_returnTrue() {
        String expected = "(()()())";
        boolean actual = bracket.isValidBracket(expected);
        assertTrue(actual);
    }

    @Test
    void whenStringNotContainMultipleBracketThatIsSyntacticallyCorrect_returnFalse() {
        String expected = "((((";
        boolean actual = bracket.isValidBracket(expected);
        assertFalse(actual);
    }

    @Test
    void whenStringContainTwoBracketOfDiffTypeButNotSyntacticallyCorrect_returnFalse() {
        String expected = ")(";
        boolean actual = bracket.isValidBracket(expected);
        assertFalse(actual);
    }

    @Test
    void whenStringContainMoreBracketOfDiffTypeButNotSyntacticallyCorrect_returnFalse() {
        String expected = "(()()(())(()))))";
        boolean actual = bracket.isValidBracket(expected);
        assertFalse(actual);
    }
}