package Java.com.javaChapter7.byValueAndByReference;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class ByValueAndByReference {

    public static  int[] reverse(int[] list){
//        int[] result = new int[list.length];

//        for(int forward = 0, backward = result.length - 1; forward < list.length; forward++, backward--){
//            result[backward] = list[forward];
//        }
        for(int forward = 0, backward = list.length - 1; forward < list.length / 2 ; forward++, backward--){

            int temp = list[forward];
            list[forward] = list[backward];
            list[backward] = temp;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 4, 5, 6,6, 6, 7,8};
        int[] targetedArray = new int[sourceArray.length + 1];
        arraycopy(sourceArray, 0, targetedArray, 1, sourceArray.length);

        System.out.println(Arrays.toString(reverse(new int[]{2, 4, 5, 7, 8})));
    }
}
