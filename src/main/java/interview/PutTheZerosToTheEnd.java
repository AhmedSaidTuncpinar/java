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

        //Put the zeros to the end in an array

        int ark[]= {0,15,0,2,0,24,3, 7};
        int brk[]= new int[ark.length];
        int crk= 0;
        for (int i=0; i<ark.length; i++){
            if (ark[i]!=0){
                brk[crk]=ark[i];
                crk++;
            }
        }
        System.out.println(Arrays.toString(brk));

        //Put the zeros to the end in an Array

        int rry[]= {0,21,0,9};
        int bry[]= new int[rry.length];
        int cry= 0;
        for (int i=0; i<rry.length; i++){
            if (rry[i]!=0){
                bry[cry]=rry[i];
                cry++;
            }
        }
        System.out.println(Arrays.toString(bry));

        System.out.println();

        //Put the zeros to the end in an Array
        int[] rmdy= {0,0,0,1,2,3};
        int[] bmdy= new int[rmdy.length];
        int cmdy= 0;
        for (int i=0; i<rmdy.length; i++){
            if (rmdy[i]!=0){
                bmdy[cmdy]=rmdy[i];
                cmdy ++;

            }
        }
        System.out.println(Arrays.toString(bmdy));
        }
    }

