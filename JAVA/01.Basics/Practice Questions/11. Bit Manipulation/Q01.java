/*
 * NOTE - Some of these questions will teach you somethingnewassomeof
these might be useful hacks (which can be difficult to think of on your
own). Even if you are not able to come up with a solution on your own. Try
to learn something new from these questions & writedownthelogicofthe
solution in your notes.

Question 1 : What is the value of x^x for any value of x?
 */

public class Q01 {
    public static void main(String[] args) {
        int x = 7;
        int result = x ^ x;
        System.out.println("The value of " + x + " ^ " + x + " is: " + result);
    }
}
