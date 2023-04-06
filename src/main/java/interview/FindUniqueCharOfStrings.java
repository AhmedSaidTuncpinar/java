package interview;

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
    }
}

