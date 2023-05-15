package interview;

import java.util.Scanner;

public class FindUniqueCharOfStrings {
    public static void main(String[]args){
        //Find the unique characters in a string value.
     String str= "Ohlala";
     for (int i=0; i<str.length(); i++)
         if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
             System.out.print(str.charAt(i));
         }










     //Find the unique characters in a string
        String sdr= "Kanmaz";
     for (int i=0; i<sdr.length(); i++){
         if (sdr.indexOf(sdr.charAt(i))==sdr.lastIndexOf(sdr.charAt(i))){
             System.out.print(sdr.charAt(i));
         }
     }


        System.out.println();

     //Find the unique characters of a string
        String sbr= "Cemaleddin";
     for (int i=0; i<sbr.length(); i++){
         if (sbr.indexOf(sbr.charAt(i))==sbr.lastIndexOf(sbr.charAt(i))){
             System.out.print(sbr.charAt(i));
         }
     }


        System.out.println();


        System.out.println();

     /*Find the unique characters in a string
     indexOf method gives you the index of first occurrence a specific character.
     charAt method gives you a character by using index
     lastIndexOf method gives you the last occurrence of a specified index in a string
      */
        //

        String sqr= "caddelerde";
        for (int i=0; i<sqr.length(); i++){
            if (sqr.indexOf(sqr.charAt(i))==sqr.lastIndexOf(sqr.charAt(i))){
                System.out.print(sqr.charAt(i));
            }
        }


        System.out.println();


        //Print unique characters in a String.
        String sdk= "Danışman";
        for (int i=0; i<sdk.length(); i++){
            if (sdk.indexOf(sdk.charAt(i))==sdk.lastIndexOf(sdk.charAt(i))){
                System.out.print(sdk.charAt(i));
            }
        }

        System.out.println();
        //Find unique characters of a string
        String uni= "incredible";
        for (int i=0; i<uni.length(); i++ ){
            if (uni.indexOf(uni.charAt(i))==uni.lastIndexOf(uni.charAt(i))){
                System.out.print(uni.charAt(i));
            }

        }

        System.out.println();

        //Find the unique characters in a string
        String unique= "spectacular";
        for (int i=0; i<unique.length(); i++){
            if (unique.indexOf(unique.charAt(i))==unique.lastIndexOf(unique.charAt(i))){
                System.out.print(unique.charAt(i));
            }
        }


        System.out.println();
        //Find unique characters in a string
        String ast= "Repositories";
        for (int i=0; i<ast.length(); i++){
            if (ast.indexOf(ast.charAt(i))==ast.lastIndexOf(ast.charAt(i))){
                System.out.print(ast.charAt(i));
            }
        }

        System.out.println();
        //Find unique characters in a string
        String unim= "hellowork";
        for (int i=0; i<unim.length(); i++){
            if (unim.indexOf(unim.charAt(i))==unim.lastIndexOf(unim.charAt(i))){
                System.out.print(unim.charAt(i));
            }
        }


        System.out.println();

        //Find unique characters in a string
        String rmd= "ramadan";
        for (int i=0; i<rmd.length(); i++){
            if (rmd.indexOf(rmd.charAt(i))==rmd.lastIndexOf(rmd.charAt(i))){
                System.out.print(rmd.charAt(i));
            }
        }
        System.out.println();
        //Find unique characters in a given string
        String ays= "";
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string to find unique characters in it");
        ays=input.nextLine();
        for (int i=0; i<ays.length(); i++){
            if (ays.indexOf(ays.charAt(i))==ays.lastIndexOf(ays.charAt(i))){
                System.out.print(ays.charAt(i));
            }
        }
    }
}

