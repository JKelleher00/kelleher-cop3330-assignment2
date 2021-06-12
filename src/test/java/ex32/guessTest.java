package ex32;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
import static org.junit.jupiter.api.Assertions.*;

class guessTest {
    guess g = new guess();
    @org.junit.jupiter.api.Test
    void a(){
        assertEquals(true,g.check("50"));
        assertEquals(false,g.check("achoo"));
        assertEquals(true,g.gen(3)<1001);
        assertEquals(true,g.gen(2)<101);
        assertEquals(true,g.gen(1)<11);
    }
}