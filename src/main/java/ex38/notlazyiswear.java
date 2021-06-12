package ex38;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class notlazyiswear {
    public static void main(String args[]){
        filt f = new filt();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a list of numbers, seperated by spaces ");
        String b = s.nextLine();
        char c[] = b.toCharArray();
        char nc[] = f.filterEvenNumbers(c);
        String ns = "";
        for(int i = 0;i<nc.length;i++)//BEHOLD! THE CONSEQUENCES OF MY LAZINESS!
            ns = ns + nc[i] + " ";//....a for loop
        System.out.println("The even numbers are: " + ns);
    }
}
