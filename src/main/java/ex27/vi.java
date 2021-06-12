package ex27;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class vi {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        validator v = new validator();
        System.out.print("Enter the first name: ");
        String fn = s.nextLine();
        System.out.print("Enter the last name: ");
        String ln = s.nextLine();
        System.out.print("Enter the zip code: ");
        String zip = s.nextLine();
        System.out.print("Enter the employee ID: ");
        String id = s.nextLine();
        v.validateInput(fn,ln,zip,id);
    }
}
