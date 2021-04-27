package org.fominsky.gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import org.fominsky.gui.App;
import org.fominsky.gui.Utils;

public class SecondSceneController {
    private App rootApplication;

    @FXML
    private Text result1_lb;

    @FXML
    private Text result2_lb;

    @FXML
    private Text result3_lb;

    @FXML
    private Button back_bt;

    public void displayResult(String[] professions){
        result1_lb.setText(professions[0]);
        result2_lb.setText(professions[1]);
        result3_lb.setText(professions[2]);
    }

    public void setRootApplication(App rootApplication) {
        this.rootApplication = rootApplication;
    }

    @FXML
    void initialize() {
        Utils.setUpscaleAnim(back_bt);
        back_bt.setOnAction(e->rootApplication.setScene(0));
    }
}
