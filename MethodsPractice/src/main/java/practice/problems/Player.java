package practice.problems;

public class Player {
    private double height;
    private int weight;
    private String position;
    private String name;
    private int batLength;

    public Player(double height, int weight, String position, String name, int batLength) {
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.name = name;
        this.batLength = batLength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "height=" + height +
                ", weight=" + weight +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", batLength=" + batLength +
                '}';
    }
}
