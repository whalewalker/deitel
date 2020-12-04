package Java.com.javaChapter5;

public class CalculatingTheProductOfOddIntegers {
    private long result;

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }
    int oddNumber = 1;
    public void getProductOfOdd(int userInput) {
        for (int i = 1; i < userInput; i+=2){
            oddNumber = oddNumber * i;
            result = oddNumber;
        }
    }

}
