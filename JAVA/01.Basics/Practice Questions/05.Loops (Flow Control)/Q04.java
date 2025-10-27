/*Question 4 : Write a program to print the multiplication table of a number N, entered by the
user. */

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int n = sc.nextInt();

        System.out.println("------------------------------------");
        System.out.println("Multiplication table of " + n + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        System.out.println("------------------------------------");

        sc.close();
    }
}
