import java.util.Scanner;

public class BinaryToDecimal {

    public static void getBinaryToDecimal(int n) {
        int pow = 0;
        int deci = 0;

        while (n != 0) {
            int r = n % 10;
            deci = deci + (r * (int) Math.pow(2, pow++));
            n = n / 10;
        }
        System.out.println("Decimal : " + deci);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number : ");
        int n = sc.nextInt();

        getBinaryToDecimal(n);

        sc.close();
    }

}
