package Java.com.dsa.algo;



    /*
    You are given a string with just two types of bracket characters in it - '(' and ')'.
    Write a function that takes that string as an input
    and returns a boolean indicating whether the string is balanced or not.
    A string is considered balanced if all the open-parenthesis characters
    '(' have a matching close-parenthesis
    character and all of them are correctly nested and syntactically correct.
    Example: given the string
     () => the answer is true
     ((())) => the answer is true
     (()()()) => the answer is true
     (((( => the answer is false
     )(
        => the answer is false
    Your code should work for all possible test cases and should have good time-complexity
    */


public class Bracket {

    public boolean isValidBracket(String num) {
        if (num == null) throw new NullPointerException("String cannot be null");
        if (num.trim().equals("")) return false;
        if (num.length() % 2 == 1) return false;
        if (num.charAt(0) == ')') return false;

//        Stack<Character> charArr = new ArrayStack<>();
//
//       for (int index = 0; index < num.length(); index++){
//           if (num.charAt(index) == '('){
//               charArr.push(num.charAt(index));
//           }else  {
//               charArr.pop();
//           }
//       }

        int rightCounter = 0, leftCounter = 0;

        for (int index = 0; index < num.length(); index++) {
            if (num.charAt(index) == '(') {
                rightCounter++;
                leftCounter--;
            } else {
                rightCounter--;
                leftCounter++;
            }
        }
        return (leftCounter == 0 && rightCounter == 0);
    }
}
