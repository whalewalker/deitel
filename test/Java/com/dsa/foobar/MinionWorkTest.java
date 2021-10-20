//package Java.com.dsa.foobar;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//class MinionWorkTest {
//    private final int[] numbers = {1, 2, 2, 3, 3, 3, 4, 5, 5};
//
////    @Test
////    void solutionForNullArray(){
////        assertThrows(IndexOutOfBoundsException.class,
////                     ()-> MinionWork.solution(null, 3));
////    }
//
//    @Test
//    void  solutionForOccurrenceLessOne(){
//        int[] result = MinionWork.solution(numbers, 0);
//        assertNotNull(result);
//        assertEquals(0, result.length);
//    }
//
//    @Test
//    void solutionForOneOccurrence(){
//        assertEquals(9, numbers.length);
//        int[] result = MinionWork.solution(numbers., 1);
//        assertNotNull(result);
//        assertEquals(1, result[0]);
//        assertEquals(4, result[1]);
//
//    }
//
//    @Test
//    void solutionForMoreThanTwoOccurrence(){
//        assertEquals(9, numbers.length);
//        int[] result = MinionWork.solution(numbers, 1);        assertNotNull(result);
//        assertEquals(2, result.length);
//    }
//
//    @Test
//    void solutionForMoreThanThreeOccurrence(){
//        assertEquals(9, numbers.length);
//        int [] result = MinionWork.solution(new int[]{1, 2, 3}, 0);
//        assertNotNull(result);
//        assertEquals(0, result.length);
//    }
//}