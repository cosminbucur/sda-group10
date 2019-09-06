package com.bucur.properties;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.stage.Stage;

public class DemoBidirectionalBinding extends Application {
    private static void useBidirectionalBinding() {
        SimpleStringProperty property1 = new SimpleStringProperty();
        SimpleStringProperty property2 = new SimpleStringProperty();

        property2.bindBidirectional(property1);

        property1.setValue("some new value");
        System.out.println(property2.getValue());

        property2.setValue("some other new value");
        System.out.println(property1.getValue());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        useBidirectionalBinding();
    }
}
