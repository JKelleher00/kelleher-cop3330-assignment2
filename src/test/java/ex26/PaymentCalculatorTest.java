package ex26;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
class PaymentCalculatorTest {
    @org.junit.jupiter.api.Test
    void calculateMonthsUntilPaidOffTest(){
        PaymentCalculator pc = new PaymentCalculator();
        assertEquals(70.0,pc.calculateMonthsUntilPaidOff(12.0/(36500.0),5000.0,100.0));
    }
}