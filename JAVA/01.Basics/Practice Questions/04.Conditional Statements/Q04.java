/*Question 4 : What will be the value of x & y in the following program: */

public class Q04 {
    public static void main(String[] args) {
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false; // false
        int y = (a > b) ? a : b; // 63

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
