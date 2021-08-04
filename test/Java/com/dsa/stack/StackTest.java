package Java.com.dsa.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new ArrayStack<>();
    }

    @AfterEach
    void tearDown() {
        stack = null;
    }

    @Test
    void stack_canBeEmptyAtConstructionLevel(){
        assertTrue(stack.isEmpty());
    }

    @Test
    void stack_canInsertDataTest(){
        stack.push(7);
        assertFalse(stack.isEmpty());
        try {
            assertEquals(stack.pop(), 7);
        } catch (StackUnderFlowException e) {
            e.printStackTrace();
        }
    }

    @Test
    void stack_canAddMoreThanOneData(){
        stack.push(4);
        stack.push(7);

        assertEquals(2, stack.size());
    }

    @Test
    void canRemoveDataFromStack() throws StackUnderFlowException {
        stack.push(4);
        stack.push(7);

        stack.pop();

        assertEquals(stack.size(), 1);
    }
    @Test
    void canThrowExceptionWhenStackIsEmpty(){
        assertThrows(StackUnderFlowException.class, ()-> stack.pop());
    }

    @Test
    void canPeekLastDataOnStack(){
        stack.push(4);
        stack.push(7);

        int peek = stack.top();
        assertEquals(7, peek);
    }
}