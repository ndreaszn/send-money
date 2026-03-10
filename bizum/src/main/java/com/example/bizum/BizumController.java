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
    private void add1() {
        model.setDigit(1);
        updateScreen();
    }

    @FXML
    private void add2() {
        model.setDigit(2);
        updateScreen();
    }

    @FXML
    private void add3() {
        model.setDigit(3);
        updateScreen();
    }

    @FXML
    private void add4() {
        model.setDigit(4);
        updateScreen();
    }

    @FXML
    private void add5() {
        model.setDigit(5);
        updateScreen();
    }

    @FXML
    private void add6() {
        model.setDigit(6);
        updateScreen();
    }

    @FXML
    private void add7() {
        model.setDigit(7);
        updateScreen();
    }

    @FXML
    private void add8() {
        model.setDigit(8);
        updateScreen();
    }

    @FXML
    private void add9() {
        model.setDigit(9);
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