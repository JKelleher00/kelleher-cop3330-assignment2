package ex40;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class checker {
    public String[][] phew(String[][] old,String lookingforthis){
        int haha = 0;
        for(int i = 0;i<6;i++){
            if(old[i][0].contains(lookingforthis)){
                haha++;
            }
            else if(old[i][1].contains(lookingforthis)){
                haha++;
            }
        }//I JUST WANT TO BE DONE
        String[][] ne = {{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""}};
        int index = 0;
        for(int i = 0;i<6;i++){
            if(old[i][0].contains(lookingforthis)){
                ne[index][0] = old[i][0];
                ne[index][1] = old[i][1];
                ne[index][2] = old[i][3];
                index++;
            }
            else if(old[i][1].contains(lookingforthis)){
                ne[index][0] = old[i][0];
                ne[index][1] = old[i][1];
                ne[index][2] = old[i][3];
                index++;
            }
        }
        return ne;
    }
}
