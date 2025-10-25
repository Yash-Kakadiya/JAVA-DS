/*
 * Question 3 : Add 1 to an integer using Bit Manipulation.
(Hint: try using Bitwise NOT Operator)
 */

public class Q03 {
    public static void main(String[] args) {
        int n = 5;
        int result = -~n;
        System.out.println("The result of adding 1 to " + n + " is: " + result);
    }
}
