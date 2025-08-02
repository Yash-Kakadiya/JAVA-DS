// Question : What will be the output of the following programs :

public class Questions {
    public static void main(String[] args) {
        int x, y, z;
        int a, b, c;
        int exp1, exp2;

        // Question 1
        x = 2;
        y = 5;
        exp1 = (x * y / x);
        // (2*5*2)
        // 10/2
        // 5
        exp2 = (x * (y / x));
        // (2*(5/2))
        // 2*2
        // 4
        System.out.print(exp1 + " , " + exp2);

        // Question 2
        x = 200;
        y = 50;
        z = 100;
        if (x > y && y > z) { // 200>50 but 50 is not greater than 100
            System.out.println("Hello");
        }
        if (z > y && z < x) { // 100>50 and 100<200
            System.out.println("Java");
        }
        if ((y + 200) < x && (y + 150) < z) { // (50+200) is not less than 200 so false
            System.out.println("Hello Java");
        }

        // Question 3
        x = y = z = 2;
        x += y; // x = 4
        y -= z; // y = 0
        z /= (x + y); // z = 0
        System.out.println(x + ", " + y + ", " + z);

        // Question 4
        x = 9;
        y = 12;
        a = 2;
        b = 4;
        c = 6;
        exp1 = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
        // The expression is evaluated as follows:
        // 4/3*(9+34)+9*(2+4*6)+(3+12*(2+2))/(2+4*12)
        // 4/3*43+9*26+(3+12*4)/50
        // 4/3*43+9*26+51/50
        // 1*43+234+1
        // 43+234+1
        // 278
        System.out.println(exp1);

        // Question 5
        x = 10;
        y = 5;
        exp1 = (y * (x / y + x / y));
        exp2 = (y * x / y + y * x / y);

        // The first expression calculates y * (x / y + x / y)
        // 5 * (10 / 5 + 10 / 5)
        // 5 * (2 + 2)
        // 5 * 4
        // 20

        // The second expression calculates (y * x / y + y * x / y)
        // (5 * 10 / 5 + 5 * 10 / 5)
        // (50 / 5 + 50 / 5)
        // (10 + 10)
        // 20
        System.out.println(exp1);
        System.out.println(exp2);
    }
}