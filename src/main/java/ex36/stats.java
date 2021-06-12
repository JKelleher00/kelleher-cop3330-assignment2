package ex36;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class stats {
    public boolean isNumber(String blah){
        boolean b = true;
        for(int i = 0;i<blah.length();i++){
            if(blah.charAt(i)<48||blah.charAt(i)>57)
                b = false;
        }
        return b;
    }
    public double average(int a[]){
        double total = 0;
        for(int i = 0;i<a.length;i++){
            total = total + a[i];
        }
        return total/(double)a.length;
    }
    public int min(int a[]){
        int min = a[0];
        for(int i = 0;i<a.length;i++){
            if(min>a[i])
                min = a[i];
        }
        return min;
    }
    public int max(int a[]){
        int max = a[0];
        for(int i = 0;i<a.length;i++){
            if(max<a[i])
                max = a[i];
        }
        return max;
    }
    public double stdiv(int a[]){
        double mean = average(a);
        double sum = 0;
        for(int i = 0;i<a.length;i++){
            sum = sum + Math.pow((a[i]-mean),2);
        }
        sum = sum / a.length;
        return Math.sqrt(sum);
    }
}
