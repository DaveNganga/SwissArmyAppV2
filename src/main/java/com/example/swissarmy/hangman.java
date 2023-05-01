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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class hangman {

    @FXML
    TextField textField = new TextField();
    @FXML
    TextField userN = new TextField();

    @FXML
    private Label output;

    int count = 0;


    public void compareContent() {
        String guessWord = textField.getText();
        // checks to see if the word is already a match and the game is won if it is
        String toGuessWord = "audio";
        boolean check1 = toGuessWord.equalsIgnoreCase(guessWord);
        // if the word is not a match a few more steps are undertaken before trying again
        // convert the strings to arrays and compare them and print out what is similar
        // in the toGuess word
        boolean progress = true;
        while (progress) {
            if (check1) {
                userN.setText("Congratulations you win");
            } else {
                count += 1;
                char[] compWord = toGuessWord.toCharArray();
                //System.out.println(compWord);
                char[] userWord = guessWord.toCharArray();
                Set<Character> hiddenWord = new HashSet<>();
                for (int i = 0; i < compWord.length; i++) {
                    hiddenWord.add(compWord[i]);

                }
                Set<Character> checkingWord = new HashSet<Character>();
                for (int i = 0; i < userWord.length; i++) {
                    checkingWord.add(userWord[i]);

                }
                Set<Character> similarChar = new HashSet<Character>(hiddenWord);
                similarChar.retainAll(checkingWord);
                String similarCharacSets = Arrays.toString(similarChar.toArray());
                userN.setText(similarCharacSets);

                if (count == 7) {
                    userN.setText("You lose this round please try again");
                    {
                        break;
                    }

                }
            }
//            else {
//                userN.setText("Please try again");
//            }

            }


        }

        @FXML
        private void Back (ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene main = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Swiss Army");
            stage.setScene(main);
            stage.show();
        }

    }






