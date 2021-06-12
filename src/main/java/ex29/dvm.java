package ex29;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
import java.util.*;
public class dvm {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        div d = new div();
        int i = 0,c = 0;
        while(i == 0){
            System.out.print("What is the rate of return? ");
            String b = s.nextLine();
            if(b.charAt(0)<49||b.charAt(0)>57) {
                c = 1;
            }
            else{
                for(int j = 0;j<b.length();j++){
                    if(b.charAt(j)<48||b.charAt(j)>58)
                        c = 1;
                }
            }
            if(c == 0){
                System.out.println("It will take you "+ d.yrs(Integer.parseInt(b))+" years to double your initial investment");
                i = 1;
            }
            else System.out.println("Sorry. That's not a valid input.");
            c = 0;
        }
    }
}
