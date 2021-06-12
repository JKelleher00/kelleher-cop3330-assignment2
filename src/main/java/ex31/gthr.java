package ex31;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class gthr {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        formula f = new formula();
        System.out.print("What is your resting heart rate? ");
        int r = s.nextInt();//satisfies the "dont let them continue if they dont enter a number" thing because itll just throw an exception
        System.out.print("What is your age? ");
        int age = s.nextInt();
        System.out.println("Intensity\t\t|Rate");
        System.out.println("----------------|-------");
        for(double i = 0.55;i<0.96;i+=.05){
            System.out.println((int)(i*100) + "%\t\t\t\t|"+ f.thr(r,i,age));
        }
    }
}
