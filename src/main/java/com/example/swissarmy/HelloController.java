package com.example.swissarmy;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HelloController {
    @FXML
    private Label clock;
//    @FXML
//    private SplitMenuButton sceneSelector;

    @FXML
    private Button switchButton1;
    @FXML
    private Button switchButton2;
    @FXML
    private Button switchButton3;
    @FXML
    private Button switchButton4;
    AnchorPane map;
    private Stage stage;
    private Scene scene;

    @FXML
    private TextField NickName;
    private String Nname;
    private Parent root;
    @FXML
    private ImageView icon;
    public static String datetimePattern = "hh:mm a";

    public static void setDatetimePattern(String datetime) {
        datetimePattern = datetime;
    }



    public boolean validateField(){
        if(NickName.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Fields");
            alert.setContentText("Please Put A Nickname");
            alert.showAndWait();

            return false;
        } else {
            this.Nname = NickName.getText();
            return true;
        }

    }
    @FXML
    private void initialize() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> updateClock()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void updateClock() {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datetimePattern);
        String formattedTime = currentTime.format(formatter);
        clock.setText(formattedTime);
    }
    @FXML
    private void switchScene1(ActionEvent event) throws IOException {
        // Load the new FXML file
        if (validateField()) {
            Parent root = FXMLLoader.load(getClass().getResource("tipCalculator.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    @FXML
    private void switchScene2(ActionEvent event) throws IOException {
        // Load the new FXML file
        if (validateField()) {
            Parent root = FXMLLoader.load(getClass().getResource("hangman.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    @FXML
    private void switchScene3(ActionEvent event) throws IOException {
        // Load the new FXML file
        if (validateField()) {
            Parent root = FXMLLoader.load(getClass().getResource("verseOfTheDay.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    @FXML
    private void switchScene4(ActionEvent event) throws IOException {
        // Load the new FXML file
        if (validateField()) {
            Parent root = FXMLLoader.load(getClass().getResource("stats.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    

    public void mousePressed() {System.out.println("pressed");}

    public void mouseReleased(MouseEvent mouseEvent) {
        System.out.println("released");
        try {
            // Load the new FXML file
            if (validateField()) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("setting.fxml"));
                Node root = loader.load();
                Scene scene = new Scene((Parent) root);


                // Get the current stage
                Stage stage = (Stage) icon.getScene().getWindow();

                // Set the new scene on the stage
                stage.setScene(scene);
                stage.show();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}