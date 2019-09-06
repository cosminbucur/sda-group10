package com.bucur.events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoEventArgument extends Application {

    private static VBox buildBoxWithEventArgument() {
        TextField textField = new TextField();
        // EventHandler = functional interface
        textField.setOnKeyPressed(event -> handleOnKeyPressed(event));

        VBox root = new VBox();
        root.getChildren().add(textField);
        return root;
    }

    private static void handleOnKeyPressed(KeyEvent event) {
        System.out.println(event.getCode());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = buildBoxWithEventArgument();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
