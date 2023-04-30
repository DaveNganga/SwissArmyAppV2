package com.example.swissarmy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class VerseOfTheDay {

    @FXML
    public static void main(String[] args) {
        String[] verses = {
                "For God so loved the world that he gave his one and only Son, that whoever believes in him shall not perish but have eternal life. - John 3:16",
                "Trust in the Lord with all your heart and lean not on your own understanding. - Proverbs 3:5",
                "I can do all this through him who gives me strength. - Philippians 4:13",
                "The Lord is my shepherd, I lack nothing. - Psalm 23:1",
                "Do not be anxious about anything, but in every situation, by prayer and petition, with thanksgiving, present your requests to God. - Philippians 4:6",
                "In the beginning God created the heavens and the earth. - Genesis 1:1",
                "For it is by grace you have been saved, through faith—and this is not from yourselves, it is the gift of God. - Ephesians 2:8",
                "The Lord is close to the brokenhearted and saves those who are crushed in spirit. - Psalm 34:18",
                "And we know that in all things God works for the good of those who love him, who have been called according to his purpose. - Romans 8:28",
                "Therefore do not worry about tomorrow, for tomorrow will worry about itself. Each day has enough trouble of its own. - Matthew 6:34",
                "For all have sinned and fall short of the glory of God. - Romans 3:23",
                "But seek first his kingdom and his righteousness, and all these things will be given to you as well. - Matthew 6:33",
                "The name of the Lord is a fortified tower; the righteous run to it and are safe. - Proverbs 18:10",
                "For I am convinced that neither death nor life, neither angels nor demons, neither the present nor the future, nor any powers, neither height nor depth, nor anything else in all creation, will be able to separate us from the love of God that is in Christ Jesus our Lord. - Romans 8:38-39",
                "The Lord is my light and my salvation—whom shall I fear? The Lord is the stronghold of my life—of whom shall I be afraid? - Psalm 27:1",
                "Do not conform to the pattern of this world, but be transformed by the renewing of your mind. Then you will be able to test and approve what God’s will is—his good, pleasing and perfect will. - Romans 12:2",
                "I have told you these things, so that in me you may have peace. In this world you will have trouble. But take heart! I have overcome the world. - John 16:33",
                "But he said to me, “My grace is sufficient for you, for my power is made perfect in weakness.” Therefore I will boast all the more gladly about my weaknesses, so that Christ’s power may rest on me. - 2 Corinthians 12:9",
                "Come to me, all you who are weary and burdened, and I will give you rest. - Matthew 11:28",
                "The fear of the Lord is the beginning of wisdom, and knowledge of the Holy One is understanding. - Proverbs 9:10",
                "I have been crucified with Christ and I no longer live, but Christ lives in me. The life I now live in the body, I live by faith in the Son of God, who loved me and gave himself for me. - Galatians 2:20",
                "Rejoice always, pray continually, give thanks in all circumstances; for this is God's will for you in Christ Jesus. - 1 Thessalonians 5:16-18",
                "Do not let your hearts be troubled. You believe in God; believe also in me. - John 14:1",
                "Therefore, if anyone is in Christ, the new creation has come: The old has gone, the new is here! - 2 Corinthians 5:17",
                "And the peace of God, which transcends all understanding, will guard your hearts and your minds in Christ Jesus. - Philippians 4:7",
                "And we have come to know and to believe the love that God has for us. God is love; whoever abides in love abides in God, and God in him. - 1 John 4:16",
                "Love is patient, love is kind. It does not envy, it does not boast, it is not proud. - 1 Corinthians 13:4",
                "This is the day the Lord has made; let us rejoice and be glad in it. - Psalm 118:24",
                "For the wages of sin is death, but the gift of God is eternal life in Christ Jesus our Lord. - Romans 6:23",
                "For you know that it was not with perishable things such as silver or gold that you were redeemed from the empty way of life handed down to you from your ancestors, but with the precious blood of Christ, a lamb without blemish or defect. - 1 Peter 1:18-19"
        };
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
