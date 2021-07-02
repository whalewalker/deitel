package Java.com.javaChapter7.practiceTest;

import Java.com.javaChapter7.playground.TodoList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    TodoList myTodo;
    @BeforeEach
    void setUp() {
        myTodo = new TodoList();
    }

    @AfterEach
    void tearDown() {
        myTodo = null;
    }

    @Test
    void checkIfItemCanBeAddedToAList(){
        String userInput = "Take my bath";
        int index = 1;
        String [] output = myTodo.addItemToTodo(index);
        String [] todoList = {"Take my bath"};
        assertEquals(Arrays.toString(todoList), Arrays.toString(output));
    }

    @Test
    void testIfIndexOfArrayCanBeRemove(){
        String [] newArr = {"3","6","1","7","9"};
        String[] output = myTodo.removeItemInArray(newArr, 4);
        String [] test ={"3","6","1","7"};
        assertEquals(Arrays.toString(output), Arrays.toString(test));
    }
}