package studysessiongroup;

public class Meeting07_Q03 {

    public static void main(String []args){


        //Create an integer multidimensional array then find the sum of the elements.

        int brr[][] = { {12, 54}, {3, 2, 7}, {21} };
        int sum1 = 0;

        for(int[] w: brr){
            for(int u : w){
                sum1 = sum1 + u;
            }
        }
        System.out.println(sum1);
    }
    }

