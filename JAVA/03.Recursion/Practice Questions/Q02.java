/*
 * Question 2 :
You are given a number (eg -  2019), convert it into a String of english like
“two zero one nine”.  Use a recursive function to solve this problem.
NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
Sample Input : 1947
Sample Output : “one nine four seven”
 */
public class Q02 {
    public static String[] digitWords = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };

    public static void convertToWords(int number) {
        // Base case: if number is 0, return
        if (number == 0) {
            return;
        }

        // Recursive call with the number divided by 10
        convertToWords(number / 10);

        // Print the word corresponding to the last digit
        int lastDigit = number % 10;
        System.out.print(digitWords[lastDigit] + " ");
    }

    public static void main(String[] args) {
        int number = 2019;
        System.out.print("The number " + number + " in words is: ");
        convertToWords(number);
    }
}
