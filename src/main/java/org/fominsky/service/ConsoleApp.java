package org.fominsky.service;

import org.fominsky.competences.CompetencesCalculator;
import java.util.*;

public class ConsoleApp {
    private static List<Integer> chooseList;
    private static List<Double> convertedList;
    private static List<Double> competences;
    private static List<Profession> professions;

    public static void main (String[] args) {
        // ==========================================
        //   ВВОДИМ ДАННЫЕ! Пока что ручками.
        // ==========================================
        chooseList = new ArrayList<>();
        chooseList.add(16); // ТИМ (от 1 до 16)
        chooseList.add(0); // Есть ли знание языков? (0 – нет, 1 – да)
        chooseList.add(2); // Актуальный архетип - 1- ведьма, 2 - разведчик, 3 - защитник, 4 – амазонка. Более высокие - 4
        chooseList.add(0); // Есть ли образование по менеджменту? 0 - нет, 1 - неоконченное высшее, 2 - высшее, 3 - магистратура, 4 - MBA
        chooseList.add(0); //	Есть ли управленческий опыт? 0 - нет, 1 - организовывал что-то, 2 - работал на управляющей позиции, 3 - среднее звено, 4 - топ-менеджмент

        convertedList = new ArrayList<>(Tools.convertData(chooseList)); //вернулись конвертированные данные
        competences = new ArrayList<>(CompetencesCalculator.calculateCompetences(convertedList,chooseList)); //вернулся список значений компетенций
        professions = new ArrayList<>(Professions.calculateDamnedProfessions(competences));
        Collections.sort(professions);

        for (int i =0; i<14; i++){
            System.out.println("Самая подходящая профессия: " + professions.get(i).name + ". Она подходит вам на " + professions.get(i).conformity + "%.");
            System.out.println(professions.get(i).description);
            System.out.println("Максимум вы можете набрать в этой профессии " + professions.get(i).maxConformity + "% из 100 возможных.");
            System.out.println(professions.get(i).explanation);
            System.out.println(" ");
            System.out.println("______________________________________________________________________________");
            System.out.println(" ");
        }
    }

    public static List<Integer> getChooseList() {
        return chooseList;
    }

    public static List<Double> getConvertedList() {
        return convertedList;
    }
}
