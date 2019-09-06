package com.bucur.containers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DemoGridPane extends Application {

    private static GridPane buildGridPane() {
        GridPane root = new GridPane();
        root.add(new TextField("element 1, 1"), 0, 0);
        root.add(new Label("element 1, 2"), 1, 0);
        root.add(new Label("element 2, 1"), 0, 1);
        root.add(new TextField("element 2, 2"), 1, 1);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = buildGridPane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
