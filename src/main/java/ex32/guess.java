package ex32;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
import java.util.*;
public class guess {
    Random r = new Random();
    public int gen(int i){
        int b = 0;
        if(i == 1)
            b = r.nextInt(10)+1;
        else if(i == 2)
            b = r.nextInt(100)+1;
        else if(i == 3)
            b = r.nextInt(1000)+1;
        return b;
    }
    public boolean check(String j){
        boolean b = true;
        for(int i = 0;i<j.length();i++){
            if(j.charAt(i)<48||j.charAt(i)>57)
                b = false;
        }
        return b;
    }
}
