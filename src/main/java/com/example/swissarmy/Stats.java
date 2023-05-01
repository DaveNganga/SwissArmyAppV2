package com.example.swissarmy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Stats {
    private BarChart<?, ?> barChart;
    private static int wins;
    public static void generateStats() throws Exception{
        //parsing a CSV file into Scanner class constructor

        InputStream inputStream = Stats.class.getResourceAsStream("TeamInfo/Career_Stats_Offensive_Line.csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        // BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        // BufferedReader br = new BufferedReader(new FileReader("TeamInfo/Career_Stats_Offensive_Line.csv"));
        Stream stm = br.lines();
        stm.forEach(System.out::println);
        //long lines = 0;
        //while (br.readLine() != null) lines++;
        //System.out.println(br.lines().toString());
        /*
        for(int x = 0; x< 4626; x++) {
            line = br.readLine();
            String[] game = line.split(",");
            System.out.println("made it before if statement");
            //System.out.println(game[5]);
            if ((game[4].equals("2013")) && (game[5].equals("Philadelphia Eagles"))) {
                System.out.println("testing");
                response += game[1] + " " + game[6] + "\n";
                //System.out.println(game[1] + game[5]);
                System.out.println(response);
            }
        }
        */

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
