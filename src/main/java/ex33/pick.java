package ex33;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
import java.util.*;
public class pick {
    Random r = new Random();
    public void answer(){//only outputs, therefore no testing required :DDDDDD
        String c[] = new String[4];
        c[0] = "Yes";
        c[1] = "no";
        c[2] = "Maybe";
        c[3] = "Ask again later";
        int b = r.nextInt(4);
        System.out.println(c[b]);
    }
}
