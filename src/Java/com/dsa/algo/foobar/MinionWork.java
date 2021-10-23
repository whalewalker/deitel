package Java.com.dsa.algo.foobar;

import java.util.*;

public class MinionWork {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(3);
        System.out.println(MinionWork.solution(array, 1));
    }
    public static List<Integer> solution(List<Integer> data, int n) {
        if (data == null || data.size() > 99 || data.size() == 0) return null;
        if (n <= 0) return null;
        Map<Integer, Integer> m = new HashMap<>();
        for (int e : data) {if (!m.containsKey(e)) m.put(e, 1);
            else m.put(e, m.get(e) + 1);}

        for (int key : m.keySet()) {
            if (m.get(key) > n){

                for (int i = 0; i < m.get(key); i++){
                    data.remove((Integer) key);
                }
            }
        }
        return data;

//        Set<Integer> s = m.keySet();
//        s.removeIf(v -> m.get(v) > n);
//        int[] dup = new int[s.size()];
//        int c = 0;
//        for (int key : m.keySet()) dup[c++] = key;
//        return dup;
    }


}
