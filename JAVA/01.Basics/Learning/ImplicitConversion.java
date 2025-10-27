import java.util.Scanner;

public class ImplicitConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // (type conversion)/(widening conversion)/(implicit conversion)
        float num = sc.nextInt();
        System.out.println(num);

        sc.close();
    }
}