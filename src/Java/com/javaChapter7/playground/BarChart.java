package Java.com.javaChapter7.playground;

public class BarChart {
    public int generateBars(int[] arr) {
        int counter = 0;
        for (counter = 0; counter < arr.length; counter++) {
            if (counter == arr.length - 1)
                System.out.printf("%5d: ", counter * 10);
             else
                System.out.printf("%02d-%02d :", counter * 10, counter * 10 + 9);

                for (int star = 0; star < arr[counter]; star++) {
                    System.out.print("*");
                }

                System.out.println();

            }
            return counter * 10;
        }


    public static void main(String[] args) {
        BarChart myChart = new BarChart();
        int[] arr = new int[]{2, 4, 5, 6};
        myChart.generateBars(arr);
    }


}
