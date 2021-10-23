package Java.com.dsa.algo;

public class LeetCode {

    public int subString(String s) {
        if (s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        int sliceFront = 0;
        int sliceBack = s.length();
        String newSubString = s.substring(sliceFront, sliceBack);
        int loopCount = 0;
        int counter = 0;

        while (counter != s.length()) {
            if (hasDuplicate(newSubString)) {
                return newSubString.length();
            } else {
                for (int count = 0; count < loopCount; count++) {
                    newSubString = s.substring(++sliceFront, ++sliceBack);
                    if (hasDuplicate(newSubString)) {
                        return newSubString.length();
                    }
                }
                sliceBack = newSubString.length() - 1;
                sliceFront = 0;
                newSubString = s.substring(sliceFront, sliceBack);
                loopCount = s.length() - sliceBack;
            }
            counter++;
        }

        return 0;
    }

    private boolean hasDuplicate(CharSequence value) {
        return value.length() == value.chars().distinct().count();
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0.0;
    }


}
