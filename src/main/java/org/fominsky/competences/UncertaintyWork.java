package org.fominsky.competences;

import java.util.List;

public class UncertaintyWork {
    public static double calculate(List<Double> convertedList) {
        //        System.out.println("Работа в условиях неопределённости: "+(double) org.fominsky.service.ConsoleApp.convertedList.get(4)/4);
        return (double) convertedList.get(4) / 4;
    }
} //работа в условиях неопределённости