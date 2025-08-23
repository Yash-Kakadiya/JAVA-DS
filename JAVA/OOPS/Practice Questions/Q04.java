/* Question 4 : What is the output of the following program?
A. 23451
B. 12354
C. 13245
D. The code does not compile.
*/
public class Q04 {
    public static void main(String[] gears) {
        new BlueCar();
    }
}

abstract class Car {
    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

class BlueCar extends Car {
    {
        System.out.print("4");
    }

    public BlueCar() {
        super("blue");
        System.out.print("5");
    }

}