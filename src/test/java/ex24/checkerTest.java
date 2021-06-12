package ex24;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
class checkerTest {
    @org.junit.jupiter.api.Test
    void isAnagramCheck() {
        checker c = new checker();
        String o = "achoo";
        String b = "oohca";
        boolean d = c.isAnagram(o,b);
        assertEquals(true,d);
    }
}