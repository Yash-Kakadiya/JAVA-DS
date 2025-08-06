/*Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321. */

import java.util.Scanner;

public class Q03 {

    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;

        while (temp > 0) {
            // rev *= (10 + temp % 10) => rev = (rev * 10) + (temp % 10) so ❎
            rev = rev * 10 + (temp % 10); // ✅
            temp /= 10;
        }

        return rev == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }

        sc.close();
    }
}
