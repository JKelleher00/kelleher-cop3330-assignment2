package ex27;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class validator {//this only prints....so no need to test right??????
    private boolean ffilled(String fn){
        if((fn.trim()).equals(""))
            return true;
        else return false;
    }
    private boolean lfilled(String ln){
        if((ln.trim()).equals(""))
            return true;
        else return false;
    }
    private boolean f2(String fn){
        if(fn.length()<2)
            return true;
        else return false;
    }
    private boolean l2(String ln){
        if(ln.length()<2)
            return true;
        else return false;
    }
    private boolean id(String tid) {
        boolean b = true;
        tid = tid.toLowerCase();
        if (tid.charAt(0) < 123 && tid.charAt(0) > 96) {
            if (tid.charAt(1) < 123 && tid.charAt(1) > 96) {
                if (tid.charAt(2) == 45) {
                    if (tid.charAt(3) < 58 && tid.charAt(3) > 47) {
                        if (tid.charAt(4) < 58 && tid.charAt(4) > 47) {
                            if (tid.charAt(5) < 58 && tid.charAt(5) > 47) {
                                if (tid.charAt(6) < 58 && tid.charAt(6) > 47)
                                    b = false;
                            }
                        }
                    }
                }
            }
        }
        return b;
    }
    private boolean zip(String zc){
        boolean b = false;
        if(zc.length()!=5)
            b = true;
        for(int i = 0;i<5;i++){
            if(zc.charAt(i)>57||zc.charAt(i)<48)
                b = true;
        }
        return b;
    }
    public void validateInput(String fn, String ln, String zip, String id){
        int mark = 0;
        if(ffilled(fn)){
            mark = 1;
            System.out.println("The first name must be filled in");
        }
        if(lfilled(ln)){
            mark = 1;
            System.out.println("The last name must be filled in");
        }
        if(f2(fn)){
            mark = 1;
            System.out.println("The first name must be at least 2 characters long");
        }
        if(l2(ln)){
            mark = 1;
            System.out.println("The last name must be at least 2 characters long");
        }
        if(id(id)){
            mark = 1;
            System.out.println("The ID must be in the format of AA-1234");
        }
        if(zip(zip)){
            mark = 1;
            System.out.println("The zip code must be a 5 digit number");
        }
        if(mark == 0){
            System.out.println("There were no errors found.");
        }
    }
}
