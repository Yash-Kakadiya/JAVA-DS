/*package OOPS.Practice Questions;
A. Driving vehicle
B. Driving electric car
C. Driving car
D. The code does not compile
 */

public class Q02 {
    public static void main(String[] wheels) {
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}

class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Driving electric car";
    }
}