package Java.com.javaChapter7.dice_rolling;

public class MainClass {
    public static void main(String[] args) {
        DiceRolling newDice = new DiceRolling();

        int[] array = newDice.CombinationOfRollingDice();
        for(int count = 0; count < array.length; count++){
            if(count % 6 == 0){
                System.out.println();
            }
            System.out.printf("%d ", array[count]);

        }
    }
}
