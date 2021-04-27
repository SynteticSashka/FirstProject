package org.fominsky.gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import org.fominsky.competences.CompetencesCalculator;
import org.fominsky.gui.App;
import org.fominsky.gui.Utils;
import org.fominsky.service.Profession;
import org.fominsky.service.Professions;
import org.fominsky.service.Tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstSceneController {
    private App rootApplication;

    @FXML
    private ChoiceBox<String> tim_cb;

    @FXML
    private ChoiceBox<String> engLevel_cb;

    @FXML
    private ChoiceBox<String> archetype_cb;

    @FXML
    private ChoiceBox<String> managementEdu_cb;

    @FXML
    private ChoiceBox<String> manage_cb;

    @FXML
    private Button calculate_bt;

    private void calculate(){
        List<Integer> chooseList = new ArrayList<>(5);
        // ТИМ (от 1 до 16)
        chooseList.add(tim_cb.getItems().indexOf(tim_cb.getValue()) + 1);

        // Есть ли знание языков? (0 – нет, 1 – да)
        chooseList.add(engLevel_cb.getItems().indexOf(engLevel_cb.getValue()));

        // Актуальный архетип - 1- ведьма, 2 - разведчик, 3 - защитник, 4 – амазонка. Более высокие - 4
        chooseList.add(archetype_cb.getItems().indexOf(archetype_cb.getValue()) + 1);

        // Есть ли образование по менеджменту? 0 - нет, 1 - неоконченное высшее, 2 - высшее, 3 - магистратура, 4 - MBA
        chooseList.add(managementEdu_cb.getItems().indexOf(managementEdu_cb.getValue()));

        // Есть ли управленческий опыт? 0 - нет, 1 - организовывал что-то, 2 - работал на управляющей позиции, 3 - среднее звено, 4 - топ-менеджмент
        chooseList.add(manage_cb.getItems().indexOf(manage_cb.getValue()));

        System.out.format("\tЗначения:\nТИМ:%d\nЯзык:%d\nАрхетип:%d\nОбразование менеджмента:%d\nОпыт менеджмента:%d\n\n",
                chooseList.get(0),
                chooseList.get(1),
                chooseList.get(2),
                chooseList.get(3),
                chooseList.get(4));

        /* РАССЧЕТ */
        ArrayList<Double> convertedList = Tools.convertData(chooseList);

        ArrayList<Double> competences = CompetencesCalculator.calculateCompetences(convertedList, chooseList);

        List<Profession> professions = Professions.calculateDamnedProfessions(competences);

        Collections.sort(professions);

        rootApplication.displayResult(professions);
        rootApplication.setScene(1);

    }

    public void setRootApplication(App rootApplication) {
        this.rootApplication = rootApplication;
    }

    @FXML
    void initialize() {
        Utils.setUpscaleAnim(calculate_bt);

        tim_cb.getItems().addAll(
                "ДК",
                "Дюма",
                "Робеспьер",
                "Гюго",
                "Жуков",
                "Есенин",
                "Максим",
                "Гамлет",
                "Джек",
                "Драйзер",
                "Бальзак",
                "Наполеон",
                "Штирлиц",
                "Достоевский",
                "Габен",
                "Гексли");
        tim_cb.setValue("ДК");

        engLevel_cb.getItems().addAll("Нет", "Да");
        engLevel_cb.setValue("Нет");

        archetype_cb.getItems().addAll(
                "Ведьма",
                "Разведчик",
                "Защитник",
                "Амазонка и далее");
        archetype_cb.setValue("Ведьма");

        managementEdu_cb.getItems().addAll(
                "Нет",
                "Неоконченное высшее",
                "Высшее",
                "Магистратура",
                "MBA");
        managementEdu_cb.setValue("Нет");

        manage_cb.getItems().addAll(
                "Нет",
                "Организовывал что-то",
                "Работал на управляющей позиции",
                "Среднее звено",
                "Топ-менеджмент");
        manage_cb.setValue("Нет");

        calculate_bt.setOnAction(e->calculate());
    }
}
