/*Question 2: In a program, input the side of a square. You have to output the area of the
square.
(Hint : area of a square is (side x side)) */

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();

        double area = side * side;
        System.out.println("---------------------------------------------------------------");
        System.out.println("The area of the square with side " + side + " is: " + area + " square units.");
        System.out.println("---------------------------------------------------------------");

        sc.close();
    }
}
