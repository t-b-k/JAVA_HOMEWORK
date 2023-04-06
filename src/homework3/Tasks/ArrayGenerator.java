package homework3.Tasks;

import java.util.ArrayList;

public class ArrayGenerator {
    public static ArrayList<Integer> getArrayListOfInt (int maxLength, int minValue, int maxValue) {
        ArrayList<Integer> newArray = new ArrayList<>();
        int newArrayLength = (int)(Math.round(Math.random()*maxLength));
        for (int i = 0; i < newArrayLength; i++) {
            newArray.add((int)(Math.round(Math.random()*(maxValue-minValue))+minValue));
        }
        return newArray;
    }
}
