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

        System.out.println();






        //Put the zeros to the end in an array
        int arr[]= {0,0,1,0,4,0,0,5,8,9};
        int brr[]= new int[arr.length];
        int crr=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                brr[crr]= arr[i];
                crr++;
            }
        }
        System.out.println(Arrays.toString(brr));

        System.out.println();

        //Put the zeros to the end in an array
        int ara[]= {0,45,1,0,4,0,98,5,8,9};
        int bra[]= new int[ara.length];
        int cra=0;
        for (int i =0; i<ara.length; i++){
            if (ara[i]!=0){
                bra[cra]=ara[i];
                cra++;
            }
        }
        System.out.println(Arrays.toString(bra));
        }
    }

