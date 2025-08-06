/* Question 1 : Write a Java method to compute the averageof three numbers. */

import java.util.Scanner;

public class Q01 {

    public static double computeAverage(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = sc.nextDouble();
        double average = computeAverage(n1, n2, n3);
        System.out.println("------------------------------------------------");
        System.out.println("The average of the three numbers is: " + average);

        sc.close();
    }
}
