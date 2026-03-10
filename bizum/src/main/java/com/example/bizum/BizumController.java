package com.example.bizum;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BizumController {

    @FXML
    private Label amountLabel;

    private BizumModel model = new BizumModel();

    private void updateScreen() {
        int currentTotal = model.getTotalAmount();
        amountLabel.setText(currentTotal + " €");
    }

    @FXML
    private void add20() {
        model.addAmount(20);
        updateScreen(); // forces the screen to refresh
    }

    @FXML
    private void add50() {
        model.addAmount(50);
        updateScreen();
    }

    @FXML
    private void add100() {
        model.addAmount(100);
        updateScreen();
    }

    @FXML
    private void reset() {
        model.resetAmount();
        updateScreen();
    }

    @FXML
    private void send() {
        int amountSent = model.getTotalAmount();

        if (amountSent > 0) {
            System.out.println("Processing Bizum... Successfully sent " + amountSent + "€!");

            // reset and update the screen
            model.resetAmount();
            updateScreen();

        } else {
            System.out.println("Please add an amount before sending.");
        }
    }
}