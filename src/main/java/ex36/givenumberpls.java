package ex36;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class givenumberpls {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        stats st = new stats();
        int i = 0;
        ArrayList<Integer>  a = new ArrayList<Integer>();
        while(i == 0){
            System.out.print("Enter a number");
            String b = s.next();
            if(b.equals("done"))
                break;
            else if(st.isNumber(b))
                a.add(Integer.parseInt(b));
            else continue;
        }
        int p[] = new int[a.size()];
        for(int j = 0;j<a.size();j++)
            p[j] = a.get(j);
        System.out.println("The average is "+st.average(p));
        System.out.println("The minimum is "+st.min(p));
        System.out.println("The maximum is "+st.max(p));
        System.out.println("The standard deviation is "+st.stdiv(p));
    }
}
