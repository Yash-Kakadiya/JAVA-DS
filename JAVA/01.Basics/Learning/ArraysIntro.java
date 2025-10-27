public class ArraysIntro {
    public static void main(String[] args) {

        int marks[] = new int[50];
        int[] scores = new int[100];

        int num[] = { 1, 2, 3 };
        String fruits[] = { "apple", "mango", "orange" };

        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 99;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        marks[0] = 100;
        System.out.println(marks[0]);

        System.out.println("Length of marks array: " + marks.length);

    }
}
