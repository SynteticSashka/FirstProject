package org.fominsky.service;

import java.util.*;

public class Tools {

    public static ArrayList<Double> convertData(List<Integer> list) {
        /*
        Последовательность тимных особенностей - ЧЛ, БЛ, ЧЭ, БЭ, ЧИ, БИ, ЧС, БС
         */
        ArrayList<Double> convertedList = new ArrayList<>();
        int tim = list.get(0);
        switch (tim) {
            case (1): //ДК
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                break;
            case (2): //Дюма
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                break;
            case (3): //Робеспьер
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                break;
            case (4): //Гюго
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                break;
            case (5): //Жуков
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                break;
            case (6): //Есенин
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                break;
            case (7): //Максим
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                break;
            case (8): //Гамлет
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                break;
            case (9): //Джек
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                break;
            case (10): //Драйзер
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                break;
            case (11): //Бальзак
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                break;
            case (12): //Наполеон
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                break;
            case (13): //Штирлиц
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                break;
            case (14): //Достоевский
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                break;
            case (15): //Габен
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(2.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                break;
            case (16): //Гексли
                convertedList.add(2.0);
                convertedList.add(1.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(4.0);
                convertedList.add(3.0);
                convertedList.add(2.0);
                convertedList.add(1.0);
                break;
        }
        convertedList.add(Double.valueOf(list.get(1))); //знание языков
        convertedList.add((double) (list.get(2)/4)); //активный архетип: 1- ведьма, 2 - разведчик, 3 - защитник, 4 - амазонка, все более высокие - 4
        convertedList.add((double) (list.get(3)/4)); //образование в сфере менеджмента: 0 - нет, 1 - неоконченное высшее, 2 - высшее, 3 - магистратура, 4 - MBA
        convertedList.add((double) (list.get(4)/4)); //опыт в сфере менеджмента: 0 - нет, 1 - организовывал что-то, 2 - работал на управляющей позиции, 3 - среднее звено, 4 - топ-менеджмент

        return convertedList;

    }

    public static int percentage (double d){
        double c = d*100;
        int result = (int) c;
        return result;
    }

}
