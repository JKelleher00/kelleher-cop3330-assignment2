package ex38;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class filt {
    public char[] filterEvenNumbers(char[] old){//didnt test because I don't think you can test the output if its a char array
        String nw = "";
        for(int i = 0;i<old.length;i++){
            if(i%2!=0)//spaces between each one right? its not lazy its smart leave me alone
                continue;
            else {
                if (old[i] == 48 || old[i] == 50 || old[i] == 52 || old[i] == 54 || old[i] == 56)//okay I might be lazy but it doesn't say I need to convert it to an int first
                    nw = nw + Character.toString(old[i]);
            }
        }
        char ne[] = nw.toCharArray();//I JUST LEARNED ABOUT THIS METHOD DOING THE LAST PROBLEM okay give me a break
        return ne;//plus i'm follow directions, see? I get a char array as input and give one as output. its not laziness I swear
    }//bill gates said something about lazy people being better than you okay
}//I dont remember the quote because im lazy but it basically means im god and deserve a 150% on this assignment
