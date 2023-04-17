package com.example.swissarmy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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
}
