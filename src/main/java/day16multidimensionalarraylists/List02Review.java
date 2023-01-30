package day16multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class List02Review {

    public static void main(String[] args) {

        List<String> a= new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        a.remove("Shoes");
        System.out.println(a);

        List<String> b= new ArrayList<>();
        b.add("Shoes");
        b.add("TV");
        b.add("Radio");
        b.add("Laptop");
        b.add("Shoes");
        b.add("Book");
        b.add("Shoes");

        List<String> c= new ArrayList<>();
        c.add("Shoes");
        b.removeAll(c);
        System.out.println(b);

        List<String> d= new ArrayList<>();
        d.add("Shoes");
        d.add("TV");
        d.add("Radio");
        d.add("Laptop");
        d.add("Shoes");
        d.add("Book");
        d.add("Shoes");

        d.remove(2);
        System.out.println(d);

        //Example 5: Create an Integer list, then remove the first occurrence of 4

        List<Integer> num = new ArrayList<>();
        num.add(11);
        num.add(23);
        num.add(18);
        num.add(44);
        num.add(37);
        System.out.println(num);
        num.remove(Integer.valueOf(11));
        System.out.println(num);

        //Example 6: type code to check if a specific element exists in the list or not.

        List<Integer> num1 = new ArrayList<>();
        num1.add(11);
        num1.add(23);
        num1.add(18);
        num1.add(44);
        num1.add(37);
        System.out.println(num1);

        boolean numy= num1.contains(44);
        System.out.println(numy);

        //Example 7. Type code to change the element at index 1 to 9

        List<Integer> num2 = new ArrayList<>();
        num2.add(11);
        num2.add(23);
        num2.add(18);
        num2.add(44);
        num2.add(37);

        num2.set(0,9);
        System.out.println(num2);
        int i= 10;
        num2.get(i);








    }
}
