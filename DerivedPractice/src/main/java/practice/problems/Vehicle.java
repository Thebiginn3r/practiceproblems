package practice.problems;

public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start(){
        System.out.println(brand + " is a competing brand");
    }
}
