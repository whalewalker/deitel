package Java.com.dsa.algo;

/***
 * Have the function BracketCombinations(num)
 * read num which will be an integer greater
 * than or equal to zero, and return the number of
 * valid combinations that can be formed with num pairs of parentheses.
 * For example, if the input is 3, then the possible combinations
 * of 3 pairs of parenthesis, namely:
 * ()()(), are ()()(), ()(()), (())(), ((())), and (()()).
 * There are 5 total combinations when the input is 3,
 * so your program should return 5.
 */


public class BracketCombinations {
    public static int solution(int num) {
        return calFactorial(num) / calFactorial(num - 2);
    }

    private static int calFactorial(int num) {
        int factorial;
        for (factorial = 1; num > 1; num--){
            factorial *= num;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(BracketCombinations.solution(3));
    }
}
