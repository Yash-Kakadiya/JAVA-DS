public class FibonacciTerm {
    // 0 1 1 2 3 5 8 13 . . . //fib(term)
    // 0 1 2 3 4 5 6 7 . . . //term
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;
        int ans = fib(n);
        System.out.println("Fiboacci Term :" + ans);
    }
}
