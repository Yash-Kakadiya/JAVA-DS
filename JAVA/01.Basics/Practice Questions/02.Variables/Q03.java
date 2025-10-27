/*Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        float gst = 1.18f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of three items.");

        System.out.print("Enter cost of pencil: ");
        float pencilCost = sc.nextFloat() * gst;

        System.out.print("Enter cost of pen: ");
        float penCost = sc.nextFloat() * gst;

        System.out.print("Enter cost of eraser: ");
        float eraserCost = sc.nextFloat() * gst;

        float totalCost = pencilCost + penCost + eraserCost;
        System.out.println("---------------------------------------------------------------");
        System.out.println("The total cost of the items is: " + totalCost + " (including GST).");
        System.out.println("---------------------------------------------------------------");

        sc.close();
    }
}
