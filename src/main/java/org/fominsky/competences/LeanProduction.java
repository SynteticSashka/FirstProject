package org.fominsky.competences;

import java.util.List;

public class LeanProduction {
    public static double calculate(List<Double> convertedList) {
        double data1 = (double) convertedList.get(10) / 4;
        double data2 = (double) convertedList.get(11) / 4;
        //System.out.println("Бережливое производство: "+(data1+data2)/2);
        return (data1 + data2) / 2;
    }

} //бережливое производство
