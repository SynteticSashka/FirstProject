package org.fominsky.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.fominsky.gui.controllers.*;
import org.fominsky.service.Profession;

import java.util.List;

public class App extends Application {
    private FirstSceneController firstSceneController;
    private SecondSceneController secondSceneController;
    private Scene firstScene, secondScene;
    private Stage root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader firstSceneLoader = new FXMLLoader(App.class.getResource("/graphics/FirstScene.fxml"));
        FXMLLoader secondSceneLoader = new FXMLLoader(App.class.getResource("/graphics/SecondScene.fxml"));

        firstScene = new Scene(firstSceneLoader.load(),800,700);
        secondScene = new Scene(secondSceneLoader.load(),800,700);

        firstSceneController = firstSceneLoader.getController();
        secondSceneController = secondSceneLoader.getController();

        primaryStage.setTitle("Выбор профессии");
        primaryStage.setScene(firstScene);
        primaryStage.setResizable(false);
        primaryStage.show();
        root = primaryStage;

        firstSceneController.setRootApplication(this);
        secondSceneController.setRootApplication(this);
    }

    public void setScene(int sceneNum){
        if(sceneNum == 0){
            root.setScene(firstScene);
        }else{
            root.setScene(secondScene);
        }
        root.show();
    }

    public void displayResult(List<Profession> professions){
        String[] mass = new String[3];

        for (int i = 0; i < 3; i++) {
            Profession current = professions.get(i);
            mass[i] = String.format("Самая подходящая профессия: %s. Она подходит вам на %d%%.\n\n" +
                            "%s\n\nМаксимум вы можете набрать в этой профессии %d%% из 100 возможных. %s\n\n",
                    current.getName(),
                    current.getConformity(),
                    current.getDescription(),
                    current.getMaxConformity(),
                    current.getExplanation());
        }

        secondSceneController.displayResult(mass);// Отобразить в SecondScene
    }

}
