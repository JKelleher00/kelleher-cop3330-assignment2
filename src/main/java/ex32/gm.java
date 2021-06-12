package ex32;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
import java.util.*;
public class gm {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int p = 0;
        String ag = "";
        while(p == 0) {
            System.out.print("Enter the difficulty level(1,2 or 3) ");
            int b = s.nextInt();//again, not allowing non-numeric because it will throw an exception.
            guess g = new guess();
            int r = g.gen(b);
            System.out.print("I have my number. Whats your guess?");
            int i = 0, ug, t = 0;
            String ss;
            while (i == 0) {
                ss = s.next();
                if (g.check(ss))
                    ug = Integer.parseInt(ss);
                else {
                    System.out.print("Not a number, guess again: ");
                    t++;
                    continue;
                }
                if (ug == r) {
                    System.out.println("You got it in " + t + " guesses!");
                    i = 1;
                } else if (ug < r) {
                    System.out.print("Too low, try again: ");
                    t++;
                    continue;
                } else if (ug > r) {
                    System.out.print("Too high, try again: ");
                    t++;
                    continue;
                }
            }
            System.out.println("Play again? (y/n)");
            ag = s.next();
            if(!ag.equals("y"))
                p = 1;
        }
    }
}
