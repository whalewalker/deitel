package Java.com.dsa.algo.LinkedList;

import Java.com.dsa.linkedList.singlyLinkedList.SinglyLinkedList;
import Java.com.javaChapter4.BinaryNumberToDecimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryNumberLinkedListToInteger {
    public int convertToInteger(SinglyLinkedList<Integer> linkedList) {
        StringBuilder builder = new StringBuilder();
        int temp = 0;
        while (linkedList.size() > 0){
            builder.append(linkedList.removeFirst());
        }
        String binaryString= builder.reverse().toString();

        BinaryNumberToDecimal binaryNumberToDecimal = new BinaryNumberToDecimal();

        return binaryNumberToDecimal.convertAnyBinaryToBaseTen(Integer.parseInt(binaryString));
    }


    public static int[] solve(int[] heights) {
        List<Integer> views = new ArrayList<>();
        int count = 1;
        if (heights == null || heights.length < 1){
            return new int[0];
        }

        for (;count < heights.length; count++) {
            if ( heights[count - 1] > heights[count]){
                views.add(count - 1);
            }
        }
        int[] overview = views.stream().mapToInt(item -> item).toArray();
        return overview;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{2 ,1 ,2})));
    }
}
