package com.example.swissarmy;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HelloController {
    @FXML
    private Label clock;
    @FXML
    private SplitMenuButton sceneSelector;

    @FXML
    private Button switchButton;
    private Stage stage;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    private HelloApplication application;
    public void setApplication(HelloApplication application) {
        this.application = application;
    }

    @FXML
    private void initialize() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> updateClock()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        MenuItem tipCalculatorItem = new MenuItem("Tip Calculator");
        MenuItem hangmanItem = new MenuItem("Hangman");
        MenuItem verseOfTheDayItem = new MenuItem("Verse of the Day");
//        MenuItem eaglesItem = new MenuItem("Eagles");
        tipCalculatorItem.setOnAction(event -> switchScene("tipCalculator.fxml"));
        hangmanItem.setOnAction(event -> switchScene("hangman.fxml"));
        verseOfTheDayItem.setOnAction(event -> switchScene("VerseOfTheDay.fxml"));
//        eaglesItem.setOnAction(event -> switchScene("Eagles.fxml"));
//        sceneSelector.getItems().addAll(tipCalculatorItem, hangmanItem, verseOfTheDayItem, eaglesItem);
        sceneSelector.getItems().addAll(tipCalculatorItem, hangmanItem, verseOfTheDayItem);
        switchButton.setOnAction(event -> {
            String selectedItem = sceneSelector.getText();
            switch (selectedItem) {
                case "Tip Calculator":
                    switchScene("tipCalculator.fxml");
                    break;
                case "Hangman":
                    switchScene("hangman.fxml");
                    break;
                case "Verse of the Day":
                    switchScene("verseOfTheDay.fxml");
                    break;
                case "Eagles":
                    switchScene("Eagles.fxml");
                    break;
                default:
                    break;
            }
        });
    }

    private void updateClock() {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = currentTime.format(formatter);
        clock.setText(formattedTime);
    }
    private void switchScene(String fxmlPath) {
        try {
            // Load the new FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Node root = loader.load();
            Scene scene = new Scene((Parent) root);
            if (stage == null) {
                // Create a new stage object
                stage = new Stage();
            }
            // Set the new scene on the stage
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}