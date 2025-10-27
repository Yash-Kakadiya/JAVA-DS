public class Strings {
    public static void printLetters(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt((n - 1) - i)) {
                // not Palindrome
                return false;
            }
        }
        return true;
    }

    public static double getShortestPath(String path) {
        String finalPath = path.toLowerCase();
        int n = finalPath.length();
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            char direction = finalPath.charAt(i);
            switch (direction) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;
                default:
                    System.out.println("Ignoring invalid direction!");
                    break;
            }
        }
        // Displacement = ((x2-x1)^2+(y2-y1)^2)^1/2
        // here x1, y1 = 0
        // so Displacement = (x2^2+y2^2)^1/2
        return Math.sqrt((x * x) + (y * y));
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr = substr + str.charAt(i);
        }
        return substr;
    }

    public static String toUpperCase(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ' && i < n - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compressString(String str) {
        int n = str.length();

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            Integer count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static String decompressString(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz@#1234");

        // // Strings are IMMUTABLE but StringBuilder is MUTABLE

        // Scanner sc = new Scanner(System.in);

        // String name;
        // System.out.println("Enter Name : ");
        // name = sc.nextLine();
        // System.out.println(name);
        // System.out.println("---------------------------------------------");
        // //String Length;
        // String fullName="Tony Stark";
        // System.out.println(fullName.length());

        // Concatenation
        String firstName = "Yash";
        String lastName = "Kakadiya";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println("---------------------------------------------");

        // charAt (character at particular index)
        System.out.println(fullName.charAt(2));
        printLetters(fullName);
        System.out.println("---------------------------------------------");

        // Palindrome String
        String str3 = "racecar";
        System.out.println(isPalindrome(str3));

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        System.out.println("---------------------------------------------");

        String path = "WNEENESENNN";
        System.out.println("Shortest path of " + path + " :" + getShortestPath(path));

        System.out.println("---------------------------------------------");

        // Comparision using == (compare at object level)
        if (s1 == s2) {
            System.out.println("Strings Are Equal");
        } else {
            System.out.println("Strings Are Not Equal");
        }
        if (s1 == s3) {
            System.out.println("Strings Are Equal");
        } else {
            System.out.println("Strings Are Not Equal");
        }
        System.out.println("---------------------------------------------");

        // Comparision using equals method (compares value)
        if (s1.equals(s2)) {
            System.out.println("Strings Are Equal");
        } else {
            System.out.println("Strings Are Not Equal");
        }
        if (s1.equals(s3)) {
            System.out.println("Strings Are Equal");
        } else {
            System.out.println("Strings Are Not Equal");
        }
        System.out.println("---------------------------------------------");

        // substring
        String s = "HelloWorld";
        // using user defined method
        System.out.println(substring(s, 0, 5));

        // using predefined method
        System.out.println(s.substring(0, 5));
        System.out.println("---------------------------------------------");

        // compareTo and compareToIgnoreCase method
        String fruits[] = { "apple", "mango", "banana", "Z" };

        // Lexicographical Comparision
        // aab < e
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("Lexicographically largest string: " + largest);
        System.out.println("---------------------------------------------");

        // StringBuilder (MUTABLE)
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        } // abcdefghijklmnopqrstuvwxyz

        System.out.println(sb);
        System.out.println("---------------------------------------------");

        // uppercase, lowercase
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println("---------------------------------------------");

        // Que: covert first letter of every word to uppercase
        String st = "hi, i am yash";
        System.out.println(toUpperCase(st));
        System.out.println("---------------------------------------------");

        // Que: String Compression e.g.:"aaabbcccdd" -> "a3b2c3d2"
        String scom = "aaabbcccdd";
        System.out.println(compressString(scom));
        System.out.println("---------------------------------------------");
    }
}