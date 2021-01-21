package Java.com.javaChapter7.playground;

public class ArrayLoop {


    public static void main(String[] args) {
        int [][] newArr1 = {{2, 4, 7,}, {3, 6, 7}, {3, 56, 7}};
        int [][] newArr2 = {{2, 4}, {3, 6, 7}, {56}};

        System.out.println("value in array1 by row are");
        outputArray(newArr1);

        System.out.printf("%nvalue in array1 by row are%n");
        outputArray(newArr2);
    }

    public static void outputArray(int [][] arr){
        for(int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                System.out.printf("%d ", arr[row][column]);
            }
            System.out.println();

        }
        for(int[] array : arr){
            for(int arrayItem : array){
                System.out.printf("%d ", arrayItem);
            }
            System.out.println();
        }
    }

}
