/*Question 3 : Look at the following code and choose the right option for the word:
a. Only protected can be used.
B. public and protected both can be used.
c. public, protected, and private can be used.
d. Only public can be used.
 */
public class Q03 {

}

class Shape {
    protected void display() {
        System.out.println("Display-base");
    }
}

class Circle extends Shape {
    // < access - modifier > void display() {
    //     System.out.println("Display-derived");
    // }
}