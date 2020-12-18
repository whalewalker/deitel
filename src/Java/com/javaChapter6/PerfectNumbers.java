package Java.com.javaChapter6;

public class PerfectNumbers {

    public static boolean isPerfect(int number) {
        boolean isPerfectNumber = false;
        int sum = 0;
        for(int counter = 1; counter < number; counter++){
            if(number % counter == 0){
                sum += counter;
            }
        }
      if(sum == number){
          System.out.println(sum);
            isPerfectNumber = true;
        }
        return isPerfectNumber;
    }

    public static void loopThrough(){
        for (int count = 1; count <= 1000; count++){
           isPerfect(count);
        }
    }
}
