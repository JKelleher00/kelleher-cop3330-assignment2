package ex28;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class multinput {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        adding a = new adding();
        int ad[] = new int[5];
        for(int i = 0;i<5;i++){
            System.out.print("Enter number "+(i+1)+": ");
            ad[i] = s.nextInt();
        }
        int added = a.addem(ad[0],ad[1],ad[2],ad[3],ad[4]);
        System.out.println("The total is "+added);
    }
}
