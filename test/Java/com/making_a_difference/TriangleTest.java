package Java.com.making_a_difference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testIfTriangleSideCanGenerateTriangle(){
        int hpy = 6;
        int opp = 4;
        int adj = 5;

        String triangle = Triangle.generateTriangle(hpy, opp, adj);
        assertNotNull(triangle);
    }

}