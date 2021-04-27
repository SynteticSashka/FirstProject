package org.fominsky.gui;

import javafx.scene.Node;

public class Utils {
    public static void setUpscaleAnim(Node... nodes){
        for (Node node : nodes){
            node.setOnMouseEntered(e->{
                node.setScaleX(1.05);
                node.setScaleY(1.07);
            });
            node.setOnMouseExited(e->{
                node.setScaleX(1);
                node.setScaleY(1);
            });
        }
    }
}
