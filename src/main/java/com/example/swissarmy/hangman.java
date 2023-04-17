package com.example.swissarmy;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class hangman {

    @FXML
    TextField textField = new TextField();


    @FXML
    Label counts;

    int count = 0;

    @FXML
    String setWord = "cactus";
    String guessWord = textField.getText();

    








}
