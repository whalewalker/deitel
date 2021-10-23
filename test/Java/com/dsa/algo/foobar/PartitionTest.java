package Java.com.dsa.algo.foobar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionTest {
    Partition partition;

    @BeforeEach
    void setUp() {
        partition = new Partition();
    }

    @AfterEach
    void tearDown() {
        partition = null;
    }

    @Test
    void partitionForNullNumber(){
        assertThrows(IllegalArgumentException.class, ()-> partition.calculateNumberOfPartition(null));
    }

    @Test
    void partitionForEvenNumber(){
        int number = 8;
        assertEquals(4, partition.calculateNumberOfPartition(number));
    }
}