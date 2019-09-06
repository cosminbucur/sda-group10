package com.bucur.properties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DemoSliderPropertyBinding extends Application {

    private static HBox useSliderPropertyBinding() {
        Slider slider = new Slider();

        HBox root = new HBox();
        root.spacingProperty().bind(slider.valueProperty());

        root.getChildren().add(slider);
        root.getChildren().add(new Label("some label"));
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox root = useSliderPropertyBinding();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
