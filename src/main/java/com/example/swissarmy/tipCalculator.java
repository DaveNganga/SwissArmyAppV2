package com.example.swissarmy;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
}