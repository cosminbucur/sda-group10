package com.bucur.containers;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoListView extends Application {

    private static VBox buildListView() {
        ListView<String> listView = new ListView<>();
        ObservableList<String> items = listView.getItems();
        items.add("el 1");
        items.add("el 2");
        items.add("el 3");

        VBox root = new VBox();
        root.getChildren().add(listView);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = buildListView();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
