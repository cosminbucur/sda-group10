package com.bucur;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoJavaFx extends Application {

    // java -jar DemoFx.jar username password
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFx Application");
        primaryStage.setWidth(400);
        primaryStage.setHeight(200);

        VBox vBox = new VBox();
        Label label = new Label("hello world");
        vBox.getChildren().add(label);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
