package ex35;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class names {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        pickwinner p = new pickwinner();
        List a = new ArrayList();
        int i = 0;
        while(i == 0){
            System.out.print("Enter a name: ");
            String nn = s.nextLine();
            if(nn.isEmpty())
                i = 1;
            else a.add(nn);
        }
        int b = p.winner(a.size());
        System.out.println("The winner is..... "+a.get(b));
    }
}
