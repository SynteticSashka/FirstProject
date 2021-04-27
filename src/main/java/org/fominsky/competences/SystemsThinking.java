package org.fominsky.competences;

import java.util.List;

public class SystemsThinking {

    public static double calculate(List<Double> incomingData) {
        double data = incomingData.get(1);
        if (data == 1.0) {
            //    System.out.println("Системное мышление: -1");
            return -1.0;
        } else if (data == 2.0) {
            //   System.out.println("Системное мышление: 0");
            return 0.0;
        } else if (data == 3.0) {
            //     System.out.println("Системное мышление: 0,5");
            return 0.5;
        } else if (data == 4.0) {
            //    System.out.println("Системное мышление: 1");
            return 1.0;
        } else {
            //    System.out.println("Вернулось говно из Системного мышления!");
            return (double) data;
        }
    }

} //системное мышление