package Java.com.dsa.byteWorks;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class GraphImplTest {

    @Test
    void addEdge() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/whalewalker/Whalewalker/Portfolio/deitel/src/Java/com/dsa/byteWorks/teradata-world-setup"));
        int numberOfVertices = Integer.parseInt(reader.readLine());
        System.out.println(numberOfVertices);
        GraphImpl<Integer> graph = new GraphImpl<>(numberOfVertices, Integer.class);

        reader.lines().forEach(line -> {
            String[] array = line.split(",");
            int parent = Integer.parseInt(array[0]);
            int child = Integer.parseInt(array[1]);
            double probability = Double.parseDouble(array[2]) / 100;
            graph.addEdge(parent, child, probability);
        });

        double[][] expectedLookUpTable = {
                {0,0.5,0.7,0,0,0.4,0,0,0,0},
                {0.5,0,0,0.3,0.2,0,0,0,0,0},
                {0.7,0,0,0,0,0,0.45,0.95,0, 0},
                {0,0.3,0,0,0,0,0,0,0,0},
                {0,0.2,0,0,0,0,0,0,0,0},
                {0.4,0,0,0,0,0,0,0,0.6,0.55},
                {0,0,0.45,0,0,0,0,0,0,0},
                {0,0,0.95,0,0,0,0,0,0,0},
                {0,0,0,0,0,0.6,0,0,0,0},
                {0,0,0,0,0,0.55,0,0,0,0}
        };
        assertEquals(1, graph.getAdjacentList()[0].;
    }

}