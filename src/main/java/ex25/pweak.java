package ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
import java.util.*;
public class pweak {
    public static void main(String args[]){
        pv p = new pv();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your password ");
        String achoo = s.nextLine();
        int r = p.PasswordValidator(achoo);
        String out = "";
        if(r == 1){
            out = achoo + " is a very weak password.";
        }
        else if(r == 2)
            out = achoo + " is a weak password";
        else if(r == 3)
            out = achoo + " is a strong password";
        else out = achoo + " is a very strong password";
        System.out.println(out);
    }
}
