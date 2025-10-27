/*Question 4 : Determine if 2 Strings are anagrams of each other.
What are anagrams?
If two strings contain the same characters but in a different order, they can be said to be
anagrams. Consider race and care. In this case, race's characters can be formed into a study,
or care's characters can be formed into race. Below is a java program to check if two strings
are anagrams or not. */

public class Q04 {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        int n = str1.length();
        int asciiSum1 = 0, asciiSum2 = 0;
        for (int i = 0; i < n; i++) {
            asciiSum1 += str1.charAt(i);
            asciiSum2 += str2.charAt(i);
        }
        return asciiSum1 == asciiSum2;
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        if (isAnagram(str1, str2)) {
            System.out.println("Yes both strings are anagram.");
        } else {
            System.out.println("No both strings are not anagram.");
        }
    }
}
