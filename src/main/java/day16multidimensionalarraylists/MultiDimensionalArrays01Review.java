package day16multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays01Review {

    public static void main(String[] args) {

        //How to create multidimensional array?
        int arr[][]= new int[4][3];

        // how to print multidimensional array?
        System.out.println(Arrays.deepToString(arr));

        //How to create multidimensional array in short way?
        String brr [][]= {{"Tom", "Jim"},{"Angie"},{"Carl", "Chris", "Ali"}};

        //Print Jim and Chris on the console

        System.out.println(brr[0][1]);
        System.out.println(brr[2][1]);

        //Example1. Type code to find the number of elements in a multidimensional array.
        String crr[][]= {{"Tom", "Jim",},{"Angie"},{"Carl", "Chris", "Ali"}};
        int sum= 0;
        for (String[] w:crr ){
            sum= sum + w.length;
        }
        System.out.println(sum);
    }
}
