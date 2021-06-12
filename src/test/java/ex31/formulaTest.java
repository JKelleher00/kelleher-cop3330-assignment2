package ex31;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
class formulaTest {
    @org.junit.jupiter.api.Test
    void a(){
        formula f = new formula();
        assertEquals(138,f.thr(65,0.55,22));
    }
}