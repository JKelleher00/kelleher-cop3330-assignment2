package ex34;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class rem {
    public String[] remove(String[] init,String r){
        int j = init.length,ind = -1;
        for(int i = 0;i<j;i++){
            if(r.equals(init[i]))
                ind = i;
        }
        int b = 0;
        if(ind !=-1) {
            String nw[] = new String[j - 1];
            for (int i = 0; i < j; i++) {
                if (ind != i) {
                    nw[b] = init[i];
                    b++;
                }
            }
            return nw;
        }
        else return init;
    }
}
