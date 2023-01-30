package day16multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class List02 {

    public static void main(String[] args) {

        //Example 1. Type  code to remove the first occurance of a specific element from a string list

        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"]

        // To remove first occurance, java created a method which is remove()

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

        //Example 2. Type  code to remove the all occurance of a specific element from a string list

        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"]
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

        //Example 3. Type code to remove an element at a specific index.
        //["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"] remove 5th element

        List<String> d= new ArrayList<>();
        d.add("Shoes");
        d.add("TV");
        d.add("Radio");
        d.add("Laptop");
        d.add("Shoes");
        d.add("Book");
        d.add("Shoes");

        d.remove(4);
        System.out.println(d);
        //example 4: create an integer list, then remove the forth element from the list

        List<Integer> e = new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);



        System.out.println(e.remove(2));
        System.out.println(e.remove("432"));


        //Example 5: Create an Integer list, then remove the first occurrence of 4
        List<Integer> f = new ArrayList<>();
        f.add(12);
        f.add(4);
        f.add(13);
        f.add(25);
        f.add(432);

        f.remove(Integer.valueOf(4));
        System.out.println(f);
        //Note: If you use Integer List element directly inside the remove() method like remove(4),
        // Java will accept it as index,
        // Because indexes are primitive integers, when you put 4,
        // it will be accepted as primitive and it will be index.
        //Lists use non-primitives as list elements, therefore you have to convert primitive int to Integer.
        //To do that, use valueOf() method from Integer wrapper class

        // You will see valueOf() method in many classes.
        // valueOf() method changes the data type wihtout changint the value

        //Example 6: type code to check if a specific element exists in the list or not.

        List<Double> g = new ArrayList<>();
        g.add(12.99);
        g.add(5.02);
        g.add(11.23);

       boolean isExist = g.contains(5.02);
        System.out.println(isExist);

        //Example 7. Type code to change the element at index 1 to 9.99

        List<Double> h = new ArrayList<>();
        h.add(12.99);
        h.add(5.02);
        h.add(11.23);
        System.out.println(h);
        h.set(1, 9.99);//Set() method is for updating an element by using index.

        System.out.println(h);

        //Example 8. Type code to increase the all salaries in an Integer list 10%

         // [5000, 6000, 4500, 3900, 7200]

        List<Double> salary = new ArrayList<>();
        salary.add(5000.0);
        salary.add(6000.0);
        salary.add(4500.0);
        salary.add(3900.0);
        salary.add(7200.0);
        System.out.println(salary);
        for (int i=0; i<salary.size(); i++ ){
            salary.set(i, salary.get(i)*1.1);
        }
        System.out.println(salary);

        //How to check if 2 lists are same or not...
        List<Character> m= new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n= new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
        // equals() method checks if the same elements are in the same position.
        // if same elements are in the same position, equals() method returns true, otherwise it returns false.
        if (m.equals(n)){
            System.out.println("The lists are same");
        }else{
            System.out.println("The lists are not same");
        }

        //How to check if a list contains multiple elements
        //[12, 23, 32, 14, 24, 56] ==> Check if the list has 23, 56, and 24
        List<Integer> p = new ArrayList<>();
        p.add(12);
        p.add(23);
        p.add(32);
        p.add(14);
        p.add(24);
        p.add(56);

        List<Integer> q = new ArrayList<>();
        q.add(23);
        q.add(56);
        q.add(24);

        //containsAll() method returns "true" if all elements exist, anyone of them does not exist it returns "false"
        boolean areExist = p.containsAll(q);

        System.out.println(areExist);//false



    }
}
