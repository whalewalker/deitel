package Java.com.javaChapter5;

public class CalculatingTheValueOfPie {
    public void calculatePie(){
        double pie = 0;
        double firstPie = 0;
        int constVal = 4;
        for(int counter = 1; counter <= 200000; counter++){
            int odd = counter + 2;
            if(counter == 1){
                firstPie = constVal - (constVal / odd);
            }
            pie += firstPie;
        }
        System.out.println(pie);
    }

    public static void main(String[] args) {
        CalculatingTheValueOfPie mypie = new CalculatingTheValueOfPie();
    mypie.calculatePie();
    }
}
