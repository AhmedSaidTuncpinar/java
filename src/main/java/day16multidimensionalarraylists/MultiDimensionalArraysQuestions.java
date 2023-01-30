package day16multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArraysQuestions {

    public static void main(String[] args) {

        //Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }

        int arr[][]= { {1,2,3}, {4,5,6} };
        int sum=0;
        for (int [] w: arr){
            for (int u: w){

                sum= sum + u;
            }
        }
        System.out.println(sum);

       // Find the product of the last elements in the array elements of the given multi dimensional array { {1,2,3}, {4,5}, {6} }
        int brr[][]= { {1,2,3}, {4,5,6} };
        System.out.println(Arrays.toString(brr[brr.length-1]));

        //Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
        int arr1[][] = { {1,2}, {3,4,5}, {6} };
        int arr2[][] = { {7,8,9}, {10,11}, {12} };
        int sum1 =0;

        System.out.println(arr1[0][0] + arr2 [0][0]);
        System.out.println(arr1[1][1] + arr2 [1][1]);



    }
}
