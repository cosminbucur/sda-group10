package com.bucur.properties;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.stage.Stage;

public class DemoChangeListener extends Application {
    private static void usePropertyChangeListener() {
        SimpleStringProperty stringProperty = new SimpleStringProperty("abc");
        System.out.println(stringProperty.getValue());

        // add listener - action that will run if property value changes
        stringProperty.addListener((observable, oldValue, newValue) -> {
            System.out.println("new value is set " + newValue);
        });

        stringProperty.setValue("some new value");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        usePropertyChangeListener();
    }
}
