package com.example.swissarmy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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


    @FXML
    private int count = 0;

    String guessWord = textField.getText();
    // checks to see if the word is already a match and the game is won if it is
    String toGuessWord = "audio";


    // loads the images depending on if the user guesses wrong
    // https://gist.github.com/SedaKunda/79e1d9ddc798aec3a366919f0c14a078

    public void hangmanStage () {
        ImageView stageNumber = new ImageView();

        if (count == 1) {
            Image count1 = new Image("com/example/swissarmy/New folder/h1.png");
            stageNumber.setImage(count1);
        } else if (count == 2) {
            Image count2 = new Image("com/example/swissarmy/New folder/h2.png");
            stageNumber.setImage(count2);

        }else if (count == 3) {
            Image count3 = new Image("com/example/swissarmy/New folder/h3.png");
            stageNumber.setImage(count3);

        }else if (count == 4) {
            Image count4 = new Image("com/example/swissarmy/New folder/h4.png");
            stageNumber.setImage(count4);

        }else if (count == 5) {
            Image count5 = new Image("com/example/swissarmy/New folder/h5.png");
            stageNumber.setImage(count5);

        }else if (count == 6) {
            Image count6 = new Image("com/example/swissarmy/New folder/h6.png");
            stageNumber.setImage(count6);

        }else if (count == 7) {
            Image count7 = new Image("com/example/swissarmy/New folder/h7.png");
            stageNumber.setImage(count7);

        }else{
            stageNumber.setImage(null);
        }
    }


    private void updateHangmanImage() {
        ImageView stageNumber = new ImageView();
        String imagePath = "com/example/swissarmy/New folder/h" + count + ".png";
        Image image = new Image(imagePath);
        stageNumber.setImage(image);
    }
    @FXML
    public void compareWords() {

        // if the word is not a match a few more steps are undertaken before trying again
        // convert the strings to arrays and compare them and print out what is similar
        // in the toGuess word
        System.out.println(guessWord);
        boolean check1 = toGuessWord.equalsIgnoreCase(guessWord);
        if (check1) {
            userN.setText("Congratulations you win");
        } else {
            count ++;

            char[] compWord = toGuessWord.toCharArray();
            char[] userWord = guessWord.toCharArray();

            for (int i = 0; i < compWord.length; i++) {
                for (int j = 0; j < userWord.length; j++) {
                    if(compWord[i] == userWord[j]){
                        userN.setText("Please try again");
                        String s = userN.getText() + compWord[i];
                        userN.setText(s);
                    }

                }

            }
            updateHangmanImage();
            // userN.setText("You lose this round please try again");
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





