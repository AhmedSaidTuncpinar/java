package day07stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {


        //Example 1: Type code to see the order number of the first occurance of the character 'a'
        // "I want to learn Java"

        String str= "I like to learn Java";
        int idx = str.indexOf('a');  // indexof () method gives you the index of first occurance of a specific character.
        System.out.println(idx +1);


        //Example 1: Type code to see the order number of the first occurance of the character 'Java'
        // "I want to learn Java, learn java, earn money, java is easy"

        String s = "I want to learn Java, learn java, earn money, java is easy";
        //Note 1: indexof() method can be used with char and string data types like str.indexOf('a') and s.indexOf("Java")
        //Note 2: If you use String inside the indexof(), it will return the index of the first character.
        // s.indexOf("Java") returns the index of "J"
        // Note 3: s.indexof("xyz"); ==> -1, indexof () method returns "-1" for non existing characters.
        int i = s.indexOf("Java");
        System.out.println(i +1);

        int t= s.indexOf('W');
        System.out.println(t);

        //Example 3: Type code to check if a String has 'a' in it or not. Print appropriate messages for the scenarios.
    //1. way:
        String word = "I like to study";
        if (word.indexOf('a')==-1){
            System.out.println("There is no 'a'");
        }else{
            System.out.println("There is 'a'");
        }
        //2. way:
        String result = word.indexOf('a')==-1 ? "There no a":"There is a";
        System.out.println(result);

        //Example 4. Type code to find the order number of last occurrence of "Java" in a sentence
        String r = "I want to learn Java, learn java, earn money, java is easy.";
        int f = r.lastIndexOf("Java");
        System.out.println(f);
        // An interview question for Mr. Suleyman with EBAY.
 //example 5 Type code to check if a character is unique in a String or not. "Hello" H is unique, e is unique,
        // o is unique.

        String m= "Hello";
        //1. way.
        if(m.indexOf('l')==m.lastIndexOf('l')){
            System.out.println("The character is unique");
        }else{
            System.out.println("The character is not unique");
        }
            // 2. Way
        String res = m.indexOf('H')==-1 ? "The character does not exist" : (m.indexOf('l')==m.lastIndexOf('l') ? "The character is unique" : "The character is not unique");
        System.out.println(res);

        }

    }


