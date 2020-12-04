package Java.com.javaChapter5;

public class Factorials {
    private long result;

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }



    int factorial = 1;
    public void generateFactorial(int userInput) {

        if (userInput > 0 && userInput <= 20) {

            for (int counter = 1; counter <= userInput; counter++) {

                factorial *= counter;

            }

            result = factorial;

        }

    }

}



