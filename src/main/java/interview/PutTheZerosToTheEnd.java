package interview;

import java.util.Arrays;

public class PutTheZerosToTheEnd {
    public static void main(String[]args){
        //Put the zeros to the end in an array
        int arry[]= {0,3,0,5,0, 18, 24, 45, 54};
        int brry[]= new int[arry.length];
        int idxy= 0;
        for (int i=0; i<arry.length; i++){
            if (arry[i]!=0){
                brry[idxy]= arry[i];
                idxy++;
            }
        }
        System.out.println(Arrays.toString(brry));
        }
    }

