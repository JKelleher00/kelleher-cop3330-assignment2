package ex26;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double apr, double b, double p){
        double c = Math.log(1.0 + b/p * (1.0 - Math.pow((1.0 + apr),30.0)));
        c = c/(Math.log(1.0+apr));
        c = (-1.0/30.0)*c;
        if(c%2!=0)
            c = Math.ceil(c);
        return c;
    }
}
