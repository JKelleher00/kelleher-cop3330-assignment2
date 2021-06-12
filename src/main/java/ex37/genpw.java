package ex37;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
import java.util.*;
public class genpw {
    Random r = new Random();
    public String genlet(){
        ArrayList a = new ArrayList();//if you're gonna make me use lists im gonna use em like this.
        for(int i = 0;i<26;i++)
            a.add(Character.toString(i+97));
        String g = a.get(r.nextInt(26)).toString();
        return g;
    }
    public String gennum() {
            return Integer.toString(r.nextInt(10));
    }
    public String genspc(){
        ArrayList a = new ArrayList();
        for(int i = 0;i<15;i++)
            a.add(Character.toString(i+33));//see?im storing them in lists.
        return (a.get(r.nextInt(15))).toString();
    }
}
