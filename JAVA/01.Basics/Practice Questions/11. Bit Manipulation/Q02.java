/*
 * Question 2 : Swap two numbers without using any third variable.
 */

public class Q02 {
    public static void main(String[] args) {
        int a = 19;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using XOR bitwise operator
        a = a ^ b; // Step 1: a now holds the XOR of a and b
        b = a ^ b; // Step 2: b is now original value of a
        a = a ^ b; // Step 3: a is now original value of b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
