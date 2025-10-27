/*
 * Question 4 : We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character.
Sample Input 1 : S = "abcab"
Sample Output 1 : 7
There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
Out of the above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7 contiguous substrings start and end with the same character.
Sample Input 2 : S = "aba"
Sample Output 2 : 4
The substrings are a, b, a and aba.

 */
public class Q04 {
    public static int countSubstrings(String str, int start, int end) {
        // Base case: if the string length is 0 or 1
        if (start > end) {
            return 0;
        }
        if (start == end) {
            return 1; // Single character substrings
        }

        // Count substrings starting and ending with the same character
        int count = 0;
        if (str.charAt(start) == str.charAt(end)) {
            count = 1;
        }

        // Recursive calls for substrings excluding the first and last characters
        return count + countSubstrings(str, start + 1, end) + countSubstrings(str, start, end - 1) - countSubstrings(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "abcab";
        int result = countSubstrings(input, 0, input.length() - 1);
        System.out.println("The count of contiguous substrings starting and ending with the same character in \""
                + input + "\" is: " + result);
    }
}
