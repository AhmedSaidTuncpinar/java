package interview;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[]args) {
       //Type code to reverse a string like Mike=>ekiM
        String myWife= "Aysel";
        String m= "";
        for (int i=myWife.length()-1; i>=0; i--){
            char ch= myWife.charAt(i);
            m= m + ch;
        }
        System.out.println(m);




        //Reverse a String

        String ala= "Abdulhamit";
        String bala= "";
        for (int i=ala.length()-1; i>=0; i--){
            char kala= ala.charAt(i);
            bala= bala + kala;
        }
        System.out.println(bala);










        //Reverse a String
        String x= "Velinimet";
        String y= "";
        for (int i=x.length()-1; i>=0; i--){
            char z= x.charAt(i);
            y= y + z;
        }
        System.out.println(y);






        //Reverse a String

        String str= "Cekoslovakyalılaştıramadıklarımızdanmısınız";
        String str1= "";
        for (int i= str.length()-1; i>=0; i--){
            char chr= str.charAt(i);
            str1= str1 + chr;
        }
        System.out.println(str1);





        //Reverse a String
        String eng= "Approximately";
        String frn= "";
        for (int i=eng.length()-1; i>=0; i--){
            char lrn= eng.charAt(i);
            frn= frn + lrn;
        }
        System.out.println(frn);





        //Reverse a String

        String ast= "Formidable";
        String aks= "";
        for (int i= ast.length()-1; i>=0; i--){
            char mrs= ast.charAt(i);
            aks= aks + mrs;
        }
        System.out.println(aks);


        //Reverse a string
        String bmx= "Spectaculer";
        String smx= "";
        for (int i=bmx.length()-1; i>=0; i--){
            char px= bmx.charAt(i);
            smx= smx+ px;
        }
        System.out.println(smx);



        //Reverse a string
        String acx= "Maxime";
        String acy= "";
        for (int i=acx.length()-1; i>=0; i--){
            char chx= acx.charAt(i);
            acy= acy + chx;
        }
        System.out.println(acy);






        //Reverse a string
        String mine= "Ahmed Said Tuncpinar";
        String min= "";
        for (int i=mine.length()-1; i>=0; i--){
            char chars= mine.charAt(i);
            min= min + chars;
        }
        System.out.println(min);


        System.out.println();

        //Reverse a string
        String ahm= "Ayna";
        String abm= "";
        for (int i=ahm.length()-1; i>=0; i--){
            char cx= ahm.charAt(i);
            abm= abm + cx;
        }
        System.out.println(abm);


        //Reverse a string on the console.
        String astu= "Ahmet Sait Tuncpinar";
        String as= "";
        for (int i= astu.length()-1; i>=0; i--){
            char asx= astu.charAt(i);
            as= as + asx;
        }
        System.out.println(as);

        System.out.println();

        //Reverse a string
        String ays= "Aysel Kanmaz";
        String knz= "";
        for (int i=ays.length()-1; i>=0; i--){
            char cz= ays.charAt(i);
            knz= knz + cz;
        }
        System.out.println(knz);


        System.out.println();

        //Reverse a string
        String ak= "Riza Rabiye";
        String ka= "";
        for (int i= ak.length()-1; i>=0; i--){
            char ck= ak.charAt(i);
            ka= ka + ck;
        }
        System.out.println(ka);




        //Reverse a string

        String aix= "Bournazakis";
        String bix= "";
        for (int i=aix.length()-1; i>=0; i--){
            char zix= aix.charAt(i);
            bix = bix + zix;
        }
        System.out.println(bix);


        System.out.println();




        //Reverse a string
        String tix= "Konstantinos";
        String siz= "";
        for (int i=tix.length()-1; i>=0; i--){
            char uix= tix.charAt(i);
            siz = siz + uix;
        }
        System.out.println(siz);





        System.out.println();
        //Reverse a string
        String rvrs= "reverse";
        String bvrs= "";
        for (int i= rvrs.length()-1; i>=0; i--){
            char cvrs= rvrs.charAt(i);
            bvrs= bvrs + cvrs;
        }
        System.out.println(bvrs);


        System.out.println();












        //Reverse a String
        String a= "string";
        String b= "";

        for (int i=a.length()-1; i>=0; i--){
            char c= a.charAt(i);
            b= b + c;
        }
        System.out.println(b);


        System.out.println();



        //Reverse a string
        String t= "Kalimera";
        String s= "";
        for (int i=t.length()-1; i>=0; i--){
            char e= t.charAt(i);
            s= s + e;
        }
        System.out.println(s);


        System.out.println();

        String rmd= "Ramadan";
        String bmd= "";
        for (int i= rmd.length()-1; i>=0; i--){
            char cmd= rmd.charAt(i);
            bmd= bmd + cmd;
        }
        System.out.println(bmd);

        System.out.println();

        String am;
        String bm= "";
        //Ask user a string to reverse it
        Scanner input= new Scanner(System.in);
        System.out.println("Input a String to reverse");
        am=input.nextLine();

        for (int i=am.length()-1; i>=0; i--){
            char cm= am.charAt(i);
            bm= bm + cm;
        }
        System.out.println(bm);
    }
}
