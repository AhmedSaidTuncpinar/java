package Practice;

public class StringManipulations0102 {

    public static void main(String[] args) {

    /*

    Create a String variable for city names which have just a single word.
    Print the city name with the initial is in uppercase and all the other characters with lower cases.
    */
        String city = "tokyo";
        System.out.println(city.replace("t", "T"));


        /*

        Create 3 String variables for people's names.
        Print the sum of the number of characters in all the 3 names except space characters.
        Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.
         */
        //1. Way
        String name1= "Ali Can", name2= "Mustafa Yilmaz", name3 = "Ahmed Pinar";
        String nameA= name1.replaceAll(" ", "");
        String nameM= name2.replaceAll(" ", "");
        String nameP= name3.replaceAll(" ", "");

        int result = (nameA + nameM + nameP).length();
        System.out.println(result);

        //2.Way
        String nam1= "Ali Can", nam2= "Mustafa Yilmaz", nam3 = "Ahmed Pinar";
        String namC= nam1.replaceAll("\\s", "");
        String namY = nam2.replaceAll("\\s", "");
        String namP = nam3.replaceAll("\\s","");
        int result1 = (namC+namY+namP).length();
        System.out.println(result1);

    }
}
