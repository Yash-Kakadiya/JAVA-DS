/*
 * Question 3 : Write a program to find Length of a String using Recursion.
 */
public class Q03 {
    public static int stringLength(String str) {
        // Base case: if the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }

        // Recursive case: return 1 + length of the substring excluding the first
        // character
        return 1 + stringLength(str.substring(1));
    }

    public static void main(String[] args) {
        String input = "Yash";
        int length = stringLength(input);
        System.out.println("The length of the string \"" + input + "\" is: " + length);
    }
}
