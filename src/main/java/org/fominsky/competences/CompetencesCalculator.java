package org.fominsky.competences;

import org.fominsky.service.*;
import java.util.ArrayList;
import java.util.List;

public class CompetencesCalculator {

    //private static final List<Double> incomingData = new ArrayList<>(convertedList);

    public static ArrayList<Double> calculateCompetences(List<Double> convertedList, List<Integer> chooseList) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(SystemsThinking.calculate(convertedList));
        list.add(Programming.calculate(convertedList));
        list.add(ProjectsManagement.calculate(convertedList));
        list.add(CustomerFocus.calculate(chooseList));
        list.add(UncertaintyWork.calculate(convertedList));
        list.add(Creativity.calculate(convertedList));
        list.add(CrossIndustryCommunications.calculate(chooseList));
        list.add(Multiculturalism.calculate(chooseList, convertedList));
        list.add(Sociability.calculate(convertedList));
        list.add(LeanProduction.calculate(convertedList));
        return list;
    }
    /*
    Последовательность тимных особенностей - ЧЛ, БЛ, ЧЭ, БЭ, ЧИ, БИ, ЧС, БС
     */
}
