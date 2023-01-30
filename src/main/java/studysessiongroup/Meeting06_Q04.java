package studysessiongroup;

public class Meeting06_Q04 {

    public static void main(String[] args) {



        //Q04. Ask user to enter 2 numbers  then swap them
        // a = 12; and b= 13; ==> a=13; and b=12;


        //1. way: we used third variable
        int a= 12, b=23;
        int temp= 0;
        temp = b;
        b = a;
        a= temp;
        System.out.println(a);
        System.out.println(b);

        //2. way without using third variable
        //1. Step: Create 2 integers variable
        int x = 14, y=25;
        //2. Step: Give a new value to integer y with y-x.
        y = y -x;
        //3. Step: Give a new value to integer x with y +x.
        x= y+ x;
        //4. Step to reach a new value for y, do x-y.
        y= x-y;

        //5. Step: Print the x and y integer with new values.

        System.out.println(x);
        System.out.println(y);


    }
}
