package com.example.swissarmy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;


public class VerseOfTheDay {

    private String[] verses = {
        "For God so loved the world that he gave his one and only Son, that whoever believes in him shall not perish but have eternal life. - John 3:16 NIV",
        "Trust in the Lord with all your heart and lean not on your own understanding. - Proverbs 3:5 NIV",
        "I can do all this through him who gives me strength. - Philippians 4:13 NIV",
        "The Lord is my shepherd, I lack nothing. - Psalm 23:1 NIV",
        "Do not be anxious about anything, but in every situation, by prayer and petition, with thanksgiving, present your requests to God. - Philippians 4:6 NIV",
        "In the beginning God created the heavens and the earth. - Genesis 1:1 NIV",
        "For it is by grace you have been saved, through faith—and this is not from yourselves, it is the gift of God. - Ephesians 2:8 NIV",
        "The Lord is close to the brokenhearted and saves those who are crushed in spirit. - Psalm 34:18 NIV",
        "And we know that in all things God works for the good of those who love him, who have been called according to his purpose. - Romans 8:28 NIV",
        "Therefore do not worry about tomorrow, for tomorrow will worry about itself. Each day has enough trouble of its own. - Matthew 6:34 NIV",
        "For all have sinned and fall short of the glory of God. - Romans 3:23 NIV",
        "But seek first his kingdom and his righteousness, and all these things will be given to you as well. - Matthew 6:33 NIV",
        "The name of the Lord is a fortified tower; the righteous run to it and are safe. - Proverbs 18:10 NIV",
        "For I am convinced that neither death nor life, neither angels nor demons, neither the present nor the future, nor any powers, neither height nor depth, nor anything else in all creation, will be able to separate us from the love of God that is in Christ Jesus our Lord. - Romans 8:38-39 NIV",
        "The Lord is my light and my salvation—whom shall I fear? The Lord is the stronghold of my life—of whom shall I be afraid? - Psalm 27:1 NIV",
        "Do not conform to the pattern of this world, but be transformed by the renewing of your mind. Then you will be able to test and approve what God’s will is—his good, pleasing and perfect will. - Romans 12:2 NIV",
        "I have told you these things, so that in me you may have peace. In this world you will have trouble. But take heart! I have overcome the world. - John 16:33 NIV",
        "But he said to me, “My grace is sufficient for you, for my power is made perfect in weakness.” Therefore I will boast all the more gladly about my weaknesses, so that Christ’s power may rest on me. - 2 Corinthians 12:9 NIV",
        "Come to me, all you who are weary and burdened, and I will give you rest. - Matthew 11:28 NIV",
        "The fear of the Lord is the beginning of wisdom, and knowledge of the Holy One is understanding. - Proverbs 9:10 NIV",
        "I have been crucified with Christ and I no longer live, but Christ lives in me. The life I now live in the body, I live by faith in the Son of God, who loved me and gave himself for me. - Galatians 2:20 NIV",
        "Rejoice always, pray continually, give thanks in all circumstances; for this is God's will for you in Christ Jesus. - 1 Thessalonians 5:16-18 NIV",
        "Do not let your hearts be troubled. You believe in God; believe also in me. - John 14:1 NIV",
        "Therefore, if anyone is in Christ, the new creation has come: The old has gone, the new is here! - 2 Corinthians 5:17 NIV",
        "And the peace of God, which transcends all understanding, will guard your hearts and your minds in Christ Jesus. - Philippians 4:7 NIV",
        "And we have come to know and to believe the love that God has for us. God is love; whoever abides in love abides in God, and God in him. - 1 John 4:16 NIV",
        "Love is patient, love is kind. It does not envy, it does not boast, it is not proud. - 1 Corinthians 13:4 NIV",
        "This is the day the Lord has made; let us rejoice and be glad in it. - Psalm 118:24 NIV",
        "For the wages of sin is death, but the gift of God is eternal life in Christ Jesus our Lord. - Romans 6:23 NIV",
        "For you know that it was not with perishable things such as silver or gold that you were redeemed from the empty way of life handed down to you from your ancestors, but with the precious blood of Christ, a lamb without blemish or defect. - 1 Peter 1:18-19 NIV",
    };

    @FXML
    private Label verseLabel;

    @FXML
    public void versesText() {
        Random random = new Random();
        int verseIndex = random.nextInt(verses.length);
        verseLabel.setText(verses[verseIndex]);
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
