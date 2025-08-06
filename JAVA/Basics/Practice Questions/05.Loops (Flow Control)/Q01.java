// Question 1 : How many times 'Hello' is printed?
public class Q01 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // i=0, i=3
            System.out.println("Hello" + i);
            i += 2;
        }
    }
}