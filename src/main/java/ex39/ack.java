package ex39;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class ack {
    public static void main(String args[]){
        String[][] ffs = {{"John","Johnson","Manager","2016-12-31"},{"Tou","Xiong","Software Engineer","2016-10-15"},{"Michaela","Michaelson","District Manager","2015-12-19"},{"Jake","Jacobson","Programmer",""},{"Jacquelyn","Jackson","DBA",""},{"Sally","Webber","Web Developer","2015-12-18"}};
        ugh u = new ugh();
        String[][] bleh = u.hatethis(ffs);
        System.out.print("Name\t\t\t|Position\t\t\t\t|Seperation Date\n----------------|-----------------------|-------------\n");
        for(int i = 0;i<6;i++){//oh god the output isn't perfectly aligned oh nooooooooooooooooooooo
            System.out.print(bleh[i][0]+ " " +bleh[i][1]+"\t\t\t"+bleh[i][2]+"\t\t\t\t"+bleh[i][3]+"\n");
        }
    }
}
