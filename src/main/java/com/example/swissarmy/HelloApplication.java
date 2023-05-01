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
    private Stage primaryScene;


    @Override
    public void start(Stage stage) throws IOException {
        this.primaryScene = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Swiss Army");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) throws Exception {
        launch();
        //Stats.generateStats();
    }

}