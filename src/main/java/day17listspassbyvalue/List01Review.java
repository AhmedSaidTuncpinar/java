package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class List01Review {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> b = new ArrayList<>();

        for(Integer w : a){
            if(!b.contains(w)){
                b.add(w);
            }
            System.out.println(b);
        }



    }
}
