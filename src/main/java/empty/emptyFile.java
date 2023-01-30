package empty;

import java.util.ArrayList;
import java.util.List;

public class emptyFile {

    public static void main(String[] args) {


        List<Integer> e = new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);


        System.out.println(e.remove(2));
        System.out.println(e.remove("432"));


        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        int arr[] = new int[5];
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for (int i = 1; i <= arr.length; i++) {
            list1.add(i); }
        System.out.println(list1);


        ArrayList<Character> list2 = new ArrayList<Character>(); for (char i = 'a'; i <= 'e' ; i++) {
            list2.clear();
            list2.add(i); }
        System.out.println(list2);


        List<Integer> list3 = new ArrayList<>();
        list3.add(3); list3.add(5); list3.add(7); list3.add(9);
        int i = 0;
        int x = 0; while(i<list3.size()) {
            x = x + list3.get(i);
            i++; }
        System.out.println(x);


        int arr1[] = {2, 4, 6, 8};
        List<Integer> list4 = new ArrayList<>();
        int k = 0;
        do { list4.add(arr1[k]); k++;
        } while (k < arr1.length);
        System.out.println(list4);

        //Create a String list whose elements are A, C, E, and F. Print it on the console.

        List<Character> myChar=new ArrayList<>();
        myChar.add('A');
        myChar.add('C');
        myChar.add('E');
        myChar.add('F');
        myChar.add('G');
        myChar.add('H');
        myChar.add('F');
        myChar.add('T');
        myChar.add('F');


        System.out.println(myChar);

        //By using add() with index method, add B into the 1st index.
        //List elements should be like A, B, C, E, and F. Print it on the console

        myChar.add(1,'B');
        System.out.println(myChar);

        //By using set() method, convert E to D.
        //List elements should be like A, B, C, D, and F. Print it on the console
        myChar.set(3, 'D');
        System.out.println(myChar);

        //By using remove() method, remove F from the list.
        //List elements should be like A, B, C, D. Print it on the console

        myChar.remove(Character.valueOf('F'));
        System.out.println(myChar);

        List<Character> yourChar=new ArrayList<>();
        yourChar.add('F');

        myChar.removeAll(yourChar);
        System.out.println(myChar);


        List<Character> x1=new ArrayList<>();
        x1.add('A');
        x1.add('C');
        x1.add('E');
        x1.add('F');
        x1.add('G');

        List<Character> y= new ArrayList<>();
        y.add('H');
        y.add('F');
        y.add('T');
        y.add('F');


        x1.addAll(y);
        System.out.println(x1);

        x1.addAll(1, y);
        System.out.println(x1);

        System.out.println(x1.size());
        System.out.println(y.size());

       // Type code to make all elements in a List unique
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> ax= new ArrayList<>();
        ax.add(2);
        ax.add(3);
        ax.add(2);
        ax.add(2);
        ax.add(5);

        System.out.println(ax);

       List<Integer> ay= new ArrayList<>();

       for (Integer w: ax){

           if (!ay.contains(w)){
               ay.add(w);
           }
           System.out.println(ay);
       }

    }
    }

