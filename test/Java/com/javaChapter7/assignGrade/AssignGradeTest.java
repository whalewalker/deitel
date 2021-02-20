package Java.com.javaChapter7.assignGrade;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AssignGradeTest {
    @Test
    void testIfUserHasGoodGrade(){
        int[] scores = {40, 55, 70, 58};
        char[] grade = AssignGrade.assignGrade(scores);
        assertEquals(Arrays.toString(new char[]{'C', 'B', 'A', 'B'}), Arrays.toString(grade));
    }
}