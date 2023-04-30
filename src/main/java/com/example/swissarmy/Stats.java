package com.example.swissarmy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Stats {

    private static int wins;
    public static void generateStats() throws Exception{
        int tempWins = 0;
        String line = "";

        BufferedReader br = new BufferedReader(new FileReader("com/example/swissarmy/team-picking-categories_csv.csv"));

        while((line = br.readLine()) !=null ){
            String[] game = line.split(",");
                if(game[10].equals("1")){
                    tempWins+=1;
                }
        }
    }
    public static int getWins() {
        return wins;
    }

    public static void setWins(int wins) {
        Stats.wins = wins;
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
