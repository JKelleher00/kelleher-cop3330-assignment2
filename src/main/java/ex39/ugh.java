package ex39;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 John Kelleher
 */
public class ugh {
    public String[][] hatethis(String[][] employees){
        int index = 0;
        String ne[][] = new String[6][4];
        for(int i = 0;i<6;i++){
            index = 0;
            String temp = employees[i][1];
            for(int j = 0;j<6;j++){
                if(temp.compareTo(employees[j][1])>0){
                    index = j;
                    temp = employees[j][1];
                }
            }
            ne[i][0] = employees[index][0];
            ne[i][1] = employees[index][1];
            ne[i][2] = employees[index][2];
            ne[i][3] = employees[index][3];
            employees[index][0] = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
            employees[index][1] = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
            employees[index][2] = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
            employees[index][3] = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";//I hate this problem. Im gonna hate the next one too.
        }
        return ne;
    }

}
