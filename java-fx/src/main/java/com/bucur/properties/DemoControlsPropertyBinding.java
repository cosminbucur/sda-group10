package com.bucur.properties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoControlsPropertyBinding extends Application {

    private static VBox useControlPropertyBinding() {
        TextField textField = new TextField();
        Label label = new Label();

        // take property from control
        textField.textProperty().bindBidirectional(label.textProperty());

        VBox root = new VBox();
        root.getChildren().add(textField);
        root.getChildren().add(label);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = useControlPropertyBinding();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
