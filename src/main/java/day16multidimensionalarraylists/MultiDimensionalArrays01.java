package day16multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    public static void main(String[] args) {

        //İF an array has arrays an elements, it is called multideminsional array.

        //How to create multidimensional array?

        int arr[][]= new int[4][2];

        // how to print multidimensional array?

        System.out.println(Arrays.deepToString(arr));

        //How to assign values to multidimensional arrays elements.

        System.out.println(Arrays.deepToString(arr));
        arr[0][0]= 2;
        arr[0][1]= 3;

        arr[1][0]= 5;
        arr[1][1]= 9;

        arr[2][0]= 10;
        arr[2][1]= 7;

        arr[3][0]= -3;
        arr[3][1]= 8;


        //How to create multidimensional array in short way?

        String brr[][]= {{"Tom", "Jim"},{"Angie"},{"Carl", "Chris", "Ali"}};
        System.out.println(Arrays.deepToString(brr));

        //How to print specific element from multidimensional Array?

        System.out.println(brr[0][0]);
        System.out.println(brr[2][0]);

        //How to print a specific element from outer array?

        System.out.println(Arrays.toString(brr[2]));

        //Example1. Type code to find the number of elements in a multidimensional array.
        String crr[][]= {{"Tom", "Jim",},{"Angie"},{"Carl", "Chris", "Ali"}};
        int sum= 0;
        for (String[] w: crr){
            sum=sum +w.length;
        }
        System.out.println(sum);
    }

}
