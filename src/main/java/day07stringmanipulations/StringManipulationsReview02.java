package day07stringmanipulations;

public class StringManipulationsReview02 {
    public static void main(String[] args) {

        //Example 1: Type code to see the order number of the first occurance of the character 'a'
        // "I want to learn Java"

        String str = "I am learning java";
        int order = str.indexOf('a');
        System.out.println(order +1);

        //Example 1: Type code to see the order number of the first occurance of the character 'Java'
        // "I want to learn Java, learn java, earn money, java is easy"

        String s= "I want to learn java, learn java, earn money, java is easy";
        int i= s.indexOf("java");
        System.out.println(i +1);

        int x = s.indexOf("easy");
        System.out.println(x);

        //Example 3: Type code to check if a String has 'a' in it or not. Print appropriate messages for the scenarios.

        String y= "I like to study java";
        if (y.indexOf("a")==-1){
        System.out.println("There is no a");
    }else{
            System.out.println("There is a");
}

        String result = (y.indexOf("a")==-1) ? "There is no a" : "There is a";
        System.out.println(result);

        //Example 4. Type code to find the order number of last occurrence of "Java" in a sentence

        String occurence = "I want to learn Java, learn java, earn money, java is easy.";
        int o = occurence.lastIndexOf("java");
        System.out.println(o);

        // An interview question for Mr. Suleyman with EBAY.
        //example 5: Type code to check if a character is unique in a String or not. "Hello" H is unique, e is unique,
        // o is unique.

        String uniqe = "Hello";
        String res= uniqe.indexOf('h')==-1 ? "The character is not exist" : (uniqe.indexOf('l')==uniqe.lastIndexOf('l')) ? "The character is unique" : "The character is not unique";
        System.out.println(res);
    }
}