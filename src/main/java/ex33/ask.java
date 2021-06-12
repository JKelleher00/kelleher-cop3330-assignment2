package ex33;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class ask {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        pick p = new pick();
        System.out.println("Enter your question:");
        String notusingthis = s.nextLine();
        p.answer();
    }
}
