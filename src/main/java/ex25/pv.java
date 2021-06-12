package ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class pv {
    public int PasswordValidator(String pw){
        int v = 1;
        pw = pw.toLowerCase();
        if(pw.length()<8){
            for(int i = 0;i<pw.length();i++) {
                if (pw.charAt(i) < 123 && pw.charAt(i) > 96)
                    v = 2;
            }
        }
        else{
            v = 3;
            for(int i = 0;i<pw.length();i++) {
                if (pw.charAt(i) < 48 || pw.charAt(i) > 11 || (pw.charAt(i)>57&&pw.charAt(i)<65)||(pw.charAt(i)>90&&pw.charAt(i)<97))
                    v = 4;
            }
        }
        return v;
    }
}
