package Java.com.dsa.foobar;

import java.util.ArrayList;
import java.util.List;

public class MinionWork {

    public Object[] removeDuplicate(int[] array, int duplicate) {
        if (duplicate == 0) return null;
        int[] duplicateArr = new int[99];
        for (int i : array) {
            duplicateArr[i]++;
        }
        List<Integer> NonDuplicate = new ArrayList<>();
        for (int count = 0; count < duplicateArr.length; count++) {
            if(duplicateArr[count] == duplicate){
                NonDuplicate.add(count);
            }
        }
        return NonDuplicate.toArray();
    }
}
