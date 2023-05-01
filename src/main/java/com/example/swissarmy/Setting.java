package com.example.swissarmy;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdk.javadoc.internal.doclets.formats.html.DocFilesHandlerImpl;

import java.io.IOException;

public class Setting {
    @FXML
    private void goBack(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene main = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Swiss Army");
        stage.setScene(main);
        stage.show();
    }
    @FXML
    private void setColorLight() throws IOException {
        Application.setUserAgentStylesheet(HelloApplication.class.getResource("stylesLight.css").toExternalForm());

    }
    @FXML
    private void setColorDark() throws IOException{
        Application.setUserAgentStylesheet(HelloApplication.class.getResource("stylesDark.css").toExternalForm());
    }

}
