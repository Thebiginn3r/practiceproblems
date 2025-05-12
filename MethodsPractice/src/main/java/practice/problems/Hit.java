package practice.problems;

import java.util.ArrayList;
import java.util.Collections;


public class Hit {
    private ArrayList<Integer> power;

    public Hit() {
        int[] powerLevel = {1,2,3,4,5,6,7,8,9,10};
       power = new ArrayList<>();
        for (int num : powerLevel) {
            power.add(num);
            //Hit hitPower = new power;
        }
        int pickedPower = power.get(0);
//        System.out.println("picked power level: " + pickedPower);
    }

    public int powerPicker(){
        Collections.shuffle(power);
        return power.get(0);
    }
}
