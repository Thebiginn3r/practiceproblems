package practice.problems;

public class Main {

    public static void main(String[] args) {
        Player newPlayer = new Player(57, 187, "Right fielder", "Alejondro", 33);
        System.out.println(newPlayer);
        Hit myplayerhit = new Hit();
        System.out.println("Random power pick " + myplayerhit.powerPicker());
        Base baseLanding = new Base();
        baseLanding.basePicker();

    }
}
