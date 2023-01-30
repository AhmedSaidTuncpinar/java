package day3typecastingscanner;

public class Typecasting01 {

    public static void main(String[] args) {
        //Example 1: Create 2 integer variables and 1 String variable.
        int i=13, k=21;
        String s = "Tom";
        System.out.println(i+k+s);
        System.out.println(s + i*k );

          /*
                Order of Operations in Math
            1)Calculate the exponential
            2)Do the operations inside the parenthesis
            3)Do multiplications and divisions
            4)Do additions and subtractions
        */

        int result = 3 -2 *  (5 + 2 * 3) / 11;
        System.out.println(result);
        //Type Casting: if you assign a value of one primitive data type to another type it is called type casting.
        /*
            AutoWidening
            Java can put small data types into large data types automatically
            When you put small data type into a large data type, you are widening the small data type
        */

        int  m = 14;
        System.out.println(m);
        double d = m;
        System.out.println(d);

        short age = 28000;
        int newAge = age ;
        System.out.println(newAge);
        byte num1 = 12;
        short num2 = num1;
        System.out.println(num2);

        short num3 = 123;
        int num4 = num3;
        System.out.println(num4);

        int num5 = 456789;
        double num6 = num5;
        System.out.println(num6);

       /*
            Explicit Narrowing
            Java does not put large data types into small data types. it needs to  be as manual.
        */

        int n = 15;
        byte b = (byte)n;
        System.out.println(b);

        long l = 18;
        int x = (int)l;
        System.out.println(x);

        double xy = 88.99;
        float xz = (float)xy;
        System.out.println(xz);

        double duble = 2.99;
        short sort = (short)duble;
        System.out.println(sort);

        byte bit = 4;
        double bet = bit;
        System.out.println(bet);

        short abc1= 21;
        byte cba1 = (byte)abc1;
        System.out.println(cba1);

        int ax1 = 288;
        short ax2 = (short)ax1;
        System.out.println(ax2);

        double ax3 = 2.88;
        int ax4 = (int)ax3;
        System.out.println(ax4);

        float ax5 = 3.23F;
        double ax6 = ax5;
        System.out.println(ax6);

        double ax7 = 3.23;
        float ax8 = (float)ax7;
        System.out.println(ax8);

        int mun1 = 5/2;
        System.out.println(mun1);

        float mun2 = 5f/2f;
        System.out.println(mun2);

        double mun3 = 5d/2d;
        System.out.println(mun3);

        int mun4= 5/3;
        System.out.println(mun4);

        float mun5 = 5f/2f;
        System.out.println(mun5);

        double mun6 = 5d/3d;
        System.out.println(mun6);

    }
}
