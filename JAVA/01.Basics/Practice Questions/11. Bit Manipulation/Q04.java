/*
 * Question 4 : Convert uppercase characters to lowercase using bits.
 */

public class Q04 {
    public static void main(String[] args) {
        char uppercaseChar = 'A'; // Example uppercase character
        char lowercaseChar = (char) (uppercaseChar | ' '); // Set the 6th bit to convert to lowercase

        System.out.println("Uppercase Character: " + uppercaseChar);
        System.out.println("Lowercase Character: " + lowercaseChar);
    }
}
