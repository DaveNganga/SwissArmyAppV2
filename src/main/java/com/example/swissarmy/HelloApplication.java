package com.example.swissarmy;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        HelloController controller = fxmlLoader.getController();
        controller.setStage(stage);
        controller.setApplication(this);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public Stage getStage() {
        return stage;
    }
//    @FXML
//    public void switchToHangman(ActionEvent event) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hangman.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
//        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        stage.setTitle("HANGMAN");
//        stage.setScene(scene);
//        stage.show();
//    }
    public static void main(String[] args) {
        launch();
    }

}