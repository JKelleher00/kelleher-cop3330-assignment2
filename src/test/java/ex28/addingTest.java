package ex28;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
class addingTest {
    @org.junit.jupiter.api.Test
    void t(){
        adding a = new adding();
        assertEquals(15,a.addem(1,2,3,4,5));
    }
}