package ex35;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
class pickwinnerTest {
    @org.junit.jupiter.api.Test
    void a(){
        pickwinner a = new pickwinner();
        assertEquals(0,a.winner(1));
    }
}