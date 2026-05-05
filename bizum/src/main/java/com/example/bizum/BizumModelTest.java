package com.example.bizum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BizumModelTest {

    private BizumModel model;

    @BeforeEach
    void setUp() {
        model = new BizumModel();
    }

    @Test
    void testImporteInicialEsCero() {
        int total = model.getTotalAmount();

        assertEquals(0, total);
    }

    // buttons test

    @Test
    void testAnadir20() {
        model.addAmount(20);

        int total = model.getTotalAmount();

        assertEquals(20, total);
    }

    @Test
    void testAnadir50() {
        model.addAmount(50);

        int total = model.getTotalAmount();

        assertEquals(50, total);
    }

    @Test
    void testAnadir100() {
        model.addAmount(100);

        int total = model.getTotalAmount();

        assertEquals(100, total);
    }

    @Test
    void testAnadirVariasCantidades() {
        model.addAmount(20);
        model.addAmount(50);
        model.addAmount(100);

        int total = model.getTotalAmount();

        assertEquals(170, total);
    }

    // keypad / numpad test

    @Test
    void testIntroducirUnDigito() {
        model.setDigit(5);

        int total = model.getTotalAmount();

        assertEquals(5, total);
    }

    @Test
    void testIntroducirVariosDigitos() {
        // 1, 2, 3 → 123
        model.setDigit(1);
        model.setDigit(2);
        model.setDigit(3);

        int total = model.getTotalAmount();

        assertEquals(123, total);
    }

    @Test
    void testIntroducirCeroAlFinal() {
        // 5, 0 → 50
        model.setDigit(5);
        model.setDigit(0);

        int total = model.getTotalAmount();

        assertEquals(50, total);
    }

    @Test
    void testIntroducirSoloCero() {
        // 0 solo → sigue en 0
        model.setDigit(0);

        int total = model.getTotalAmount();

        assertEquals(0, total);
    }

    @Test
    void testResetAfterAddAmount() {
        model.addAmount(100);
        model.resetAmount();

        int total = model.getTotalAmount();

        assertEquals(0, total);
    }

    @Test
    void testResetAfterSetDigit() {
        model.setDigit(4);
        model.setDigit(2);
        model.resetAmount();

        int total = model.getTotalAmount();

        assertEquals(0, total);
    }


    @Test
    void testDigitosConBotonRapido() {
        model.setDigit(5);
        model.addAmount(20);

        int total = model.getTotalAmount();

        assertEquals(25, total);
    }

    @Test
    void testReset() {
        model.addAmount(50);
        model.resetAmount();
        model.setDigit(3);

        int total = model.getTotalAmount();

        assertEquals(3, total);
    }
}