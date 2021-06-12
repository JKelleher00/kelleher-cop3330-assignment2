package ex29;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
class divTest {
    @org.junit.jupiter.api.Test
    void a(){
        div d = new div();
        assertEquals(18,d.yrs(4));
    }
}