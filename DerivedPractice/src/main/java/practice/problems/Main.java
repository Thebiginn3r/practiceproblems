package practice.problems;

import java.util.Date;

public class Main {
    private Date year;

    // Constructor
    public void Car(Date year) {
        this.year = year;
    }

    // Regular method (not overriding anything)
    public void start() {
        System.out.println("Car is starting... JUJU");
    }

    // Optional: to test the method
    public static void main(String[] args) {
        Car myCar = new Car(new Date());
        myCar.start();
    }
}
