package ex40;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
import java.util.*;
public class checkingthechecker {
    public static void main(String args[]){
        String[][] ffs = {{"John","Johnson","Manager","2016-12-31"},{"Tou","Xiong","Software Engineer","2016-10-15"},{"Michaela","Michaelson","District Manager","2015-12-19"},{"Jake","Jacobson","Programmer",""},{"Jacquelyn","Jackson","DBA",""},{"Sally","Webber","Web Developer","2015-12-18"}};
        checker c = new checker();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a search string ");
        String almost = s.nextLine();
        String bleh[][] = c.phew(ffs,almost);
        System.out.print("Name\t\t\t|Seperation Date\n----------------|-------------\n");
        for(int i = 0;i<bleh.length;i++){
            System.out.print(bleh[i][0]+ " " +bleh[i][1]+"\t\t\t"+bleh[i][2]+"\n");
        }
    }
}
