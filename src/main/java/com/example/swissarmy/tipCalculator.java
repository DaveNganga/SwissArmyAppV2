package com.example.swissarmy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class tipCalculator {
    @FXML
    TextField money = new TextField();
    @FXML
    TextField tip = new TextField();
    @FXML
    private Label result;
    @FXML
    protected void setTip10(){
        tip.setText("10%");
    }
    @FXML
    protected void setTip15(){
        tip.setText("15%");
    }
    @FXML
    protected void setTip20(){
        tip.setText("20%");
    }
    @FXML
    protected void calculateTip(){
        result.setText(String.valueOf(Double.valueOf(money.getText())/100*Double.valueOf(tip.getText().replace("%",""))));
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