package org.fominsky.competences;

import java.util.List;

public class Multiculturalism {
    public static double calculate(List<Integer> chooseList,List<Double> convertedList) {
        int data = chooseList.get(0);
        double result;
        if (data == 1 || data == 4 || data == 5 || data == 8 || data == 9 || data == 12 || data == 13 || data == 16)
            data = 1;
        else data = 0;
        result = (double) (convertedList.get(8) + data) / 2;
        return result;
    }
} //мультикутурность