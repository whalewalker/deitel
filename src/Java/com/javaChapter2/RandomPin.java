package Java.com.javaChapter2;

public class RandomPin {
    int pin;

    public static void main(String[] args) {
        double rand = Math.random()*9999;
        System.out.printf("Pin : %.0f", rand);
        if(rand == rand){
            System.out.printf("\nPin is correct :  %.0f", rand);
        }
        long acctNum = (long)(Math.random()*10000000000L);
        System.out.printf("\nAccountNumber : %d", acctNum);
        if(acctNum == acctNum){
            System.out.printf("\nAccountNumber is correct :  %d", acctNum);
        }
    }
//    public int generatePin(){
//
//    }
}
