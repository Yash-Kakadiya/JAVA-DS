/*Question 2 : Write a program that reads a set of integers, and then prints the sum of the
even and odd integers. */

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0, oddSum = 0;
        do {
            System.out.print("Enter a number (0 to exit): ");
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.print("Do you want to continue? (1 for Yes, 0 for No): ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("--------------------------------------------");
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        sc.close();
    }
}
