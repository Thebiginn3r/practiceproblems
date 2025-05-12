package practice.problems;

public class Base {
    Hit baseNumber = new Hit();
    int hitType = baseNumber.powerPicker();

    public void basePicker(){
        if (hitType <= 2){
            System.out.println("You got a single");
        }else if (hitType == 3){
            System.out.println("You got a long single. Maybe you tripped out the box");
        }else if (hitType >= 4 && hitType <= 5){
            System.out.println("You got a Double");
        }else if (hitType == 6){
            System.out.println("You almost had a triple if you would've hussled");
        }else if (hitType >= 7 && hitType <= 8){
            System.out.println("You got a triple");
        }else if (hitType == 9){
            System.out.println("You almost got a homerun. WEIGHT ROOM!");
        }else if (hitType == 10) {
            System.out.println("GONE WITHOUT A DOUBT, SEE YA LATER BALL");
        }
        return;
    }

    @Override
    public String toString() {
        return "Base{" +
                "baseNumber=" + baseNumber +
                ", hitType=" + hitType +
                '}';
    }
}
