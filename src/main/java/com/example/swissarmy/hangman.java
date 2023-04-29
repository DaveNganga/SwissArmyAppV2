package com.example.swissarmy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class hangman {

    @FXML
    TextField textField = new TextField();


    @FXML
    private Label counts;
    @FXML
    private Label output;

    int count = 0;

    @FXML
    String toGuessWord = "cactus";


    @FXML
    private void checkGuess(ActionEvent event) {
        String guessWord = textField.getText();

        // checks to see if the word is already a match and the game is won if it is
        boolean check1 = toGuessWord.equalsIgnoreCase(guessWord);
        // if the word is not a match a few more steps are undertaken before trying again
        // convert the strings to arrays and compare them and print out what is similar
        // in the toGuess word
        if (check1) {
            output.setText("Congratulations you win");
        } else {
            count++;
            output.setText("Please try again");
            // https://stackoverflow.com/questions/32262059/java-find-element-in-array-using-condition-and-lambda
            // https://www.digitalocean.com/community/tutorials/java-array-contains-value
            char[] array1 = toGuessWord.toCharArray();
            char[] array2 = guessWord.toCharArray();
        }
        counts.setText("Counts: " + count);
    }


    @FXML
    private void goBack(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene main = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Swiss Army");
        stage.setScene(main);
        stage.show();
    }
}
