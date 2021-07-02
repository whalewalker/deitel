package Java.com.javaChapter16.sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @BeforeEach
    void setUp() {
        Example example = new Example();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void canAddColorToColorsArray(){
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();
        Example example = new Example();

        example.addColor(list);
        for (String color : list){
           assertNotNull(color);
        }
    }
    @Test
    void canRemovedColorToColorsArray(){
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>();

        for (String color : removeColors){
            removeList.add(color);
        }

        System.out.println("ArrayList: ");
        for (String color : removeList) {
            assertNotNull(color);
            System.out.printf("%s ", color);
        }

        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();

        Example example = new Example();

        example.addColor(list);
        example.removeColors(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColors:%n");
            for (String color : list)
            System.out.printf("%s ", color);
    }
}