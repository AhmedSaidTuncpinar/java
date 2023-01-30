package studysessiongroup;

import java.util.Arrays;
import java.util.List;

public class Empty01 {

    public static void main(String[] args) {

        //Find the multiplication of all odd list elements in an integer list

        List<Integer> arr= Arrays.asList(3,5,8,9,13,12,14,7);
        int sum=1;

        for (Integer w: arr){

            if (w%2!=1){

                sum=sum *w;
            }else {
                continue;
            }
        }
        System.out.println(sum);
    }
}
