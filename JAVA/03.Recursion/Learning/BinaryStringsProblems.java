/*Binary Strings Problem
    Print all binary strings of size N.
    Constraint: No two 1's are consecutive.
    Example: N=3
    Output: 000
            001
            010
            100
            101
*/

public class BinaryStringsProblems {
    public static void printBinaryStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }
}
