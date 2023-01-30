package day19practice;

import java.util.Arrays;

public class Q03_FindEleMiddle {

    public static void main(String[] args) {
    /*
        Find the middle element in an integer array
       Example 1: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       Example 2: (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */

        int[ ] a = new int[ ]{12, 5, 8,21};
        Arrays.sort(a);//5,8,12,21
        if(a.length%2!=0){
            Integer b = a.length/2;
            System.out.println(a[b]);
        }else{
            Integer b = a.length/2;
            Integer c = (a[b] + a[b-1])/2;
            System.out.println(c);


























        }

}
}