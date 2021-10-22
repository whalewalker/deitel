package Java.com.dsa.algo.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LeetCode {

    public int subString(String s) {
        if (s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        int sliceFront = 0;
        int sliceBack = s.length();
        String newSubString = s.substring(sliceFront, sliceBack);
        int loopCount = 0;

        for (int counter = 0; counter < s.length(); counter++) {
            System.out.println(newSubString);
            if (hasDuplicate(newSubString)) {
                return newSubString.length();
            } else {
                for (int count = 0; count < loopCount; count++) {
                    newSubString = s.substring(++sliceFront, ++sliceBack);
                    System.out.println(newSubString);
                    if (hasDuplicate(newSubString)) {
                        return newSubString.length();
                    }
                }
                sliceBack = newSubString.length() - 1;
                sliceFront = 0;
                newSubString = s.substring(sliceFront, sliceBack);
                loopCount = s.length() - sliceBack;
            }
        }

        return 0;
    }

    private boolean hasDuplicate(CharSequence value) {
        return value.length() == value.chars().distinct().count();
//        Set<Character> charSet = new HashSet<>();
//        for (int index = 0; index < value.length(); index++) {
//            charSet.add(value.charAt(index));
//        }
//
//        return charSet.size() == value.length();

    }
}
