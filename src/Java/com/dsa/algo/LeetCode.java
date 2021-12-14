package Java.com.dsa.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode {

    public int subString(String s) {
//        int[] chars = new int[128];
//
//        int left = 0;
//        int right = 0;
//
//        int res = 0;
//        while (right < s.length()) {
//            char r = s.charAt(right);
//            System.out.println(r);
//            System.out.println(chars[r]++);;
//
//            while (chars[r] > 1) {
//                char l = s.charAt(left);
//                chars[l]--;
//                left++;
//            }
//
//            res = Math.max(res, right - left + 1);
//
//            right++;
//        }
//        return res;
        if (s == null || s.length() == 0) return 0;
//        if (s.length() == 1) return 1;
//
//        int sliceFront = 0;
//        int sliceBack = s.length();
//        String newSubString = s.substring(sliceFront, sliceBack);
//        int loopCount = 0;
//        int counter = 0;
//
//        while (counter != s.length()) {
//            if (hasDuplicate(newSubString)) {
//                return newSubString.length();
//            } else {
//                for (int count = 0; count < loopCount; count++) {
//                    newSubString = s.substring(++sliceFront, ++sliceBack);
//                    if (hasDuplicate(newSubString)) {
//                        return newSubString.length();
//                    }
//                }
//                sliceBack = newSubString.length() - 1;
//                sliceFront = 0;
//                newSubString = s.substring(sliceFront, sliceBack);
//                loopCount = s.length() - sliceBack;
//            }
//            counter++;
//        }
//
//        return 0;
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int count = 0, index = 0; count < n; count++) {
            if (map.containsKey(s.charAt(count))) {
                index = Math.max(map.get(s.charAt(count)), index);
            }
            ans = Math.max(ans, count - index + 1);
            map.put(s.charAt(count), count + 1);
        }
        return ans;
    }

    private boolean hasDuplicate(CharSequence value) {
        return value.length() == value.chars().distinct().count();
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0.0;
        if (nums1 == null || nums2 == null) return ans;
        if (nums1.length == 0 && nums2.length == 0) return ans;
        int[] concatArr = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, concatArr, nums1.length, nums2.length);
        Arrays.sort(concatArr);
        int reminder = concatArr.length / 2;
        if (concatArr.length % 2 != 0) {
            ans = concatArr[reminder];
        } else {
            ans = ((double) concatArr[reminder - 1] + (double) concatArr[reminder]) / 2;
        }
        return ans;
    }

    /* Maximum sum of a contiguous sub-array of size 3 */


    /*Given a string s, return the longest palindromic substring in s. */
    public String longestPalindrome(String s) {

        // MANUAL WAY
        /*
        * Create a method to return substring of an array
        * Create a method to check if a string is palindrome
        * return that substring;
        * */



        // EFFICIENT WAY
        /*
           * Use Sliding window algorithm to get substring of a string
           * Use set to find palindrome of a String
           * Return that string if it is a palindrome
         */
        return null;
    }

    public String getSubString(String s){
        int loopCount = getCountValue(s);
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < loopCount; index++){
            builder = new StringBuilder(s.substring(index, s.length() - index));
            System.out.println("Index " + builder);
        }
        return null;
    }

    private int getCountValue(String s) {
        if (s.length() % 2 == 0)
            return (s.length() / 2) * (1 + s.length());
        else
            return ((s.length() + 1 ) / 2) * (s.length());
    }
}
