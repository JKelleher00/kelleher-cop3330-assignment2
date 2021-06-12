package ex34;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class remover {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        rem r = new rem();
        String names[] = new String[5];
        names[0] = "John";
        names[1] = "Jacob";
        names[2] = "david";
        names[3] = "josef";
        names[4] = "kevin";
        System.out.println("There are "+names.length+" employees");
        for(int i = 0;i<names.length;i++)
            System.out.println(names[i]);
        System.out.print("Enter an employees name to remove ");
        String delet = s.next();
        String n[] = r.remove(names,delet);
        System.out.println("There are "+n.length+" employees");
        for(int i = 0;i<n.length;i++)
            System.out.println(n[i]);
    }
}
