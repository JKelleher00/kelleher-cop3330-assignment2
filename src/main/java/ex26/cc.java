package ex26;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class cc {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        PaymentCalculator pc = new PaymentCalculator();
        System.out.print("What is your balance? ");
        double b = s.nextDouble();
        System.out.print("What is the apr on the card?(as a percent) ");
        double apr = s.nextDouble();
        apr = apr/(double)100;
        apr = apr/(double)365;
        System.out.print("What is the monthly payment? ");
        double p = s.nextDouble();
        System.out.println("it will take you "+pc.calculateMonthsUntilPaidOff(apr,b,p)+" months to pay off this card");
    }
}
