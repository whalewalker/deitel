package Java.com.Chapter8.Practices;

import java.time.LocalTime;
import java.util.Scanner;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public void setTime(int hour, int min, int sec) {
        if(hour < 0 || hour > 24 || min < 0 || min > 60 || sec < 0 || sec > 60){
            throw new IllegalArgumentException("Hour, minute and / or second was out of range");
        }
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), min, sec, (hour < 12 ? "AM" : "PM"));
    }

    public String realTime() {
        LocalTime time = LocalTime.now();
        int hour = (time.getHour() == 12 || time.getHour() == 0) ? 12 : time.getHour() % 12;
        int min = time.getMinute();
        int sec = time.getSecond();
        String meridian = time.getHour() < 12 ? "AM" : "PM";
        return String.format("%d:%d:%d %s", hour, min, sec, meridian);
    }


    public static void main(String[] args) {
//        int largest = 0;
//        int count = 0;
//        while (count != 10){
//            Scanner scanner = new Scanner(System.in);
//            int times = count;
//            System.out.printf("Enter #%d:", times + 1);
//            int number = scanner.nextInt();
//            largest = getLargest(number);
//            count++;
//        }
//        System.out.println(largest);

//        int total = 0;
//
//        for (int i = 0; i <= 20; i += 2) {
//            total += i;
//        }
//        System.out.printf("%b %d", true,total);

    }

    public static int getLargest(int number){
        int largest = 0;
        if(largest > number){
            return largest;
        }else
            return number;
    }

}
