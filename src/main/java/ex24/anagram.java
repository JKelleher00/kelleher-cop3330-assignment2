package ex24;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class anagram {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        checker c = new checker();
        System.out.print("Enter the first string:");
        String one = s.nextLine();
        System.out.print("Enter the second string:");
        String two = s.nextLine();
        boolean i = c.isAnagram(one,two);
        if(i)
            System.out.println("\""+one+"\" and \""+two+"\" are anagrams");
        else System.out.println("\""+one+"\" and \""+two+"\" are not anagrams");
    }
}
