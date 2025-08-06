/*Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method. */

import java.util.Scanner;

public class Q02 {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("------------------------------------------------");
        if (isEven(n)) {
            System.out.println("The number " + n + " is even.");
        } else {
            System.out.println("The number " + n + " is odd.");
        }

        sc.close();
    }
}
