/*Question 5 :
Write a Java method to compute the sum of the digits in an integer.
(Hint : Approach this question in the following way :
a. Take a variable sum = 0
b. Find the last digit of the number
c. Add it to the sum
d. Repeat a & b until the number becomes 0 ) */

import java.util.Scanner;

public class Q05 {

    public static int computeSumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int sum = computeSumOfDigits(n);
        System.out.println("-----------------------------------------------");
        System.out.println("The sum of the digits in " + n + " is: " + sum);

        sc.close();
    }
}
