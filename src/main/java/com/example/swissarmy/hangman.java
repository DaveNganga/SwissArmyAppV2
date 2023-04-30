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
    private Label counts;
    @FXML
    private Label output;

    int count = 0;

    @FXML
    String toGuessWord = "cactus";

    String guessWord = textField.getText();
  // checks to see if the word is already a match and the game is won if it is
    boolean check1 = toGuessWord.equalsIgnoreCase(guessWord);
    // if the word is not a match a few more steps are undertaken before trying again
    // convert the strings to arrays and compare them and print out what is similar
    // in the toGuess word
    if (check1 == true) {
        System.out.println("Congratulations you win");
    } else

    {
        // count+=1;
        System.out.println("Please try again");
        // https://stackoverflow.com/questions/32262059/java-find-element-in-array-using-condition-and-lambda
        // https://www.digitalocean.com/community/tutorials/java-array-contains-value
    }
       if (check1 == true)

    {
        char[] array1 = toGuessWord.toCharArray();
        System.out.println(array1);
        char[] array2 = guessWord.toCharArray();

        Set<Character> hiddenWord = new HashSet<Character>(Arrays.asList(array1));







