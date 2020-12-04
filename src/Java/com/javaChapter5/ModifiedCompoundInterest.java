package Java.com.javaChapter5;

public class ModifiedCompoundInterest {
    public void CalculateInterest(){

    }

    public int interestRate(int amount, int rate){
        int interest = 1;
        int compound = 0;

        for (int counter = 0; counter < 5; counter++){
            compound = (int)(amount * Math.pow(interest + 1, rate));
            interest += 1;

        }
        return compound;
    }

    public void Dollar(){
        int dollar = 450;
        dollar *= interestRate(1000, 2);
        System.out.println(dollar);
    }


    public void Cent(){
        double cent = 4.5;
        cent *= interestRate(1000, 2);
        System.out.println(cent);
    }

    public static void main(String[] args) {
        ModifiedCompoundInterest myInterest = new ModifiedCompoundInterest();
        myInterest.Dollar();
        myInterest.Cent();
    }
}
