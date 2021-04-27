package org.fominsky.competences;

import java.util.List;

public class CustomerFocus {
    public static double calculate(List<Integer> chooseList) {
        int data = chooseList.get(0);
        if (data == 1 || data == 5 || data == 11 || data == 15) data = 1; //одномерная этика в ментальном кольце
        if (data == 3 || data == 7 || data == 13 || data == 9) data = 2; //двухмерная этика в ментальном кольце
        if (data == 2 || data == 6 || data == 12 || data == 16) data = 3; //трёхмерная этика в ментальном кольце
        if (data == 4 || data == 8 || data == 10 || data == 14) data = 4; //четырёхмерная этика в ментальном кольце
        //    System.out.println("Клиентоориентированность: "+(double) data / 4);
        return (double) data / 4;
    }

} //клиентоориентированность
