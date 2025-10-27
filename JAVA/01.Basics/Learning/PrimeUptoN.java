import java.util.Scanner;

public class PrimeUptoN {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeupto(int n) {
        for (int i = 1; i <= n; i++) {
            isPrime(i);
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Upto which you want to print Prime Numbers: ");
        int n = sc.nextInt();
        System.out.println("------------------------------------------------");
        primeupto(n);

        sc.close();
    }

}
