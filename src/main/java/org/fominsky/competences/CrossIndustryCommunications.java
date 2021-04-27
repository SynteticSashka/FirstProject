package org.fominsky.competences;

import java.util.List;

public class CrossIndustryCommunications {
    public static double calculate(List<Integer> chooseList) {
        int data = chooseList.get(0);
        if (data == 1 || data == 4 || data == 5 || data == 8 || data == 9 || data == 12 || data == 13 || data == 16) {
            //       System.out.println("Межотраслевые коммуникации: "+ 1.0);
            return 1.0;
        } else {
            //         System.out.println("Межотраслевые коммуникации: "+ 0.0);
            return 0.0;
        }
    }

} //межотраслевые коммуникации