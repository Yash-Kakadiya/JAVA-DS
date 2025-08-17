/*Question 1 : Count how many times lowercase vowels occurred in a String entered by the user. */

import java.util.Scanner;

public class Q01 {
    public static int getVowelCount(String str) {
        str = str.toLowerCase();
        int n = str.length();
        int vowelsCount = 0;
        for (int i = 0; i < n; i++) {
            if ("aeiou".contains(str.charAt(i) + ""))
                vowelsCount++;
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int vowelsCount = getVowelCount(str);
        System.out.println(str + " contains " + vowelsCount + " vowels.");
    }
}
