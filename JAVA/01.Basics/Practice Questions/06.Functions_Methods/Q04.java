/*Question 4 : READ & CODE EXERCISE
Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( )
Free reading resource (https://www.geeksforgeeks.org/java/java-math-class/)
Please feel free to look for more resources/websites on your own. */

public class Q04 {
    public static void main(String[] args) {
        double a = -10.10, b = 77.7;

        System.out.println("Minimum of " + a + " and " + b + " is: " + Math.min(a, b));
        System.out.println("Maximum of " + a + " and " + b + " is: " + Math.max(a, b));
        System.out.println("Square root of " + b + " is: " + Math.sqrt(b));
        System.out.println("Power of " + a + " raised to 2 is: " + Math.pow(a, 2));
        // Note: Math.avg() does not exist in Java's Math class.
        System.out.println("Absolute value of " + a + " is: " + Math.abs(a));
    }
}
