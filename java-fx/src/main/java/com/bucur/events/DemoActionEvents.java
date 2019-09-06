package com.bucur.events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoActionEvents extends Application {

    private static VBox buildBoxWithActionEvent() {
        Button button = new Button("Press me");
        // EventHandler = functional interface
        button.setOnAction(event -> System.out.println("click!"));

        VBox root = new VBox();
        root.getChildren().add(button);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = buildBoxWithActionEvent();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
