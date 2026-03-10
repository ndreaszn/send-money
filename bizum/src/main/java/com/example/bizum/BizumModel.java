package com.example.bizum;

public class BizumModel {

    private int totalAmount = 0;

    public void addAmount(int amountToAdd) {
        totalAmount += amountToAdd;
    }

    public void resetAmount() {
        totalAmount = 0;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}