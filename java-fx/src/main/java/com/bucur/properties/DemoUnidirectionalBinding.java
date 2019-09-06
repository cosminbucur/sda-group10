package com.bucur.properties;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.stage.Stage;

public class DemoUnidirectionalBinding extends Application {
    private static void useUnidirectionalBinding() {
        SimpleStringProperty property1 = new SimpleStringProperty("abc");
        SimpleStringProperty property2 = new SimpleStringProperty();

        // property 2 will follow property 1 value
        property2.bind(property1);
        property1.setValue("some new value");
        // will change property 2 value as well
        System.out.println(property2.getValue());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        useUnidirectionalBinding();
    }
}
