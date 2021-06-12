package ex24;
import java.lang.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class checker {

    public boolean isAnagram(String one,String two){
        boolean k = true;
        one = one.toLowerCase();
        two = two.toLowerCase();
        int count[] = new int[26];
        int count1[] = new int[26];
        for(int i =0;i<26;i++) {
            count[i] = 0;
            count1[i] = 0;
        }
        if(one.length()!=two.length())
            k = false;
        for(int i = 0;i<one.length();i++){
            count[one.charAt(i)-97]++;
        }
        for(int i = 0;i<two.length();i++){
            count1[two.charAt(i)-97]++;
        }
        for(int i = 0;i<26;i++){
            if(count[i] != count1[i]) {
                k = false;
                break;
            }
        }
        return k;
    }
}
