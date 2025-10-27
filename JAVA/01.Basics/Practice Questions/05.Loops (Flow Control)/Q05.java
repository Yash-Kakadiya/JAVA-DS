/*Question 5 :
What is wrong in the following program? */
public class Q05 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        // System.out.println("i after the loop = " + i ); // This line will cause a
        // compilation error because 'i' is not defined outside the for loop.
    }
}
