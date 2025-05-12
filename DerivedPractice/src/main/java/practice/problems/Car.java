package practice.problems;

import java.util.Date;

public abstract class Car extends Vehicle {
    public Car(String name) {
        this.name();

    }

    public Car(Date year) {
        super(brand);
    }

    @Override
    public void start(){
        System.out.println(start + "JUJU");
    }
}
