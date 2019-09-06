package com.bucur;

import javafx.application.Application;
import javafx.stage.Stage;

public class DemoLifeCycle extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("init");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("starting app");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop");
    }
}
