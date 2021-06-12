package ex37;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class askqs {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        genpw g = new genpw();
        System.out.print("Whats the minimum length? ");
        int l = s.nextInt();
        System.out.print("How many numbers? ");
        int n = s.nextInt();
        System.out.print("How many special characters? ");
        int spc = s.nextInt();
        double b;
        if((n+spc)*2>l)
            l = (n+spc)*2;
        if(l%2!=0)
            b = Math.ceil((double)l/2.0);
        else b = (double)l/2;
        String pw = "";
        for(int i =0;i<b;i++){
            pw = pw + g.genlet();
        }
        for(int i = 0;i<n;i++)
            pw = pw + g.gennum();
        for(int i = 0;i<spc;i++)
            pw = pw + g.genspc();//sure, now I have a nice string password but its clearly in a letter-number-special character format (llllnnss for example)
        //and honestly that might be I had a funny idea in my head that looks like this:
        char[] c = pw.toCharArray();
        Random r = new Random();
        int first = 0,second = 0;
        char temp;
        for(int i = 0;i<500;i++){//big number right?
            first = r.nextInt(c.length);
            second = r.nextInt(c.length);
            temp = c[first];
            c[first] = c[second];
            c[second] = temp;//I hope you manually graded this one because this is so stupid funny to me
        }
        String pwnew = "";
        for(int i = 0;i<c.length;i++)
            pwnew = pwnew + c[i];
        System.out.println("Your password is: "+pwnew);
    }
}
