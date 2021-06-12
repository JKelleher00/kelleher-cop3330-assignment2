package ex30;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class thingy {//no testing required because it's just a print.
    public void achoo(){
        for(int i = 0;i<12;i++){
            for(int j = 0;j<12;j++){
                System.out.print("\t"+(i+1)*(j+1));
            }
            System.out.print("\n");
        }
    }
}
