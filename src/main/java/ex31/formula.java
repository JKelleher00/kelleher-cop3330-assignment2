package ex31;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class formula {
    public int thr(int rest,double in,int age){
        age = 220-age;
        age = age - rest;
        in = age*in;
        in = in + rest;
        return (int)in;
    }
}
