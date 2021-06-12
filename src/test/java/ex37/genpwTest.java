package ex37;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
class genpwTest {
    @org.junit.jupiter.api.Test
    void a(){
        genpw g = new genpw();
        assertEquals(true,(g.genlet()).charAt(0)>96&&(g.genlet()).charAt(0)<123);
        assertEquals(true,(g.gennum()).charAt(0)>47&&(g.gennum()).charAt(0)<58);
        assertEquals(true,(g.genspc()).charAt(0)>32&&(g.genspc()).charAt(0)<48);
    }
}