package com.bucur.containers;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoTwoColumnLayout extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox root = buildTwoColumnLayout();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private HBox buildTwoColumnLayout() {
        VBox column1 = new VBox();
        ObservableList<Node> column1Children = column1.getChildren();
        column1Children.add(new Label("element 1 , 1"));
        column1Children.add(new TextField("element 1 , 2"));

        VBox column2 = new VBox();
        ObservableList<Node> column2Children = column1.getChildren();
        column2Children.add(new Label("element 2 , 1"));
        column2Children.add(new TextField("element 2 , 2"));

        HBox root = new HBox();
        ObservableList<Node> rootChildren = root.getChildren();
        rootChildren.add(column1);
        rootChildren.add(column2);

        root.setSpacing(10);
        return root;
    }
}
