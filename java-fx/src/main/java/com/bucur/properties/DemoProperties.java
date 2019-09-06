package com.bucur.properties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoProperties extends Application {

    private static VBox buildBoxWithProperties() {
        VBox vBox = new VBox();

        TextField textField = new TextField("initial text value");
        System.out.println("initial value " + textField.getText());
        textField.setText("new value");

        vBox.getChildren().add(textField);
        return vBox;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = buildBoxWithProperties();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
