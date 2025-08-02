/*Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N) */

import java.util.Scanner;

public class Q01 {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers.");

        System.out.print("Enter number for A: ");
        double A = sc.nextDouble();
        System.out.print("Enter number for B: ");
        double B = sc.nextDouble();
        System.out.print("Enter number for C: ");
        double C = sc.nextDouble();

        System.out.println("-----------------------------------------------");
        double average = (A + B + C) / 3;
        System.out.println("The average of the three numbers is: " + average);
        System.out.print("-----------------------------------------------");

        sc.close();
    }
}