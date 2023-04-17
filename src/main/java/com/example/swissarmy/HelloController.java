package com.example.swissarmy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void switchToTipCalculator(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tipCalculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("tipCalculator");
        stage.setScene(scene);
        stage.show();
    }

}