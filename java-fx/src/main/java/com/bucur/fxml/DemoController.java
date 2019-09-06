package com.bucur.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DemoController {

    @FXML
    private TextField textField;

    // initialize components in controller
    @FXML
    private void initialize() {
        System.out.println("controller is initialized");
        textField.setText("controller says hi!");
    }

    @FXML
    private void onButtonClick() {
        System.out.println("click!");
    }
}
