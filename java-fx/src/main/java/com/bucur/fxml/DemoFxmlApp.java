package com.bucur.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DemoFxmlApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = buildSceneFromFxml();
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Scene buildSceneFromFxml() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view.fxml"));

        Scene scene = new Scene(root);
        return scene;
    }
}
