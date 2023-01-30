package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01Review {

    public static void main(String[] args) {

//Example 1. [0,2,3,0,12,,0] put the zeros to the end.

        // [2,3,12,0,0,0]

        int arr[]= {0,2,3,0,12,0};
        int brr[]= new int[arr.length];
        int idx= 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]!=0)  {

                brr[idx]=arr[i];

                idx++;
            }
        }

        System.out.println(Arrays.toString(brr));






    }
}
