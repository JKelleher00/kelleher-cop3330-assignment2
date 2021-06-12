package ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pvTest {
    @Test
    void PWVTest(){
        pv p = new pv();
        assertEquals(1,p.PasswordValidator("5435"));
    }
}