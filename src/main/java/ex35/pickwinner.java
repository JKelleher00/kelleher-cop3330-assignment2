package ex35;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class pickwinner {
    public int winner(int b){
        Random r = new Random();
        return r.nextInt(b);
    }
}
