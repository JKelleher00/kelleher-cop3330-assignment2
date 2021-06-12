package ex36;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
class statsTest {
    @org.junit.jupiter.api.Test
    void a(){
        int a[] = {50,150};
        stats s = new stats();
        assertEquals(100,s.average(a));
        assertEquals(50,s.min(a));
        assertEquals(150,s.max(a));
        assertEquals(50,s.stdiv(a));
        assertEquals(false,s.isNumber("achoo"));
        assertEquals(true,s.isNumber("500"));
    }
}